import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * The ChartPanel is a simple component that extends JPanel to produce 
 * a bar chart for an ArrayList of Chartable objects. Anything that implements
 * Chartable can have a bar chart created. 
 * @author smiller
 */
public class ChartPanel extends JPanel {
	// pixel margins on left, right, top, bottom of chart
	int x_margin = 35;
	int y_margin = 20;
	int x_label_height = 20;
	int y_label_width;
	
	//list of items to chart
	private ArrayList<Chartable> chartables;

	/**
	 * Constructor that accepts a list of Chartable objects.
	 * @param c the list of Chartables
	 */
	public ChartPanel(ArrayList<Chartable> c) {
		chartables = c;
	}


	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// color of bars
		Color color;
		int chartables_size = chartables.size();
		// adjust x-scale
		if (chartables_size > 0) {
			String y_label = chartables.get(0).getYLabel();
			y_label_width = 8*y_label.length();
			int delta_x = (getWidth()-2*x_margin-y_label_width) / chartables_size;

			// find maximum value to adjust y-scale
			double max_value = 0;
			for (int i = 0; i < chartables_size; i++) {
				if (chartables.get(i).getYValue() > max_value)
					max_value = chartables.get(i).getYValue();
			}

			double y_scale = (getHeight()-2*y_margin-x_label_height) / max_value;
			
			// drawing code
			// draw x and y axis
			g.drawLine(x_margin + y_label_width, 0, x_margin+y_label_width, getHeight());
			
			// draw y-axis values
			for (int i=0;i<=10;i++) {
				double delta_y = max_value/10;
				
				g.drawString(String.valueOf((int)(100*i*delta_y)/100.0), 2+y_label_width, (int)(-i*delta_y*y_scale)+getHeight()-y_margin-x_label_height+5);
			}
			// draw y-axis label
			g.drawString(y_label, 5, getHeight()/2);

			// loop through the chartable objects and draw the chart
			for (int i = 0; i < chartables_size; i++) {
				Chartable c = chartables.get(i);
				g.setColor(Color.BLACK);
				// draw x-axis label
				String x_label = c.getXLabel();
				g.drawString(x_label, i*delta_x + y_label_width + x_margin+(int)(.5*delta_x)-(int)(.5*x_label.length()*8), getHeight()-y_margin);
				
				// draw rectangle for data
				// set the rectangle color to something different
				color = new Color(((i+1)*51)%250,((i+1)*13)%250,((i+1)*103)%250);
				g.setColor(color);
				int height = (int) (c.getYValue() * y_scale);
				g.fillRect(i * delta_x + x_margin + y_label_width, getHeight()-height-y_margin-x_label_height, delta_x, height);
			}
		}
	}
}