package ca02_sample_LuckyNumbers;

public class SampleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1;
		
		
		try
		{
			Runnable myRun = new SampleRunnable();
			t1 = new Thread(myRun);
			
			t1.start();
		}
		finally
		{
			
		}

	}

}
