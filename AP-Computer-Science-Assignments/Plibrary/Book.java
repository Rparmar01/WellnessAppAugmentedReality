import java.util.ArrayList;
/**
 * Ritik Parmar
 * 
 */
public class Book extends PublishedWork 
{

    // instance variables - replace the example below with your own
    /**This creates an author variable*/
   // private String title;
    private String author;
    //private String publisher;
    //private String pubDate;
    private String genre;
    private int length;

     public String getAuthor()
  {
      return this.author;
      
    }
    public void setAuthor(String a)
    {
        this.author = a;
    }
   
    public String Genre()
   {
        return this.genre;
   }
       public void Genre(String a)
       {
           this.genre = a;
        }
   /**
     * This method 
     * 
     */
    public int Length()
   {
        return this.length; 
    }
        public void Length(int a)
        {
            this.length = a;
        }
}
