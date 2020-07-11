
/**
 * Write a description of class Dartsimapp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dartsimapp
{
   

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args)
    {
        Darts dart = new Darts();
        Dartboard dartboard = new Dartboard();
       
        for(int i=0; i<100; i++)
        {
            dart.toss();
            dartboard.registerDart(dart);
        }
        System.out.println(4*((double)dartboard.getHits()/dartboard.getDarts()));
    }
}
