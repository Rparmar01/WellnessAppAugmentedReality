import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Magazine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magazine extends PublishedWork 
{
    // instance variables - replace the example below with your own
    //private String title;
    private String issue;
   // private String publisher;
   // private String pubDate;
    private String genre;
    private int length;
    private List articles;
  
   
   public Magazine()
   {
     //Initialize instance variables
    }
  
      public String Issue()
   {
        return this.issue;
    }
     public void Issue(String a)
   {
       this.issue = a;
    }
    public String Genre()
   {
       return this.genre;
    }
    public void Genre(String a)
    {
        this.genre = a;
    }
    public int Length()
    {
        return this.length;
    }
    public void Length(int a)
    {
        this.length = a;
    }
    /**
     * This method 
     * 
     */
    public List Articles()
   {
        return this.articles;
    }
    public void Articles(List a)
    {
        this.articles = a;
    }
}
