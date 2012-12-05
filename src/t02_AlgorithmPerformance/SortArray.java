/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package t02_AlgorithmPerformance;
import java.util.*;
/**
 *
 * @author DavidA
 */
public class SortArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    	int runs = Integer.MAX_VALUE;

        //*--------------------------------------------
    	// put lots of data into the collection
    	// this puts all the fruits in 100 times
    	//*--------------------------------------------

    	ArrayList<String> aList = new ArrayList<String>();
    	for (int i = 0; i < 500 ; i ++ )
    	{
    		aList.add("Papaya     ");
    		aList.add("Orange    ");
    		aList.add("Grape     ");
    		aList.add("Pineapple ");
    		aList.add("Lemon     ");
    		aList.add("Strawberry");
    		aList.add("Kiwi      ");
    		aList.add("Nectarine ");
    		aList.add("Melon     ");
    		aList.add("Raspberry ");
    		aList.add("Apple     ");
    	}

    	//*--------------------------------------------
    	// Shuffle the collection  before sorting it
    	//*--------------------------------------------
    	//Collections.shuffle(aList);

    	//*--------------------------------------------
    	// find out the time before starting the sort
    	//*--------------------------------------------
    	long startTime = System.currentTimeMillis();

    	//*--------------------------------------------
    	// execute the sort by calling the sort method
    	//*--------------------------------------------
    	//Collections.sort(aList);
    	for (int i=Integer.MIN_VALUE; i<Integer.MAX_VALUE; i++)
    		lt();

    	//*--------------------------------------------
    	// find out the time when the sort is complete
    	//*--------------------------------------------
    	long endTime = System.currentTimeMillis();


    	//*--------------------------------------------
    	// calculate the elapsed time and print a message
    	//*--------------------------------------------
    	System.out.println("Running for <10 took "  + (endTime - startTime)  + " Milliseconds");

    	startTime = System.currentTimeMillis();

    	//*--------------------------------------------
    	// execute the sort by calling the sort method
    	//*--------------------------------------------
    	//Collections.sort(aList);
    	for (int i=0; i<runs; i++)
    		eq();

    	//*--------------------------------------------
    	// find out the time when the sort is complete
    	//*--------------------------------------------
    	endTime = System.currentTimeMillis();


    	//*--------------------------------------------
    	// calculate the elapsed time and print a message
    	//*--------------------------------------------
    	System.out.println("Running for <=9 took "  + (endTime - startTime)  + " Milliseconds");

    }
    
    @SuppressWarnings("unused")
	public static void lt()
    {
    	boolean whocares;
    	for (int i=Integer.MIN_VALUE; i<Integer.MAX_VALUE; i++)
    	{
    		whocares = i < 10;
    	}
    }
    @SuppressWarnings("unused")
	public static void eq()
    {
    	boolean whocares;
    	for (int i=Integer.MIN_VALUE; i<Integer.MAX_VALUE; i++)
    	{
    		whocares = i <= 9;
    	}
    }

}
