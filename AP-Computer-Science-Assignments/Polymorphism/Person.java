
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person implements Chartable 
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;
    private String gender;
    private int height;
    /**
     * Constructor for objects of class Person
     */
    public Person()
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
