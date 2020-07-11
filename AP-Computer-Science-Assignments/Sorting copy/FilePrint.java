import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
public class FilePrint
{
    public static void main(String[] args) throws IOException
    {
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