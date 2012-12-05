package t09_Threading;

public class MyRunnable implements Runnable
{

	private int run;
	private int iter;
	
	public MyRunnable(int x, int y)
	{
		run = x;
		iter = y;
	}
	
	@Override
	public void run() {
		System.out.println("- I am thread " +run+"."+iter);
	}

}
