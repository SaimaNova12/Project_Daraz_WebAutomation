package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utility.CommonMethods;
import utility.GetScreenShot;

public class DashboardPage extends CommonMethods{
      
	  ExtentTest test;
	  public DashboardPage(ExtentTest test) {
		  
		  PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	      this.test = test;
	  }
	  
	  @FindBy(xpath = "//span[contains(text(),\"Women's & Girls' Fashion\")]")
	  WebElement fashion1;
	  
	  @FindBy(xpath = "//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[1]/li[2]/a[1]/span[1]")
	  WebElement fashion2;
	  
	  @FindBy(xpath = "//span[normalize-space()='Abayas & Long Dresses']")
	  WebElement fashion3;
	  
	  @FindBy(xpath = "//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/a[1]/div[1]/img[1]")
	  WebElement fashion4;
	  
	  @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	  WebElement cart;
	  
	  @FindBy(xpath = "//button[contains(text(),'GO TO CART')]")
	  WebElement gotocart;
	     
	  @FindBy(css = ".next-btn.next-btn-primary.next-btn-large.checkout-order-total-button.automation-checkout-order-total-button-button")
	  WebElement pay;
	  
	  
	  public void fashion() throws InterruptedException, IOException {
		    
	    	Actions hover = new Actions(PageDriver.getCurrentDriver());
	    	try {
	    		if(fashion1.isDisplayed()) {
	    			//fashion1.click();
	    			hover.moveToElement(fashion1).perform();
	    			timeout();
	    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Women's & Fashion Section</b></p>");
	        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Women's & Fashion Section");
	        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Women's&FashionSector.png";
	        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    		} 
	    	 }
	    	catch(Exception e) {
	     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Women & Girl's Sector is Not Working</b></p>");
	     		Throwable t = new InterruptedException("Exception");
	     		test.fail(t);
	     		@SuppressWarnings("unused")
	     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Womne's & Girls Section Successful");
	     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Womne's & Girls Section.png";
	     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	     		Assert.assertTrue(fashion1.isDisplayed());
	     		PageDriver.getCurrentDriver().quit();
	    	 }
		    try {
			if(fashion2.isDisplayed()) {
				//fashion2.click();
				hover.moveToElement(fashion2).perform();
				timeout();
				test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Hover Muslim Section Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Hover Muslim Section");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Hover Muslim Section.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			     } 
		      }
		    catch(Exception e) {
	     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Hover Muslim Section Not Working</b></p>");
	     		Throwable t = new InterruptedException("Exception");
	     		test.fail(t);
	     		@SuppressWarnings("unused")
	     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Hover Muslim Section Not Working");
	     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Hover Muslim Section Not Working.png";
	     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	     		Assert.assertTrue(fashion2.isDisplayed());
	     		PageDriver.getCurrentDriver().quit();	
		    }
		    try {
			if(fashion3.isDisplayed()) {
				fashion3.click();
				//hover.moveToElement(fashion3).perform();
				timeout();
				test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Abaya & Gown Section successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Abaya & Gown Section successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Abaya & Gown Section successful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			     } 
		     }
		    catch(Exception e) {
	     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Abaya & Gown Section Not Working</b></p>");
	     		Throwable t = new InterruptedException("Exception");
	     		test.fail(t);
	     		@SuppressWarnings("unused")
	     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Abaya & Gown Section Not Working");
	     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Abaya & Gown Section Not Working.png";
	     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	     		Assert.assertTrue(fashion3.isDisplayed());
	     		PageDriver.getCurrentDriver().quit();
		 }
		    try {
			if(fashion4.isDisplayed()) {
				fashion4.click();
				timeout();
				test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Select an Item Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select an Item Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Select an Item Successful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		    }
		    catch(Exception e) {
	     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Select an Item Not Working</b></p>");
	     		Throwable t = new InterruptedException("Exception");
	     		test.fail(t);
	     		@SuppressWarnings("unused")
	     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select an Item Not Working");
	     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Select an Item Not Working.png";
	     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	     		Assert.assertTrue(fashion4.isDisplayed());
	     		PageDriver.getCurrentDriver().quit();
		 }
		    try {
			if(cart.isDisplayed()) {
				cart.click();
				timeout();
				test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Add to Cart Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Add to Cart Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Add to Cart Successful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		     }
		    }
		    catch(Exception e) {
	     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Add to Cart Not Working</b></p>");
	     		Throwable t = new InterruptedException("Exception");
	     		test.fail(t);
	     		@SuppressWarnings("unused")
	     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Add to Cart Not Working");
	     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Add to Cart Not Working.png";
	     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	     		Assert.assertTrue(cart.isDisplayed());
	     		PageDriver.getCurrentDriver().quit();
		 }  
		    try {
			if(gotocart.isDisplayed()) {
				gotocart.click();
				timeout();
				test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Goto Cart Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Goto Cart Successful");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Goto Cart Successful.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		     }
		    }
		    catch(Exception e) {
	     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Goto Cart Not Working</b></p>");
	     		Throwable t = new InterruptedException("Exception");
	     		test.fail(t);
	     		@SuppressWarnings("unused")
	     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Goto Cart Not Working");
	     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Goto Cart Not Working.png";
	     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	     		Assert.assertTrue(gotocart.isDisplayed());
	     		PageDriver.getCurrentDriver().quit();
		    }
		    try {
		    	if(pay.isDisplayed()) {
		    		pay.click();
		    		Thread.sleep(5000);
					test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Proceed to Pay Successful</b></p>");
	        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Proceed to Pay Successful");
	        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Proceed to Pay Successful.png";
	        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		    	}
		    }
		    catch(Exception e){
	     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Proceed to Pay Not Working</b></p>");
	     		Throwable t = new InterruptedException("Exception");
	     		test.fail(t);
	     		@SuppressWarnings("unused")
	     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Proceed to Pay Not Working");
	     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Proceed to Pay Not Working.png";
	     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	     		Assert.assertTrue(pay.isDisplayed());
	     		PageDriver.getCurrentDriver().quit();
		    }
	  }
} 