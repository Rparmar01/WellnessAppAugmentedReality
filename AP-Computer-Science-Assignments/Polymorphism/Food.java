
/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food implements Chartable
{
    // instance variables - replace the example below with your own
    private String name;
    private String calories;
    private int price; 
    /**
     * Constructor for objects of class Food
     */
    public Food()
    {
        // initialise instance variables
        x = 0;
    }
    public double getYValue();
	public String getXLabel();
	public String getYLabel();
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
