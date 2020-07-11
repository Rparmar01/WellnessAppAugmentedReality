
/**
 * Write a description of class Checkoutable here.
 * This i   s an interface. It is supposed to:
* 1) check out: provide a person's name and a date both as strings
  2) check in
  3) tell if it is available (checked out or not): returns a boolean
  4) tell who has it checked out if it is checked out
  5) tell the date when it was checked out if it is checked out
  6) tell when it is due if it is checked out
 */
public interface Checkoutable
{
     public String checkout(String book);
     public void checkin(String name, String date);
     public boolean isCheckedOut(String bookName);
     public boolean availability(String title);
     public String whocheckedout(String name);
     public String datecheckedout(boolean out);
     public String dueout(boolean out);
      
     //String name();
     //   String date();
      //  boolean availability();
     // String whocheckedout();
     // String due();
       //String checkit();
       
}
