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

public class TerminatePage extends CommonMethods{
     
	ExtentTest test;
	public TerminatePage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);	
		this.test = test;
	}
	
	@FindBy(xpath = "//div[@class='logged-in-my-acc']")
	WebElement logout;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement tclick;
	
	
	public void terminate() throws IOException {
		try {
			if(logout.isDisplayed()) {
				logout.click();
				timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Logout Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Logout Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Logout Successful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Logout is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Logout is Not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Logout is Not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(logout.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(tclick.isDisplayed()) {
				tclick.click();
				timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Logout Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Logout Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Logout Successful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Logout is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Logout is Not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Logout is Not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(tclick.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
	}
}
