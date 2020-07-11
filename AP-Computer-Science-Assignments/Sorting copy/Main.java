
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        x = 0;
    }

    public static void main(String[] args)
    {
        //City c1 = "Chicago";
        //City c2 = "Detroit";
        //c1.compareTo(c2);
        City c1 = new City("Chicago", "USA", 120931);
        
        City c2 = new City("Detroit", "USA", 10234123);
        if( c1.compareTo(c2) > 0 )
            System.out.print("c1 is greater than c2");
        else if( c1.compareTo(c2) == 0)
            System.out.print("c1 is equal to c2");
        else
            System.out.print("c1 is less than c2"); 
    
        
        
    }

}
