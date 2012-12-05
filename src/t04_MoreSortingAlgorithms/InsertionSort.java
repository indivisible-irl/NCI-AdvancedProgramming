package t04_MoreSortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args)
	{
		int[] array = new int[] {2,5,3,8,5,9,1,0,4};
		array = insertionSort(array);
	}
	
	public static int[] insertionSort(int[] array)
	{
		for (int i=1; i<array.length; i++)
		{
			int position = i;
			int keyElement = array[i];
			while (position > 0 && array[i-1] > keyElement)
			{
				array[position] = array[position-1];
				position--;
			}
			System.out.println(i +": "+ Arrays.toString(array));
		}
		System.out.println("final: "+ Arrays.toString(array));
		return array;
	}

}
