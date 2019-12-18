package readfile;

import java.io.FileInputStream;
import java.io.IOException;

//Read a File
public class ReadAFile {

	public static void main(String[]args)throws IOException {
		FileInputStream file = null;

		//handle the Exception if no such file exists
		file = new FileInputStream("contents.txt");
		
		int f;
		while((f=file.read())!=-1) {
			System.out.print((char)f);
		}
		
		file.close();
	}
}
