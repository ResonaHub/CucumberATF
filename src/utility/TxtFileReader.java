package utility;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import keyword.Constants;

public class TxtFileReader {
	public static void txtReader(String path) {
		try {
			Constants.files = new FileReader(path);
			Constants.brd = new BufferedReader(Constants.files);
			String st;
			while ((st = Constants.brd.readLine()) != null) {
				System.out.println(st);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found...Please enter correct path");

		} catch (IOException e) {
			System.err.println("File not reading...please provide the data");

		}

	}

}
