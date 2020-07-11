
/**
 * Write a description of class Month here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Month implements Chartable
{
    // instance variables - replace the example below with your own
    private String name;
    private int days;
    private int average_temperature;

    
    public double getYValue()
    {
        return 0.3;
    }
	public String getXLabel()
	{
	    return "";
	   }
	public String getYLabel()
	{
	    return "yl";
	   }
}
