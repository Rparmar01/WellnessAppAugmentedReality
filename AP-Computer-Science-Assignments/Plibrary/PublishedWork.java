
/**
 * Write a description of class PublishedWork here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class PublishedWork
{
    // instance variables - replace the example below with your own
    private String title;
    private String publisher;
     private String pubDate;
    /**
     * Constructor for objects of class PublishedWork
     */
    public PublishedWork()
    {
        // initialise instance variables
       
    }
       public String getTitle()
  {
      return this.title;
       
    }
    public void setTitle(String a)
    {
        this.title = title;
    }
       public String Publisher()
   {
       return this.publisher;
    }
    public void Publisher(String a)
    {
        this.publisher = a;
    }
        public String PubDate()
  {
      return this.pubDate;
       
    }
    public void PubDate(String a)
    {
        this.pubDate = a;
    }
}
