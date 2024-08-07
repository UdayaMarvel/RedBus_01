package in.redBus.BaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IBaseClass{
	public static BaseClass base = null;
	
	public static BaseClass getInstance() {
		if(base==null) {
			base = new BaseClass();
		}
	return base;	
	}
	
	
	public BaseClass() {}
	
	
	
	public static WebDriver driver;
	public static Select select;
	public static Actions action;

	public void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("disable-popups");
		options.addArguments("start-maximized");
		driver = new EdgeDriver(options);
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	}
	
	public void launchApplication(String url) {
		driver.get(url);
	}

	public void browserClose() {
		driver.close();
		
	}

	public void inputKeys(WebElement ele, String value) {
		ele.sendKeys(value);		
	}

	public void button(WebElement ele) {
		ele.click();
	}

	public boolean displayed(WebElement ele) {
		boolean displayed = ele.isDisplayed();
		return displayed;
	}

	public boolean selected(WebElement ele) {
		boolean selected = ele.isSelected();
		return selected;
	}

	public boolean enabled(WebElement ele) {
		boolean enabled = ele.isEnabled();
		return enabled;
	}

	public void moveForward() {
		driver.navigate().forward();
		
	}

	public void moveBackward() {
		driver.navigate().back();
	}

	public String returnText(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	public String returnAttribute(WebElement ele, String attribute) {
		String attribute2 = ele.getAttribute(attribute);
		return attribute2;
	}

	public String returnCssValue(WebElement ele, String cssName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void valueSelect(WebElement ele, String value) {
		select = new Select(ele);
		select.selectByValue(value);
	}

	public void indexSelect(WebElement ele, int i) {
		select = new Select(ele);
		select.selectByIndex(i);
	}

	public List<WebElement> returnOptions(WebElement ele) {
		select = new Select(ele);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public void parentWindow(String parentName) {
		
	}

	public void childWindow() {
		// TODO Auto-generated method stub
		
	}

	public void inputKeys(Alert a, String value) {
		a.sendKeys(value);
	}

	public void screenshot(String imageName) throws IOException {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\ADMIN\\eclipse\\RedBus\\target\\"+imageName+".png");
		FileUtils.copyFile(source, f);
	}

	public WebDriverWait waits() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait;
	}

	public void cursorMove(WebElement ele) {
		action.moveToElement(ele).build().perform();
	}

	public void inputKeys(String value, WebElement ele) {
		action.sendKeys(ele,value).build().perform();
	}

	public void button(WebElement ele, int a) {
		action.click(ele).build().perform();
	}

}
