package org.base;

import java.awt.dnd.DragSourceDropEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void WindowMaximize() {
		driver.manage().window().maximize();

	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static  String pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	
	}

	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}

	public static void closeEntireBrowser() {
		driver.quit();
	}

	public static void clickBtn(WebElement ele) {
		ele.click();
	}

	public static void screenShot(String imgname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+ imgName.png");
		FileUtils.copyFile(image, f);
	}

	public static Actions a;

	public static void moveTheCursor(WebElement targetElement) {
		a = new Actions(driver);
		a.moveToElement(targetElement).perform();
	}

	public static void dragDrop(WebElement dragWebElement, WebElement dropElement) {
		a = new Actions(driver);
		a.dragAndDrop(dragWebElement, dropElement).perform();
	}

	public static JavascriptExecutor js;

	public static void scrollThePage(WebElement tarwebsite) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", tarwebsite);
	}

	public static void scroll(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void excelRead(String sheetname, int rowNum, int cellNum) throws IOException {
		File f = new File("excellocation.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Sheet1");

		Row r = s.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int celltype = c.getCellType();

		String value = " ";

		if (celltype == 1) {
			String v = c.getStringCellValue();
			System.out.println(v);
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat a = new SimpleDateFormat("dd-MM-yyyy");
			String format = a.format(d);
			System.out.println(format);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String val = String.valueOf(l);
			System.out.println(value);
		}
	}

	public static void createNewExcelFile(int rowNum, int cellNum, String newData) throws IOException {
		File f = new File("C:\\Users\\Vinoth\\eclipse-workspace\\MavenProject\\Excel\\Datadriven6.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newSheet = w.createSheet("Datas");
		Row newRow = newSheet.createRow(rowNum);
		Cell newCell = newRow.createCell(cellNum);
		newCell.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);
	}
	
	public static void createCell(int rowNum, int cellNum, String newData) throws IOException {
		File f = new File("C:\\Users\\Vinoth\\eclipse-workspace\\MavenProject\\Excel\\Datadriven6.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet("Datas");
		Row r= s.getRow(rowNum);
		Cell c = r.createCell(cellNum);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);
	}

	public static void createRow(int creRow, int creCell, String newData) throws IOException {
		File f = new File("C:\\Users\\Vinoth\\eclipse-workspace\\MavenProject\\Excel\\Datadriven6.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet newSheet = w.getSheet("Datas");
		Row newRow = newSheet.createRow(creRow);
		Cell newCell = newRow.createCell(creCell);
		newCell.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);
	}

	public static void updateDataToParticularCell(int getTheRow, int getTheCell, String existingData,
			String writeNewData) throws IOException {
		File f = new File("C:\\Users\\Vinoth\\eclipse-workspace\\MavenProject\\Excel\\Datadriven6.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet("Datas");
		Row r= s.createRow(getTheRow);
		Cell c = r.createCell(getTheCell);
		String str = c.getStringCellValue();
		if (str.equals(existingData)) {
			c.setCellValue(writeNewData);
		}
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}

}
