package t08_Exceptions;

public class DivideByZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int input = 0;
		int calc = 0;

		try
		{
			calc = 100 / input;
			System.out.println("100 divided by " +input+ " is: " +calc);
		}
		catch (ArithmeticException  e)
		{
			System.out.println("Oh noes!! A zero!");
			e.printStackTrace();
		}
	}

}
