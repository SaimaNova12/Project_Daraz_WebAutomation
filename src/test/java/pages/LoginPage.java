package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import drivers.PageDriver;
import utility.CommonMethods;


public class LoginPage extends CommonMethods{
	
	
     public LoginPage() {
    	 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
         
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
    			
    		} 
    	 }
    	 catch(Exception e) {
    		 System.out.println("Something went wrong");
    	 }
    	 
    	 try {
    		if(password.isDisplayed()) {
    			password.sendKeys(pass);
    			timeout();
    		} 
    	 }
    	 catch(Exception e) {
    		 System.out.println("Something went wrong");
    	 }
    	 try {
    		if(loginButton.isDisplayed()) {
    			loginButton.click();
    			timeout();
    		} 
    	 }
    	 catch(Exception e) {
    		 System.out.println("Something went wrong");
    	 }
    	 
    	 PageDriver.getCurrentDriver().navigate().refresh();
    	 timeout();
     }
}

