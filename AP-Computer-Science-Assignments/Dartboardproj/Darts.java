
/**
 * Write a description of class Darts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class Darts
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    private Random rand;

    /**
     * Constructor for objects of class Darts
     */
    public Darts()
    {
        // initialise instance variables
        x = -1.0;
        y = -1.0;
        rand = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void toss()
    {
        // randomizes darts' positio
        double randX = rand.nextDouble();
        double randY = rand.nextDouble();
        x = randX;
        y = randY;
        
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
}
