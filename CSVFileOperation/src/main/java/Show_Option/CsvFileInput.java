package Show_Option;

import java.io.File;
import java.util.Scanner;

/**
 * From this Class Program is executing, 
 * Please create object of class 'CsvFileInput' and call method 'fileInput'
 */
public class CsvFileInput {
	static String filename = null;

	public void fileInput() {
		try {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter the file path");
			filename = scanner.nextLine();
			File file = new File(filename);
			if (file.exists() == true) {
				System.out.println("File exist in your system");
				new Options(file);
			} else {
				System.out.println("File path not found");
				fileInput();
			}
		} catch (Exception e) {
			System.out.println("File not found exception");
			fileInput();
		}
	}
}
