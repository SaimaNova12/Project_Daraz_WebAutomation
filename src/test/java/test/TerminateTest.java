package test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.TerminatePage;
import utility.ExtentFactory;

public class TerminateTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest5;
	ExtentTest childTest5;
	
	   @BeforeClass
	   public void openUrl() { 
		   report = ExtentFactory.getInstance();
		   parentTest5 = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>TERMINATE TEST</b></p>").assignAuthor("QA TEAM").assignDevice("window");
		   
	   }
	
	   @Test(priority=6)
	   public void Dashboard() throws InterruptedException, IOException {
		   childTest5 = parentTest5.createNode("<p style = \"color:#3E96E7; font-size:20px\">TERMINATE TEST</p>");
		   TerminatePage th = new TerminatePage(childTest5);
		   th.terminate();
	   }
	   
	   @AfterClass  
	   public void afterclass() {
	  	 report.flush();
	   }

}
