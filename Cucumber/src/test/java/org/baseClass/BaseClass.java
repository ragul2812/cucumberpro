package org.baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Robot r;
	public static Actions a;
	public static Alert al;
	public static JavascriptExecutor js;
	public static Select s;
	public static String st;

	public static void openChromeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void openEdgeBrowser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static void maximize() {

		driver.manage().window().maximize();
	}

	public static void closeEntierBrowser() {

		driver.quit();
	}

	public static void closeCurrentTab() {

		driver.close();
	}

	public static void toFetchTittle() {

		String tittleName = driver.getTitle();
		System.out.println(tittleName);
	}

	public static void toFetchUrl() {

		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void launchUrl(String urlName) {

		driver.get(urlName);
	}

	public static void fillBox(WebElement element, String input) {

		element.sendKeys("input");

	}

	public static void ClickButton(WebElement ele) {

		ele.click();

	}

	public static void holdPrg(int time) throws InterruptedException {

		Thread.sleep(time);

	}

	public static void copy() throws AWTException {

		r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void down() {

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void up() {

		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	public static void tab() {

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void paste() {

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	public static void shift() {

		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);
	}

	public static void enter() {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void cut() {

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}

	public static void selAll() {

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}

	public static void dragdrop(WebElement ele1, WebElement ele2) {
		a = new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();

	}

	public static void moveElement(WebElement trg) {
		a.moveToElement(trg);
	}

	public static void keyDown(CharSequence key) {
		a.keyDown(key);
	}

	public static void keyup(CharSequence upKey) {
		a.keyUp(upKey);
	}

	public static void dobClick(WebElement dc) {
		a.doubleClick(dc);
	}

	public static void rigntClick(WebElement cc) {

		a.contextClick(cc).perform();
	}

	public static void accept() {
		al = driver.switchTo().alert();
		al.accept();
	}

	public static void dismiss() {
		al.dismiss();
	}

	public static void sendkey(String sk) {
		al.sendKeys("sk");

	}

	public static void scriptClick(Object clk) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].Click()", clk);
	}

	public static void scriptSendText(String st, Object ob) {
		js.executeScript("arguments[0].setAttribute('value','" + st + "')", ob);
	}

	public static void scriptGetText(Object value) {
		js.executeScript("return arguments[0].getAttribute('value')", value);
	}

	public static void scrollDown(Object v) {

		js.executeScript("arguments[0].scrollIntoView(true)", v);
	}

	public static void scrollUp(Object v) {

		js.executeScript("arguments[0].scrollIntoView(false)", v);
	}

	public static void screenShot(String picName) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File ss = tk.getScreenshotAs(OutputType.FILE);
		File st = new File("C:\\Users\\Admin\\eclipse-workspace1\\Maven\\screenshot\\" + "picName" + ".png");
		FileUtils.copyFile(ss, st);

	}

	public static void ddByValue(WebElement ele, String val) {

		s = new Select(ele);
		s.selectByValue(val);

	}

	public static void ddByVisibleText(String txt) {

		s.selectByVisibleText(txt);
	}

	public static void ddByIndex(int num) {

		s.selectByIndex(num);
	}

	public static void ddisMulti() {

		s.isMultiple();
	}

	public static void ddoption() {
		s.getOptions();
	}

	public static void ddAllOption() {
		s.getAllSelectedOptions();
	}

	public static void ddfirstSelSption() {
		s.getFirstSelectedOption();
	}

	public static void dddSelByIndex(int num) {
		s.deselectByIndex(num);
	}

	public static void dddSelByVisibleTxt(String txt) {

		s.deselectByVisibleText(txt);
	}

	public static void dddSelAll() {

		s.deselectAll();
	}

	public static void switchToFrameId(String idOrName) {

		driver.switchTo().frame(idOrName);
	}

	public static void switchToFrameWeb(WebElement webEle) {
		driver.switchTo().frame(webEle);
	}

	public static void switchToFrameIndex(int a) {

		driver.switchTo().frame(a);
	}

	public static void switchToFramePar() {

		driver.switchTo().parentFrame();
	}

	public static void switchToWindow(String url) {

		driver.switchTo().window("url");
	}

	public static void windowHandle() {

		driver.getWindowHandle();
	}

	public static void windowHandels() {

		Set<String> wind = driver.getWindowHandles();
	}

	public static void fileLoc(String loc) {

		File f = new File("loc");
	}

	public static void toReadFile(File read) throws FileNotFoundException {

		FileInputStream fil = new FileInputStream(read);
	}

	public static void toWriteFile(File write) throws FileNotFoundException {

		FileOutputStream fil = new FileOutputStream(write);
	}

//	public static String readData(String shName, int r, int c) throws IOException {

		//String st1 = readExcel(shName, r, c);
		//return st1;

//	}

	public static void fillTextBox(WebElement user, String read) {

		user.sendKeys(read);
	}

	//public static <Workbook> String readExcel(String name, int rowNo, int cellNo) throws IOException {

//		File f = new File("C:\\Users\\Admin\\eclipse-workspace1\\Maven\\ExcelSheet\\adatinhotalapp.xlsx");

	//	FileInputStream fil = new FileInputStream(f);

	//	Workbook b = new XSSFWorkbook(fil);

		//Sheet sh = b.getSheet(name);

//		Row r = sh.getRow(rowNo);

	//	Cell c = r.getCell(cellNo);

		// to fetch cell type

		//int type = c.getCellType();

//		String input;

	//	if (type == 1) {

		//	input = c.getStringCellValue();

	//	}

	//	else if (Date.isCellDateFormatted(c)) {

		//	Date da = c.getDateCellValue();

			// date------> string

		//	SimpleDateFormat sim = new SimpleDateFormat("dd/MMMM/yy");

		//	input = sim.format(da);

	//	}

	//	else {

			//double d = c.getNumericCellValue();

			// double------>long----->Downcasting

			//long l = (long) d;

		//	input = String.valueOf(l);
		//}

	//	return input;
	//}

	public void getDate() {

		Date d = new Date();
		System.out.println(d);
	}

	public static void implicitWait(long ms) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ms));

	}
	
	
}
