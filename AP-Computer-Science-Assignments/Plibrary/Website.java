
/**
 * Write a description of class Website here.
 * 
 * @author Ritik Parmar
 * 
 */
public class Website extends PublishedWork 
{
    // instance variables - replace the example below with your own
   // private String title;
    //private String publisher;
   // private String pubDate;
    private String url;
    private String author;
    /**
     * Constructor for objects of class Website
     */
    public Website()
  {
        // initialise instance variables
        // x = 0;
        setUrl ("http://www.google.com");
        String x = getUrl();
        System.out.println(x);
    }
  
  
  
     public String getUrl()
  {
      return this.url;
       
    }
    public void setUrl(String a)
    {
        this.url = a;
    }
     public String getAuthor()
  {
      return this.author;
      
    }
    public void setAuthor(String a)
    {
        this.author = a;
    }
   
}
