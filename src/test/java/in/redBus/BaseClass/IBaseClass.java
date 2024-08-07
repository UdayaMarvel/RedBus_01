package in.redBus.BaseClass;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface IBaseClass {

	void browserLaunch();
	void browserClose();
	void inputKeys(WebElement ele, String value);
	void button(WebElement ele);
	boolean displayed(WebElement ele);
	boolean selected(WebElement ele);
	boolean enabled(WebElement ele);
	void moveForward();
	void moveBackward();
	String returnText(WebElement ele);
	String returnAttribute(WebElement ele, String attribute);
	String returnCssValue(WebElement ele, String cssName);
	void valueSelect(WebElement ele, String value);
	void indexSelect(WebElement ele, int i);
	List<WebElement> returnOptions(WebElement ele);
	void parentWindow(String parentName);
	void childWindow();
	void inputKeys(Alert a, String value);
	void screenshot(String imageName) throws IOException;
	WebDriverWait waits();
	void cursorMove(WebElement ele);
	void inputKeys(String value, WebElement ele);
	void button(WebElement ele, int a);
	void launchApplication(String url);
	
}
