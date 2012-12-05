package t09_Threading;

public class MyThread extends Thread{

////FIXME DONT DO THIS!	NEVER EXTEND THREAD JUST TO RUN.
	
	private int run;
	private int iter;
	
	public MyThread(int x, int y)
	{
		run = x;
		iter = y;
	}
	
	@Override
	public void run()
	{
		System.out.println("- I am thread " +run+"."+iter);
	}
}
