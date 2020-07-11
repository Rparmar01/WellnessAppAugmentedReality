import java.io.*;
import java.util.*;

/**
 * Sorts a list by quickSort
 * @author Ritik
 *
 *Creates a partition and sets the first element as a pivot, and stores element left
 *of pivot (storelement). Then, iterates through rest of elements. If any element
 *is less than the pivot, swap that element with storelement and move to next element
 *(move index of storelement up one). After the numbers are iterated through, move
 *the partition up one between next two elements.
 * 
 * Comments:  Assume file exists, and all fields on each record is valid!!!!
 * 
 * Problem: Output does not print the elements properly.
 * Question: Can Java 8 use Tokenizers properly? 
 */
public class CityQuickSort
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

            System.out.println( "Got here before quickSort!" );
    
            quickSort( cities ); 
            
            printListOfCities( "After quick sorting by population", cities );
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
    
    private static void quickSort( ArrayList<City> originalList )
    {     
        qSort( originalList, 1, originalList.size()-1 );
    }
    
    private static void qSort( ArrayList<City> originalList, int firstIndex, int lastIndex )
    {
        /*** Local Variables ***/
        
        int pivotIndex = 0;
        
        /*** Base case to stop recursion, when first index is larger or equal to last index ***/
        
        if ( firstIndex >= lastIndex ) 
           return;
           
        /*** Calculate new partition ***/    
        
        pivotIndex = partition( originalList, firstIndex, lastIndex );

        /*** General case -- keep recursion going ***/    
        
        qSort( originalList, firstIndex,     pivotIndex );
        qSort( originalList, pivotIndex + 1, lastIndex  );     
    }
    
    private static int partition( ArrayList<City> originalList, int firstIndex, int lastIndex )
    {
        int  pivotIndex = firstIndex;
        City pivotCity = originalList.get( pivotIndex );
        
        while ( firstIndex < lastIndex )
        {
            if ( ( originalList.get( firstIndex ).compareTo( pivotCity ) == 0 ) ||
                 ( originalList.get( lastIndex  ).compareTo( pivotCity ) == 0 ) )
            {
               System.out.println( "All populations should be unique! " );
               System.exit( 0 );
            }
            
            while ( originalList.get( firstIndex ).compareTo( pivotCity ) < 0 )
                firstIndex++;
                
            while ( originalList.get( lastIndex ).compareTo( pivotCity ) > 0 )
                lastIndex--;
                
            swap( originalList, firstIndex, lastIndex );
        }
                
        return firstIndex;
    }
    
    private static void swap( ArrayList<City> originalList, int fromIndex, int toIndex )
    {
        /*** Local Variables ***/
        
        City fromCity;
        City toCity;
        
        /*** Extract both cities ***/
        
        fromCity = originalList.get( fromIndex );
        toCity   = originalList.get( toIndex );
    
        originalList.set( fromIndex, toCity   );
        originalList.set( toIndex,   fromCity );
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
