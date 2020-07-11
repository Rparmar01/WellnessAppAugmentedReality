
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
    private int calories;
    private double price; 
    /**
     * Constructor for objects of class Food
     */
    public Food(String nam, String cals, int prc)
    {
       name = nam;
       calories = cals;
       price = prc;
    }
  
    
    public double getYValue()
    {
        return price;
    }
    public void setYValue(double a)
    {
        this.price = a;     
    }
    public String getXLabel()
    {
        return this.name;
       }
       public void setXLabel(String a)
    {
        return name;     
    }
    public String setYLabel()
    {
        return "Calories";
       }
       
}
