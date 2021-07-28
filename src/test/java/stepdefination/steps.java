package stepdefination;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import locaters.PropertyReader;
import locaters.Sun.Configurepage;
import locaters.Sun.Content;
import locaters.Sun.loginpage;

public class steps {
	  @Given("^enter valid user and password$")
	    public void enter_valid_user_and_password() throws Throwable {
	        Hooks.driver.findElement(loginpage.user).sendKeys(PropertyReader.prop("username"));
	        Hooks.driver.findElement(loginpage.password).sendKeys(PropertyReader.prop("password"));
	        Thread.sleep(4000);
	       
	    }

	    @When("^click on submit$")
	    public void click_on_submit() throws Throwable {
	    	 Hooks.driver.findElement(loginpage.submit).click();
	    }

	    @Then("^verify user login success$")
	    public void verify_user_login_success() throws Throwable {
	        
	    }
	    @Given("^click on Content Management System button$")
	    public void click_on_content_management_system_button() throws Throwable {
	        Hooks.driver.findElement(loginpage.CMS).click();
	    }

	    @Then("^verify user landed to Home page$")
	    public void verify_user_landed_to_home_page() throws Throwable {
	       if(Hooks.driver.findElement(Configurepage.Configure).isDisplayed())
	       {
	    	   
	       }
	    }
	    
	    @Given("^enter valid username,password and click on submit$")
	    public void enter_valid_usernamepassword_and_click_on_submit() throws Throwable {
	    	Hooks.driver.findElement(loginpage.user).sendKeys(PropertyReader.prop("username"));
	        Hooks.driver.findElement(loginpage.password).sendKeys(PropertyReader.prop("password"));
	        Thread.sleep(4000);
	        Hooks.driver.findElement(loginpage.submit).click();
	        Thread.sleep(4000);  
	    }

	   

	    @Then("^verify content create page$")
	    public void verify_content_create_page() throws Throwable {
	       
	    }

	    @And("^click on contnet create$")
	    public void click_on_contnet_create() throws Throwable 
	    {
	        Hooks.driver.findElement(Content.content).click();
	        Thread.sleep(3000);
	        Hooks.driver.findElement(Content.Create).click();
	        Hooks.driver.findElement(Content.contentname).sendKeys(PropertyReader.prop("contentname"));
	        Hooks.driver.findElement(Content.startdate).click();
	        Hooks.driver.findElement(Content.today).click();
	        Hooks.driver.findElement(Content.duration).sendKeys(PropertyReader.prop("duration"));
	        Hooks.driver.findElement(Content.shortdesc).sendKeys(PropertyReader.prop("shortdesc"));
	        //Hooks.driver.findElement(Content.longdesc).sendKeys("test");
	        Thread.sleep(3000);
	        String longdescription=Hooks.driver.findElement(Content.longdesc).getText();
	    	//Assert.assertEquals(longdescription, PropertyReader.prop("shortdesc"));
	       new Select(Hooks.driver.findElement(Content.contenttype)).selectByVisibleText(PropertyReader.prop("contenttype"));
	       Thread.sleep(2000);
	       
	       Hooks.driver.findElement(Content.saveandproceed).click();
	       Thread.sleep(5000);
	        }
	    @Then("^add images$")
	    public void add_images() throws Throwable {
	    	Thread.sleep(5000);
	    	new Select(Hooks.driver.findElement(Content.imagetype)).selectByIndex(1);;
	    	Thread.sleep(5000);
	    	Hooks.driver.findElement(Content.uploadimage).click();
			
	    	StringSelection ss = new StringSelection(PropertyReader.prop("imagepath"));
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			
	    }

	    @And("^add content meta$")
	    public void add_content_meta() throws Throwable {
	      Hooks.driver.findElement(Content.ReleaseDate).click();
	      Thread.sleep(2000);
	      Hooks.driver.findElement(By.cssSelector("button[data-handler='today']")).click();
	      
	      Hooks.driver.findElement(By.cssSelector("button[data-handler='hide']")).click();
	      Thread.sleep(4000);
	      WebElement element =Hooks.driver.findElement(By.xpath("//*[text() = 'Save and Proceed']"));
			
	      JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
		Thread.sleep(7000);
	      Hooks.driver.findElement(Content.saveandproceed).click();
	      WebElement element1 =Hooks.driver.findElement(By.xpath("//*[text() = 'Save and Proceed']"));
			
	      JavascriptExecutor js1 = (JavascriptExecutor) Hooks.driver;
		js1.executeScript("arguments[0].scrollIntoView();",element1);
	      Thread.sleep(8000);
	      Hooks.driver.findElement(Content.saveandproceed).click();
	      Thread.sleep(6000);  
	    }

	    @And("^click on save and exit$")
	    public void click_on_save_and_exit() throws Throwable {
	        Hooks.driver.findElement(Content.saveandexit).click();
	    }
	    


}
