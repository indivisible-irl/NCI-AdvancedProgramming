package t09_Threading;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteRunnable implements Runnable{

	//volatile File file;
	File file;
	String name;
	int iter;
	
	static Object lock = new Object();
	
	public WriteRunnable(File f, String n, int i)
	{
		file = f;
		name = n;
		iter = i;
	}

	@Override
	public void run() {
		
		if (file.exists())
		{
			if (file.canRead())
			{
				System.out.println(name+ "\tHave read privs");
			}
			else
			{
				System.out.println(name+ "\t! NO read privs");
			}
			if (file.canWrite())
			{
				System.out.println(name+ "\tHave write privs");
			}
			else
			{
				System.out.println(name+ "\t! NO write privs");
			}
			
			
			Writer os = null;
			System.out.println(name+ "\tWrite to: " +file.getName());
			
			try
			{
				
				os = new FileWriter(file);
				
				for (int i=0; i<5000; i++)
//					synchronized(lock)
				{
					os.write("line " +iter+"."+i+ "\n");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally
			{
				System.out.println(name+ "\tclosing");
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		else
		{
			System.out.println("File does not exist!!");
		}
		
	}
}
