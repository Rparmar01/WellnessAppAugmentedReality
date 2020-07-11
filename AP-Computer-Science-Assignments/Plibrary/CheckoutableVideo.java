
/**
 * Write a description of class CheckoutableVideo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckoutableVideo implements  Checkoutable
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CheckoutableVideo
     */
    public CheckoutableVideo()
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
    public String checkout( String book)
    {
        //String userInfo = System.out.print("enter your name and date");
        //book = System.out.print("enter the book being checked out");
        String name = ""; 
        String date = "";
        return "" + name + " " + date;
        
        
    }
    public boolean isCheckedOut(String bookName)
    {
        if(bookName != "")
        {
            return true;
        }
        return false;
    }
    public void checkin(String name, String date)
    {
        System.out.print("enter your name");  
        System.out.print("enter the date");
        String retinfo = name + " " + date;
        /*if(name = userinfo) 
         * remove(name);
         */
       //name = 1st print: return name
       //date = second print: return date
    }
    public boolean availability(String title)
    {
        if(title == "book" /**the book checked out is not in the domain of this method */)
        {
            return true;
        }
        return false; 
        
    }
    public String whocheckedout(String name)
    {
       if(name == "true")
       {
           /**need to find the person who checked out the book from checkout method */
        }
        return null;
        
    }
    public String datecheckedout(boolean out)
    {
        if(out = true)
        {
            /**same as above, but with date*/
        }
        return null;
    }
    public String dueout(boolean out)
     {
        if(out = true)
        {
             /**same as above, but with date*/
        }
        return null;
      }
}
