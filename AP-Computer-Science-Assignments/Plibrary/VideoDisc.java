
/**
 * Write a description of class VideoDisc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VideoDisc extends PublishedWork 
{
    // instance variables - replace the example below with your own
    private String title;
    private int dvd;
    private int bluray;
    private String publisher;
    private String pubDate;
    private int size;
     
    /**
     * Constructor for objects of class VideoDisc
     */
    public VideoDisc()
    {
        // initialise instance variables
      
    }
        public int Dvd()
   {
       return this.dvd;
    }
    public void Dvd(int a)
    {
        this.dvd = a;
    }
        public int Bluray()
   {
       return this.bluray;
    }
    public void Bluray(int a)
    {
        this.bluray = a;
    }
        public int Size()
   {
       return this.size;
    }
    public void Size(int a)
    {
        this.size = a;
    }
    
}
