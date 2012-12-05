package t05_FileIO;

public class DefaultsApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student(123456, true, (short)123, .8f, 2.9d);
		
		System.out.println(student1);
		System.out.println(student2);
		
	}

}
