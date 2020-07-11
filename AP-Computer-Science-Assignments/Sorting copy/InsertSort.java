import java.io.*;
import java.util.*;

/**
 * Sorts a list by selection
 * @author Ritik
 *
 * Comments:  Assume file exists, and all fields on each record is valid!!!!
 */
public class InsertSort
{
   /*** Application ***/
   public static void main( String[] args )
    {
        /*** Local Constants ***/
        
        final String INPUT_FILE = "Cities.txt";
        
        /*** Local Variables ***/
        
        ArrayList<City> cities = null;  
        
        /*** Read text ***/
        
        try
        {
            cities = readFile( INPUT_FILE );
            
            printListOfCities( "Before sorting by population", cities );
            
            insertionSort( cities );
            
            printListOfCities( "After sorting by population", cities );
        }
        catch ( FileNotFoundException e )
        {
            System.out.println( "File: " + INPUT_FILE + " was not found!" );            
        }
        catch ( IOException e )
        {
            System.out.println( "IO ERROR: File: " + INPUT_FILE + " Message: " + e.getMessage() ); 
        }
        
    }
    /**
     * reads the text file
     * @param name the name of the file
     * @throws IOException
     */
    public static ArrayList<City> readFile( String filename ) throws FileNotFoundException,
                                                                     IOException 
    {
        /*** Local Variables ***/
        
        ArrayList<City> listOfCities  = new ArrayList<City>(); 
        BufferedReader inStream = new BufferedReader( new FileReader( filename ) );
        String record = null;
        StringTokenizer tokenizer = null;
        City newCity = null;
        String country = null;
        String city    = null;
        int population = 0;
         
        /*** Attempt to read 1st record to see if any data in file ***/
        
        record = inStream.readLine();
        
        while ( record != null )    //EOF reading textfile
        {          
            tokenizer = new StringTokenizer( record );
            
            /*** Extract each field of record ***/
            
            country    = tokenizer.nextToken();
            city       = tokenizer.nextToken();
            population = Integer.parseInt( tokenizer.nextToken() );
            
            /*** Instantiate new city ***/
            
            newCity = new City( country, city, population );
            
            /*** Add new city to arraylist ***/
            
            listOfCities.add( newCity );
            
            /*** Attempt next read of record to see if any more data in file ***/
            
            record = inStream.readLine();
        }
        
        return listOfCities;
    }
    public static void insertionSort( ArrayList<City> list )
    {
        /***Local Variables***/
        int positionInArrayList = 0;
        City currentCity = null;
        City temp = null;
        int currentIndex = 0;
        for ( int indexLeft = 0; indexLeft<= list.size(); indexLeft++ ) 
        {                
            System.out.print("Went through first loop and index is " + indexLeft);
            temp = list.get( indexLeft );
            for ( int indexRight = 0; indexRight < (list.size() - indexLeft);  indexRight++ ) 
            {
                System.out.print("Went through second loop and index is " + indexRight);
                currentCity = list.get( indexRight );
                if ( temp.compareTo( currentCity ) > 0) 
                { 
                    /*** move currentCity's index to the right by 1 ***/
                    currentIndex = list.lastIndexOf(currentCity);
                    list.set ( currentIndex + 1, currentCity);
                }    
                else
                {
                    list.set( indexLeft, currentCity);
                }
            }
        }
    }
    /**
     * prints the array
     * @param list the list to be printed
     */
    public static void printListOfCities( String id, ArrayList<City> list )
    {
        System.out.println( "\n--- List of cities -- " + id + " ---\n" );
        
        for ( int i = 0; i < list.size(); i++ ) 
        {
            System.out.println( (list.get( i )).toString() );
        }
    }
}