package in.redBus.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import in.redBus.BaseClass.BaseClass;
import in.redBus.StepDefinition.BusBooking;

public class TrainBookingPage{
	BaseClass base = BaseClass.getInstance();
	BaseClass base1 = new BaseClass();
	public TrainBookingPage() {
		System.out.println(System.identityHashCode(base));
		System.out.println("base 1 : "+System.identityHashCode(base1));
		PageFactory.initElements(base.driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Train Tickets']")
	private WebElement train;
	
	@FindBy(xpath = "//label[text()='From']")
	private WebElement fromLbl;
	
	@FindBy(id = "src")
	private WebElement fromInputBx;
	
	@FindBy(xpath = "//label[text()='To']")
	private WebElement toLbl;
	
	@FindBy(id = "dst")
	private WebElement toInputBx;
	
	@FindBy(xpath = "//img[@class='train-icon']")
	private WebElement dateBtn;
	
	@FindBy(xpath = "//span[text()='24']")
	private WebElement date;
	
	@FindBy(xpath="//button[contains(text(),'search trains')]")
	private WebElement search;
	
	@FindBy(xpath="//span[text()='Got it']")
	private WebElement gotIt;
	
	@FindBy(xpath="//div[@class='srp_timimngs_wrap srp_src_dst_stations']/div")
	private List<WebElement> trains;
	
	@FindBy(xpath ="//div[contains(text(),'Tiruchchirapali')]")
	private WebElement toLocation;

	@FindBys({@FindBy(id="class"), @FindBy(className = "name")})
	private WebElement ele;
	
	@FindAll({@FindBy(id="class"), @FindBy(className = "name")})
	private WebElement ele1;
	
	public WebElement getToLocation() {
		return toLocation;
	}

	public WebElement getTrain() {
		return train;
	}

	public WebElement getFromLbl() {
		return fromLbl;
	}

	public WebElement getFromInputBx() {
		return fromInputBx;
	}

	public WebElement getToLbl() {
		return toLbl;
	}

	public WebElement getToInputBx() {
		return toInputBx;
	}

	public WebElement getDateBtn() {
		return dateBtn;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getGotIt() {
		return gotIt;
	}

	public List<WebElement> getTrains() {
		return trains;
	}

}
