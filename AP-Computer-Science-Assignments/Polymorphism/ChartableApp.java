import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * The ChartableApp class is simply a JFrame that holds a ChartPanel
 * Create an ArrayList of Chartable objects and pass it into the constructor
 * in order create the chart. 
 * @author smiller
 *
 */
public class ChartableApp extends JFrame {
	//ArrayList<Chartable> chartables = null;
	ChartPanel cp;

    public ChartableApp(ArrayList<Chartable> c) {
    	cp = new ChartPanel(c);
        initUI();
    }
    
    
    /**
     * Sets up the window appropriately
     */
    private void initUI() {
        
        setTitle("Chart");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container pane = getContentPane();
        pane.add(cp, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
    	ArrayList<Chartable> data = new ArrayList<Chartable>();
    	
    	
        EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
                ChartableApp ex = new ChartableApp(data);
                ex.setVisible(true);
            }
        });
    }
}