package stepdefination;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import locaters.PropertyReader;


public class Hooks {
	public static WebDriver driver;

	@Before
	public void setUp() throws Throwable {
		driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get(PropertyReader.prop("sunurl"));
		driver.manage().window().maximize();
		
		
	}

	@After
	public void tearDown(Scenario scenario) {

		try {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			if (scenario.isFailed()) {
				scenario.log("this is my failure message");
				TakesScreenshot ts = (TakesScreenshot) driver;
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);
				Thread.sleep(4000);
				
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		driver.close();
}

}
