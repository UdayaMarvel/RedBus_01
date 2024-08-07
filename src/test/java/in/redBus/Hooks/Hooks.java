package in.redBus.Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import in.redBus.BaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	BaseClass base = BaseClass.getInstance();
	BaseClass base1 = new BaseClass();
	
	@Before
	public void launchBrowser(Scenario scenario) {
		base.browserLaunch();
		System.out.println(System.identityHashCode(base));
		System.out.println("base 1 : "+System.identityHashCode(base1));
		final byte[] source = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(source, "image/png");
	}
	
	@After
	public void closeBrowser(Scenario scenario) {
		final byte[] source = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(source, "image/png");
//		base.browserClose();
	}

}
