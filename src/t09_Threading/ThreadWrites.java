package t09_Threading;

import java.io.File;

public class ThreadWrites {

	public static void main(String[] args) {
		
		Thread thread;
		WriteRunnable writeRunnable;
		File file;
		
		for (int i=0; i<50; i++)
		{
			//file = new File("thread"+i+".txt");
			file = new File("thread.txt");
			writeRunnable = new WriteRunnable(file, "Thread "+i, i);
			thread = new Thread(writeRunnable);
			thread.start();
		}

	}

}


// no alg, no alg perf, no sort
// 7, 9, 10