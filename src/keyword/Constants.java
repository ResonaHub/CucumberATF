package keyword;

import java.awt.Robot;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import au.com.bytecode.opencsv.CSVReader;

public class Constants {
	public static FileInputStream fis;
	public static Properties prop;
	public static WebDriver driver;
	public static WebElement element;
	public static Actions takeaction;
	public static CSVReader csv;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static FileReader files;
	public static BufferedReader brd;
	public static Robot bot;
	public static Dimension dia;
	

}
