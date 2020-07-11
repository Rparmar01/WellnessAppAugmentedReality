import java.io.*;
import java.util.*;

/**
 * Sorts a list by merge
 * @author Ritik
 *
 *
 * Comments:  Assume file exists, and all fields on each record is valid!!!!
 * 
 */
public class CityMergeSort
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

           System.out.println( "Got here before merge!" );
                        
            /*** Copied code for MergeSort ***/
            
            cities = mergeSort( cities ); 
            
            /*** Not part of copied code ***/
            
            System.out.println( "Got here after merge!" );
            
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
    
    private static ArrayList<City> mergeSort( ArrayList<City> originalList )
    {     
         return mergeSortRecursive( originalList );               
    }
    
    private static ArrayList<City> mergeSortRecursive( ArrayList<City> list )
    {
         /*** Local Variables ***/
         
         ArrayList<City> lowList    = null;
         ArrayList<City> highList   = null;
         
         int begin = 0;
         int end  = list.size();
         int middle = 0;
         
         if ( end - begin > 1 )    // continue recursion
         {     
            middle = (begin +end) / 2;
            
            System.out.println( "Begin: " + begin + " Middle: " + middle + " End: " + end ); 
            
            /*** Copy items in lower half to new list ***/
            
            lowList  = copyList( list, begin, middle );    // copy List from 0 to Middle including middle
            
            /*** Copy items in upper half to new list ***/
            
            highList = copyList( list, middle, end );        //copy list from Middle to end not including middle
            
            /*** Merge lower list ***/
            
            lowList = mergeSortRecursive( lowList );
            
            /*** Merge higher list ***/
            
            highList = mergeSortRecursive( highList );
         
            return mergeList( lowList, highList );      // merges the two sorted lists into one sorted list
        }
        else{
            System.out.println( "End recursion in merge routine! Begin: " + begin + " End: " + end );
            return list;
        }
    }
    
    private static ArrayList<City> mergeList( ArrayList<City> lowList, ArrayList<City> highList )
    {
        /*** Local Varialbes ***/
        
        ArrayList<City> newList = new ArrayList<City>();
        int lowIndex  = 0;
        int highIndex = 0;
        boolean done = false;
        
        System.out.println( "mergeList was called..." );
        
        printListOfCities( "lowList being merged", lowList );        
        printListOfCities( "highList being merged", highList );        
        
        /*** Both lists are already in sorted order ***/
        
        while ( !done )
        {
            /*** Is element in lowerList lower than lowest element in highList ***/
            
            if ( highIndex < highList.size() )
            {
               while ( lowIndex < lowList.size() &&
                     (lowList.get( lowIndex )).compareTo( highList.get( highIndex ) ) <= 0 )
               {
                   newList.add( lowList.get( lowIndex ) );
                   lowIndex++;
               }
            }
            else
               done = true;
               
            if ( !done && lowIndex < lowList.size() )
            {
               while (  highIndex < highList.size() && 
                       (highList.get( highIndex )).compareTo( lowList.get( lowIndex ) ) <= 0 )
               {
                  newList.add( highList.get( highIndex ) );           
                  highIndex++;
               }
            }
            else
               done = true;
        }
        
        while ( lowIndex < lowList.size() )
        {
            newList.add( lowList.get( lowIndex ) );
            lowIndex++;
        }
        
        while ( highIndex < highList.size() )
        {
            newList.add( highList.get( highIndex ) );
            highIndex++;
        }  
        
        printListOfCities( "newList afer mergeing of low and high", newList );  
              
        return newList;
    }
    
    private static ArrayList<City> copyList( ArrayList<City> list, int begin, int end )
    {
        /*** Local Variables ***/
        
        ArrayList<City> newList = new ArrayList<City>();
        int newListIndex = 0;
        
        /*** Copy cities from original to new list ***/
        
        for ( int i = begin; i < end; i++ )
        {
            newList.add( list.get( i ) );
            newListIndex++; 
        }
        
        return newList;
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
        int    population = 0;
         
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
