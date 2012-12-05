package t03_SortingAlgorithms;


public class BubbleSort
{

	public static void main(String[] args) {
		int[] array = { 23, 2, 67, 5, 3 };
		printArray(sortArray(array), 0);
	}
	
	// example from lecture:
	// 2, 23, 5, 3, 67
	// 2, 5, 3, 23, 67
	// 2, 3, 5, 23, 67
	
	public static int[] sortArray(int[] array)
	{
		
		int count = 0;
		
		while (true)
		{
			boolean noSwap = true;
			int temp;
			for (int i=1; i<array.length; i++)
			{
				if (array[i] < array[i-1])
				{
					temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
					noSwap = false;
				}
			}
			
			printArray(array, count++);
			
			if (noSwap)
				break;
		}
		
		return array;
	}
	
	/**
	 * Print an integer array
	 * @param array
	 * @param count
	 */
	public static void printArray(int[] array, int count)
	{
		System.out.print(count+ ": [ ");
		for (int i=0; i<array.length-1; i++)
		{
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length-1] + " ]");
		
	}

}
