package t08_Exceptions;

public class IndexOutOfBounds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int pos = 6;
		String[] nums = {"one", "two", "three", "four", "five"};
		
		try
		{
			System.out.println("Element number " +(pos+1)+ " is: '" +nums[pos]+ "'");
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("That was too high!");
			e.printStackTrace();
		}

	}

}
