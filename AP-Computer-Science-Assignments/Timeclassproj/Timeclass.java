
/**
 * Write a description of class Timeclass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timeclass
{
    // instance variables - replace the example below with your own
    private int min;
    private int hours;
    /**
     * Constructor for objects of class Timeclass
     * Pre-condition : h is between 1 and 12, m is between 0 and 59 inclusive
     */
    public Timeclass(int h, int m)
    {
        // initialise instance variables
        min = m;
        hours = h;
    }
    
    public int getHours() {
        return hours;
    }
    public int getMin() {
        return min;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int findDifference(Timeclass other)
    {
        int min1 = 60*hours + min;
        int min2 = 60*other.getHours() + other.getMin();
        return Math.abs(min1 - min2);
        
        
        
    }
    //return: toString() method that returns itself,  two time values
    public String toString()
    {
        String ampm = "AM";
        int h = hours%12;
        if (h == 0)
            h = 12;
        if (hours > 11) 
            ampm = "PM";
        

        /*if (min<720) System.out.println("AM");
        else if (min>=720) System.out.println("PM");
        else if (min<=2400) System.out.println("PM");
        */
        return "" + h + ":" + min + ampm;
    }
    
    public static void main(String[] args)
    {
        Timeclass t1 = new Timeclass(12, 50);
        Timeclass t2 = new Timeclass(15, 50);    
        
      
        //System.out.println()
        
        System.out.println("The time is" + " " + t1);
        System.out.println("The time is" + " " + t2);
        System.out.println(t1.findDifference(t2));
        

       
        
        
    }
}
