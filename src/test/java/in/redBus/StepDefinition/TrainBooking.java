package in.redBus.StepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

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

public class TrainBooking{
	public static BaseClass base = BaseClass.getInstance();
	public static BaseClass base1 = new BaseClass(); 	
	public static BusBooking bus = new BusBooking();
	public static String fromPlace = bus.fromPlace;
	public static String toPlace = bus.toPlace;
	public static TrainBookingPage trainBooking = new TrainBookingPage(); 

	@When("User selects a date in the Date Dropdown")
	public static void user_selects_a_date_in_the_date_dropdown() throws InterruptedException {
		System.out.println(System.identityHashCode(base));
		System.out.println("base 1 : "+System.identityHashCode(base1));
		base.waits().until(ExpectedConditions.elementToBeClickable(trainBooking.getDate()));
		base.button(trainBooking.getDate());
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		base.button(trainBooking.getSearch());
	}

	@Then("Validate the bus displayed in the UI")
	public void validate_the_bus_displayed_in_the_ui() {
		try {
			base.button(trainBooking.getGotIt());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
		for (int i = 0; i < trainBooking.getTrains().size(); i++) {
			String locations = base.returnText(trainBooking.getTrains().get(i));
			if(locations.contains(fromPlace) || locations.contains(toPlace)) {
				Assert.assertEquals(fromPlace, locations);
				System.out.println(locations);
			}
		}
		}
	}

	@Then("Validate the buses displayed as per given value")
	public void validate_the_buses_displayed_as_per_given_value() {
//		List<WebElement> buses = driver.findElements(By.xpath("//div[contains(@class,'travels')]"));
//		List<WebElement> dpTime = driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
//		List<WebElement> bpTime = driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
//		List<WebElement> fares = driver.findElements(By.xpath("//span[contains(@class,'f-19')]"));
//		int size = buses.size();
//		for (int i = 0; i < size; i++) {
//			if(i == buses.size()-1) {
//				JavascriptExecutor js = (JavascriptExecutor)driver;
//				js.executeScript("arguments[0].scrollIntoView(true)", buses.get(i));
//				buses = driver.findElements(By.xpath("//div[contains(@class,'travels')]"));
//				dpTime = driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
//				bpTime = driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
//				fares = driver.findElements(By.xpath("//span[contains(@class,'f-19')]"));
//				size=buses.size();
//			}else {
//				String bus = buses.get(i).getText();
//				String dp = dpTime.get(i).getText();
//				String bp = bpTime.get(i).getText();
//				String fare = fares.get(i).getText();
//				System.out.println("Bus Name :"+bus + " Departure Time :" + dp+" Arrival Time :"+bp+ " Bus Fare :"+fare);
//			}
//		}
	}
	
}
