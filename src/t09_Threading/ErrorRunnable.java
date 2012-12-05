package t09_Threading;


public class ErrorRunnable implements Runnable
{

	public ErrorRunnable()
	{
		
	}
	
	@Override
	public void run(){
		throw new UnsupportedOperationException("not supported");
	}
	
	

}
