package t09_Threading;

public class RunThreads {

	public static void main(String[] args) {

		Thread thread;
		MyRunnable myR;
		String name;
		
		for (int j=1; j<6; j++)
		{
			System.out.println("=============== " +j+ " ====================");
			for (int i=1; i<10; i++)
			{
				name = "Thread " +j+"."+i;
				myR = new MyRunnable(j,i);
				thread = new Thread(myR, name);
				
				System.out.println("| Starting " +name);
				thread.start();
			}
		}
	}
}
