package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import keyword.Constants;

public class GetFileProperties {
	
	public static String getProperty(String key) {
		String value = null;
		try {
			Constants.fis = new FileInputStream("E:\\Newjava\\Hybrid FrameWork\\Configuration\\Config.properties");
			Constants.prop = new Properties();
			Constants.prop.load(Constants.fis);
			value = Constants.prop.getProperty(key);
		} catch (FileNotFoundException e) {
			System.err.println("File not found...Please enter correct path");
		} catch (IOException e) {
			System.err.println("File not reading...please provide the data");
		}
		return value;

	}

	public static String getProperty(String key, String path) {
		String value = null;
		try {
			Constants.fis = new FileInputStream(path);
			Constants.prop = new Properties();
			Constants.prop.load(Constants.fis);
			value = Constants.prop.getProperty(key);
		} catch (FileNotFoundException e) {

			System.err.println("File not found...Please enter correct path");
		} catch (IOException e) {
			System.err.println("File not reading...please provide the data");

		}

		return value;

	}

	public static String[] getLocator(String key) {
		String[] value = null;
		try {
			Constants.fis = new FileInputStream("E:\\Newjava\\Hybrid FrameWork\\Configuration\\Config.properties");
			Constants.prop = new Properties();
			Constants.prop.load(Constants.fis);
			String part = Constants.prop.getProperty(key);
			value = part.split(":");
			System.out.println("Locator type: " + value[0]);
			System.out.println("Locator value: " + value[1]);

		} catch (FileNotFoundException e) {
			System.err.println("File not found...Please enter correct path");

		} catch (IOException e) {
			System.err.println("File not reading...please provide the data");

		}
		return value;

	}

}
