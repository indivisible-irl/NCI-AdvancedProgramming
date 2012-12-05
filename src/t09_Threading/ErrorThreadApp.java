package t09_Threading;

public class ErrorThreadApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ErrorRunnable runnable = new ErrorRunnable();
		Thread thread = new Thread(runnable);
		
		System.out.println(thread.getPriority());
		thread.setPriority(Thread.NORM_PRIORITY+1);
		System.out.println(thread.getPriority());
		
		try
		{
			thread.start();
			thread.join();
		}
		catch (UnsupportedOperationException e)
		{
			System.out.println(e.getMessage());
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("------------");
		}

	}

}
