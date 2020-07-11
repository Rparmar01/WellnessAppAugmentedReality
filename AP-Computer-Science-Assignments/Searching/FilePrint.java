import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
  public class FilePrint
 {
     /**Ritik Parmar
      * This class goes through scrabble.txt, a list of words, and, using the user's chosen word,
      * iteratees through an array (which has all of these same words added to it) and searches 
       each element at a time. If there is a match, "it is in the list" is printed, otherwise,
       just "reached end of list" is printed*/ 
 public static void main(String[] args) throws IOException
 {
    //File file = new File("scrabble.txt");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your word");
    String str = sc.nextLine();
    BufferedReader infoBR = new BufferedReader(new FileReader("scrabble.txt"));
    ArrayList<String> meh = new ArrayList<String>(); 
    String line = infoBR.readLine();
   while(line != null){
   line = infoBR.readLine();
 
   // add the line to your ArrayList
     meh.add(line);
 }
  for(int n =0; n< meh.size()-1; n++)
 {
    if(meh.get(n).compareTo(str) == 0)
    {
       System.out.println("It is in the list");
     }
     else {}
 }
  System.out.println("Reached end of list");
  }
  }