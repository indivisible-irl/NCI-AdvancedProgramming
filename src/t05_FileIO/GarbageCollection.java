package t05_FileIO;

public class GarbageCollection{
	int a;
	int b;
	
	public void setData(int c,int d){
		a=c;
		b=d;
	}
	
	public void showData(){
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}
	
	public static void main(String args[]){
		
		GarbageCollection s1 = new GarbageCollection();
		GarbageCollection s2 = new GarbageCollection();
		
		s1.setData(1,2);
		s2.setData(3,4);
		s1.showData();
		s2.showData();
		
		GarbageCollection s3;		// Line 20
		s3=s2;						// Line 21
		s3.showData();				// Line 22
		
		System.out.println("s1 hash:" +s1.hashCode());
		System.out.println("s2 hash:" +s2.hashCode());
		System.out.println("s3 hash:" +s3.hashCode());
		
		s2=null;					// Line 23
		s3.showData();				// Line 24
		s3=null;					// Line 25
//		s3.showData();				// Line 26
		s1=null;
		
		
		while(true)
		{
			System.gc();
		}
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Object finalizing...");
	}
}