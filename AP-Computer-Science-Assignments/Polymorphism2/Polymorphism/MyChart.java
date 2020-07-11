 import java.util.ArrayList;
 import java.util.Iterator;
/**
 * Write a description of class MyChart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyChart
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MyChart
     */
    public MyChart()
    {
        // initialise instance variables
         ArrayList<Food> myFood = new ArrayList<Food>();
     Food f1 = new Food("Pie", "700", 5);
     Food f2 = new Food("IceCream", "250", 3);
     Food f3 = new Food("FrenchFries", "600", 4);
     
     myFood.add(f1);
     myFood.add(f2);
     myFood.add(f3);
     
     //ck1.checkout("Bob", "1-NOV-2012");
     //ck2.checkin();
     //ck3.checkout("Peter", "12-Jan-2016");;
     ChartableApp(myFood);
     System.out.println(f1.getName());
     System.out.println(f2.getName());
     System.out.println(f3.getName());
     Iterator<Food> ia = myFood.iterator();
     while(ia.hasNext())
     {
      Food f = ia.next(); 
     System.out.println(f.getXLabel());
     }
    }

}
