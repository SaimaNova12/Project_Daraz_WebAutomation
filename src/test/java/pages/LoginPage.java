package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utility.CommonMethods;
import utility.GetScreenShot;


public class LoginPage extends CommonMethods{
	
	 ExtentTest test;
     public LoginPage(ExtentTest test) {
    	 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    	 this.test = test;
     }
     
     @FindBys({
    	 @FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
     })
     WebElement username;
     
     @FindBys({
    	 @FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
     })
     WebElement password;
     
     @FindBy(xpath = "//button[contains(text(),'LOGIN')]")
     WebElement loginButton;
     
     public void login(String user, String pass) throws InterruptedException, IOException {

    	 timeout();
    	 try {
    		if(username.isDisplayed()) {
    			username.sendKeys(user);
    			timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Sending Username Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Sending Username Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "SendingUsernameSuccessful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    			
    		} 
    	 }
    	 catch(Exception e) {
	     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Sending username is Not Working</b></p>");
	     		Throwable t = new InterruptedException("Exception");
	     		test.fail(t);
	     		@SuppressWarnings("unused")
	     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Sending username is Not Working");
	     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "SendingusernameisNotWorking.png";
	     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	     		Assert.assertTrue(username.isDisplayed());
	     		PageDriver.getCurrentDriver().quit();
    	 }
    	 
    	 try {
    		if(password.isDisplayed()) {
    			password.sendKeys(pass);
    			timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Sending password Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Sending password Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "SendingpasswordSuccessful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    		} 
    	 }
    	 catch(Exception e) {
	     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Sending password is Not Working</b></p>");
	     		Throwable t = new InterruptedException("Exception");
	     		test.fail(t);
	     		@SuppressWarnings("unused")
	     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Sending password is Not Working");
	     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "SendingpasswordisNotWorking.png";
	     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	     		Assert.assertTrue(password.isDisplayed());
	     		PageDriver.getCurrentDriver().quit();
    	 }
    	 try {
    		if(loginButton.isDisplayed()) {
    			loginButton.click();
    			timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>loginButton Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "loginButton Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "loginButtonSuccessful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    		} 
    	 }
    	 catch(Exception e) {
	     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Login is Not Working</b></p>");
	     		Throwable t = new InterruptedException("Exception");
	     		test.fail(t);
	     		@SuppressWarnings("unused")
	     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Login is Not Working");
	     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "LoginisNotWorking.png";
	     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	     		Assert.assertTrue(loginButton.isDisplayed());
	     		PageDriver.getCurrentDriver().quit();
    	 }
    	 
    	 PageDriver.getCurrentDriver().navigate().refresh();
    	 timeout();
     }
}

