package test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.LoginPage;
import utility.Dataset;
import utility.ExtentFactory;


public class LoginTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

     
	   @BeforeClass
	   public void openUrl() {
		   report = ExtentFactory.getInstance();
		   parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>Login Test</b></p>");
		   PageDriver.getCurrentDriver().manage().window().maximize(); 
	       PageDriver.getCurrentDriver().get(url);
	 	  
	 	   }

	   
	   @Test(priority = 1,dataProvider = "invaliddata", dataProviderClass = Dataset.class)
	   public void LoginwithInvalid2(String username, String password) throws InterruptedException, IOException{
		   childTest = parentTest.createNode("<p style = \"color:#3E96E7; font-size:20px\">LOGIN TEST</p>");
		   LoginPage th = new LoginPage(childTest);
		   th.login(username,password);

	   } 
	    @AfterClass
	    public void afterClass() {
	        report.flush();
	    }

	   
}
