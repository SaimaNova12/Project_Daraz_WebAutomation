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

public class MultipleItemSelection extends CommonMethods{
	
	ExtentTest test;
	public MultipleItemSelection(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]")
    WebElement item1;
	
	@FindBy(xpath = "//button[contains(@class,'pdp-button pdp-button_type_text pdp-button_theme_orange pdp-button_size_xl')]")
    WebElement cart1;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/a[1]")
    WebElement item2;
	
	@FindBy(xpath = "//button[contains(@class,'pdp-button pdp-button_type_text pdp-button_theme_orange pdp-button_size_xl')]")
	WebElement cart2;
	
   public void multiple() throws InterruptedException, IOException {
	   
	   try {
		   if(item1.isDisplayed()) {
			   item1.click();
			   timeout();
   			   test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Item1 Successful</b></p>");
    		   String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Item1 Successful");
    		   String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Item1 Successful.png";
    		   test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		   }
	   }
	   catch(Exception e) {
    		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Item1 is Not Working</b></p>");
    		Throwable t = new InterruptedException("Exception");
    		test.fail(t);
    		@SuppressWarnings("unused")
    		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Item1 is Not Working");
    		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Item1 is Not Working.png";
    		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    		Assert.assertTrue(item1.isDisplayed());
    		PageDriver.getCurrentDriver().quit();
	   }
	   
	   try {
		   if(cart1.isDisplayed()) {
			   cart1.click();
			   timeout();
   			   test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Add to Cart Successful</b></p>");
    		   String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Add to Cart Successful");
    		   String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Add to Cart Successful.png";
    		   test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		   }
	   }
	   catch(Exception e) {
    		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Add to Cart is Not Working</b></p>");
    		Throwable t = new InterruptedException("Exception");
    		test.fail(t);
    		@SuppressWarnings("unused")
    		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Add to Cart is Not Working");
    		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Add to Cart is Not Working.png";
    		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    		Assert.assertTrue(cart1.isDisplayed());
    		PageDriver.getCurrentDriver().quit();
	   }
	   PageDriver.getCurrentDriver().navigate().back();
	   timeout();
	   try {
		   if(item2.isDisplayed()) {
			   item2.click();
			   timeout();
   			   test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Item2 Successful</b></p>");
    		   String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Item2 Successful");
    		   String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Item2 Successful.png";
    		   test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		   }
	   }
	   catch(Exception e) {
    		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Item2 is Not Working</b></p>");
    		Throwable t = new InterruptedException("Exception");
    		test.fail(t);
    		@SuppressWarnings("unused")
    		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Item2 is Not Working");
    		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Item2 is Not Working.png";
    		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    		Assert.assertTrue(item2.isDisplayed());
    		PageDriver.getCurrentDriver().quit();
	   }
	   try {
		   if(cart2.isDisplayed()) {
			   cart2.click();
			   timeout();
   			   test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>cart2 Successful</b></p>");
    		   String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "cart2 Successful");
    		   String dest = System.getProperty("user.dir")+"\\screenshots\\" + "cart2 Successful.png";
    		   test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		   }
	   }
	   catch(Exception e) {
    		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>cart2 is Not Working</b></p>");
    		Throwable t = new InterruptedException("Exception");
    		test.fail(t);
    		@SuppressWarnings("unused")
    		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "cart2 is Not Working");
    		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "cart2 is Not Working.png";
    		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    		Assert.assertTrue(cart2.isDisplayed());
    		PageDriver.getCurrentDriver().quit();
	   }
	   
	   PageDriver.getCurrentDriver().navigate().back();
	   PageDriver.getCurrentDriver().navigate().back();
	   timeout();
	   
   }

}
