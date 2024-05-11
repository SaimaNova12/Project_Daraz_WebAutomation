package test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.LogoutPage;
import utility.ExtentFactory;

public class LogoutTest extends BaseDriver{
     
	ExtentReports report;
	ExtentTest parentTest2;
	ExtentTest childTest2;
	
	   @BeforeClass
	   public void openUrl() { 
		   report = ExtentFactory.getInstance();
		   parentTest2 = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>LOGOUT TEST</b></p>").assignAuthor("QA TEAM").assignDevice("window");
		   
	   }
	
	   @Test(priority=3)
	   public void Dashboard() throws InterruptedException, IOException {
		   childTest2 = parentTest2.createNode("<p style = \"color:#3E96E7; font-size:20px\">LOGOUT TEST</p>");
		   LogoutPage th = new LogoutPage(childTest2);
		   th.logout();
	   }
	   
	   @AfterClass  
	   public void afterclass() {
	  	 report.flush();
	   }
}
