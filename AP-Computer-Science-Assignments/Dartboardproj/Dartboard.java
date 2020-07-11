
/**
 * Write a description of class Dartboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dartboard
{
    // instance variables - replace the example below with your own
    private int thrown;
    private int hits;

    /**
     * Constructor for objects of class Dartboard
     */
    public Dartboard()
    {
        // initialise instance variables
        thrown = 0;
        hits = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void registerDart(Darts dart)
    {
        // thrown increases dart count, then the next lines retreive where the dart has landed
        thrown++;
        double dartX = dart.getX();
        double dartY = dart.getY();
        //Dart formula:
        double inCircle = (((dartX-0.5)*(dartX-0.5)) + ((dartY-0.5)*(dartY-0.5)));
        if (inCircle <= .25)
        {
            hits++;
        }
    }
    public int getDarts()
    {
        return thrown;
         
}
    public int getHits()
    {
        return hits;
    }
}