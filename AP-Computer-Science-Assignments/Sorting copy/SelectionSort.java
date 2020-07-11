import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.io.IOException;
/**
 * Write a description of class SelectionSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectionSort
{
  public static void selectionSort(ArrayList<Comparable> list)
  {
      for (int j = 0; j < list.size() - 1; j++)
      {
         int element = j;
         for (int i = j + 1; i < list.size(); i++)
         {
            if (list.get(i).compareTo(i+1) < 0)
            {
               element = i;
            }
            else
            {
                
            }
         }
         int frswitch = list[j];
         list[j] = list[element];
         list[element] = temp;
       }
  }
  public static void main(String[] args) throws IOException
    {
      ArrayList<Comparable> cityList = new ArrayList<Comparable>();
      BufferedReader infoBR = new BufferedReader(new FileReader("Cities.txt"));  
      String line = infoBR.readLine();
       while( line != null ) 
      {
            StringTokenizer tokenizer = new StringTokenizer(line);
            String country = tokenizer.nextToken();
            String city = tokenizer.nextToken();
            int population = Integer.parseInt(tokenizer.nextToken());
            // make a new city object and add it to your ArrayList
            line = infoBR.readLine();
      }
    }
}
