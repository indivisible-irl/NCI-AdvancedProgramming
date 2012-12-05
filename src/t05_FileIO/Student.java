package t05_FileIO;

public class Student {

	int a;
	boolean b;
	short s;
	float f;
	double d;
	
	
	public Student()
	{
		
	}
	
	public Student(int _a, boolean _b, short _s, float _f, double _d)
	{
		a = _a;
		b = _b;
		s = _s;
		f = _f;
		d = _d;
	}
	
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("========================================");
		sb.append("\n\ta (int):   ").append(Integer.toString(a));
		sb.append("\n\tb (bool):  ").append(Boolean.toString(b));
		sb.append("\n\ts (shrt):  ").append(Short.toString(s));
		sb.append("\n\tf (float): ").append(Float.toString(f));
		sb.append("\n\td (doub):  ").append(Double.toString(d));
		sb.append("\n========================================");
		
		return sb.toString();
		
		
	}
}
