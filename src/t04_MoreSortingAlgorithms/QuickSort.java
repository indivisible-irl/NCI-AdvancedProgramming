package t04_MoreSortingAlgorithms;

import java.lang.Math;

public class QuickSort {


	public static void main(String[] args) {

	}
	
	
	public static int[] quickSort(int[] array)
	{
		int pivot = Math.max(array[0], array[array.length-1]);
		pivot = Math.max(pivot, array[array.length/2]);
		
		
		
		return array;
	}

}
