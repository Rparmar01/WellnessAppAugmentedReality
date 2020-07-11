
/**
 * Write a description of class City here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class City implements Comparable<City>
{
    // instance variables - replace the example below with your own
    private String name;
    private String country;
    private int population;
    /**
     * Constructor for objects of class City
     */
    public City(String name, String country, int population)
    {
        // initialise instance variables
        this.name = name;
        this.country = country;
        this.population = population;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int compareTo(City c2)
    {
        // put your code here
        if(this.population > c2.population)
            return 1;
        else if(this.population == c2.population)
            return 0;
        else 
            return -1;
    }
}
