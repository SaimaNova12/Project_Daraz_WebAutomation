package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utility.CommonMethods;
import utility.GetScreenShot;

public class SearchPage extends CommonMethods{
    
	ExtentTest test;
	public SearchPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = "//input[@id='q']")
	WebElement search;
	
	@FindBy(xpath = "//button[contains(text(),'SEARCH')]")
	WebElement enter;
	
	
	public void search() throws IOException {
		
		try {
			if(search.isDisplayed()) {
				search.sendKeys("saree");
				timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Search box Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Search box Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Search box Successful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Search box is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Search box is Not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Search box is Not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(search.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(enter.isDisplayed()) {
				enter.click();
				timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Search Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Search Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Search Successful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Search is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Search is Not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Search is Not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(enter.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
	}
}
