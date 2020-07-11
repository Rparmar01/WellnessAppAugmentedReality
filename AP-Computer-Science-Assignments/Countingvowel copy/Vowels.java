
/**
 * Write a description of class Vowels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class  Vowels
{
    // instance variables - replace the example below with your own
 private int x;
 /**
     * Constructor for objects of class Tester
     */
 public Vowels()
    {
        // initialise instance variables
        x = 0;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static int countVowels(String x)
    {
       int vowelcount = 0;
       for(int i=0; i<x.length();i++)
       {
           if (x.charAt(i) == 'a')
            vowelcount++;
            else if(x.charAt(i) == 'e')
            vowelcount++;
            else if(x.charAt(i) == 'i')
            vowelcount++;
            else if(x.charAt(i) == 'o')
            vowelcount++;
            else if(x.charAt(i) == 'u')
            vowelcount++;
            else if(x.charAt(i) == 'y')
            vowelcount++;
            
      
 }
 return vowelcount; 
 }
}
