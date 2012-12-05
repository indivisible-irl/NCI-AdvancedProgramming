package t07_FileIO_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyBytes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String fileIn = "file_in.txt";
		String fileOut = "file_out.txt";
		
		try {
			InputStream fis = new FileInputStream(fileIn);
			OutputStream fos = new FileOutputStream(fileOut);
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Caught a FileNotFoundException");
			e.printStackTrace();
		}

	}

	
	

}
