package t04_MoreSortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		//splitArray(new int[] {1,2,3,4,5,6,7,8});
	}
	
	public static int[] mergeSort(int[] array)
	{
		
		//TODO finish
		return new int[0];
	}

	
	
	
	
	public static void splitArray(int[] array)
	{
		int[] array1 = Arrays.copyOfRange(array, 0, array.length/2);
		int[] array2 = Arrays.copyOfRange(array, array.length/2, array.length);
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		
	}
}
