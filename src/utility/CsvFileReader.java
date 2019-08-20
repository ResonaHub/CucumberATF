package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;
import keyword.Constants;

public class CsvFileReader {

	public static void getUserAndPass(String path) throws IOException {
		try {
			Constants.csv = new CSVReader(new FileReader(path));
			String[] csvCell;// Delare String to pass all value in the file that in separed by comma
			while ((csvCell = Constants.csv.readNext()) != null) {
				for (int i = 0; i < csvCell.length - 1; i += 2) {
					String username = csvCell[i];
					String pass = csvCell[i + 1];
					System.out.print("username : " + username + " password : " + pass);
					System.out.println();

				}

			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		}

	}

	public static void getAllData(String path) throws IOException {
		try {
			Constants.csv = new CSVReader(new FileReader(path));
			String[] csvCell;// Delare String to pass all value in the file that in separed by comma
			while ((csvCell = Constants.csv.readNext()) != null) {
				for (int i = 0; i < csvCell.length - 1; i += 2) {
					String username = csvCell[i];
					String pass = csvCell[i + 1];
					System.out.print("username : " + username + " password : " + pass);
					System.out.println();

				}

			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		}
	}

}
