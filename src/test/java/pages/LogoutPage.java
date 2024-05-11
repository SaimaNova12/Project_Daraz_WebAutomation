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

public class LogoutPage extends CommonMethods{
	
	ExtentTest test;
	public LogoutPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
    
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]")
	WebElement log1;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement log2;
    
    @FindBy(xpath = "//input[@placeholder='Please enter your Phone Number or Email']")
    WebElement login;
    
    @FindBy(xpath = "//input[@placeholder='Please enter your password']")
    WebElement pass;
    
    @FindBy(xpath = "//button[contains(text(),'LOGIN')]")
    WebElement enter;

public void logout() throws IOException {
	//Actions hover = new Actions(PageDriver.getCurrentDriver());
	    try {
	    	if(log1.isDisplayed()) {
	    		log1.click();
	    		timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Select Order & Account Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select Order & Account Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Select Order & Account Successful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    	}
	    }
	    catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Select Order & Account is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select Order & Account is Not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Select Order & Account is Not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(log1.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
	    }
	    
	    try {
	    	if(log2.isDisplayed()) {
	    		log2.click();
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
     		Assert.assertTrue(log2.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
	    }
	    
	    try {
	    	if(login.isDisplayed()) {
	    		login.sendKeys("01644417057");
	    		timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Sending Username Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Sending Username Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Sending Username Successful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    	}
	    }
	    catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Sending username is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Sending username is Not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Sending username is Not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(login.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
	    }
	    
	    try {
	    	if(pass.isDisplayed()) {
	    		pass.sendKeys("saima34");
	    		timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Sending password Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Sending password Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Sending password Successful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    	}
	    }
	    catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Sending password is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Sending password is Not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Sending password is Not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(pass.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
	    }
	    try {
	    	if(enter.isDisplayed()) {
	    		enter.click();
	    		timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Login Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Login Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Login Successful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    	}
	    }
	    catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Login is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Login is Not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Login is Not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(enter.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
	    }
	    
	    
    }
}