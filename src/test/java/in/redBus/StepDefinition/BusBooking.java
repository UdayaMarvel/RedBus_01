package in.redBus.StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.redBus.BaseClass.BaseClass;
import in.redBus.ObjectRepository.TrainBookingPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BusBooking {
	public static String fromPlace;
	public static String toPlace;
	public static BaseClass base = BaseClass.getInstance();
	public static BaseClass base1 = new BaseClass();
	public static TrainBookingPage trainBooking = new TrainBookingPage();
	
	@Given("Launch the browser and application {string}")
	public void launch_the_browser_and_application(String url) throws IOException {
		System.out.println(System.identityHashCode(base));
		System.out.println("base 1 : "+System.identityHashCode(base1));
		File f = new File("C:\\Users\\ADMIN\\eclipse\\RedBus\\src\\test\\resources\\Utilities.property");
		FileInputStream fI = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fI);
		String file = prop.getProperty("file");
		String url1 = prop.getProperty("url");
		
		FileOutputStream fO = new FileOutputStream(f);
		prop.setProperty("urlQa", "https://www.redbus.in.qa");
		prop.save(fO, "Updated QA URL");
		System.out.println(file +" and "+ url1);
		base.launchApplication(url1);
		List<WebElement> links = base.driver.findElements(By.tagName("link"));
		Iterator<WebElement> link = links.iterator();
		while(link.hasNext()) {
			WebElement next = link.next();
			String href = next.getAttribute("href");
			
			if(!href.startsWith(url)) {
				System.out.println("Not related to our application : "+ href);
			}
			else if (href==null || href.isEmpty()) {
				System.out.println("Link value is null or empty");
			}
			else {
			
			HttpURLConnection http = (HttpURLConnection) (new URL(href)).openConnection();
			http.setRequestMethod("HEAD");
			http.connect();
			int responseCode = http.getResponseCode();
			if(responseCode == 200) {
				System.out.println("Not a Broken Link : "+ href);
			}
			else {
				System.out.println("Broken Link : "+ href);
			}
			}
			
		}
		
	}
	
	@When("User enters the value in from place {string}")
	public void user_enters_the_value_in_from_place(String fromplace) {
		   fromPlace= fromplace;
			base.button(trainBooking.getTrain());
			base.button(trainBooking.getFromLbl());
			base.inputKeys(trainBooking.getFromInputBx(), fromPlace);
			WebElement frompl = base.driver.findElement(By.xpath("(//div[contains(text(),'"+fromplace+"')])[1]"));
			base.button(frompl);
	}

	@When("User enters the value in to place {string}")
	public void user_enters_the_value_in_to_place(String toplace) throws InterruptedException {
		    toPlace = toplace;
		    base.button(trainBooking.getToLbl());
			base.inputKeys(trainBooking.getToInputBx(), toPlace);
//			Thread.sleep(10000);
			base.waits().until(ExpectedConditions.elementToBeClickable(trainBooking.getToLocation()));
			base.button(trainBooking.getToLocation());
			
	}
	
	@When("User clicks on date")
	public void user_clicks_on_date() throws InterruptedException {
		base.waits().until(ExpectedConditions.elementToBeClickable(trainBooking.getDateBtn()));
			Thread.sleep(5000);
			base.cursorMove(trainBooking.getDateBtn());
			base.button(trainBooking.getDateBtn());
			Thread.sleep(10000);
			
			base.button(trainBooking.getDateBtn());
		
	}	
}
