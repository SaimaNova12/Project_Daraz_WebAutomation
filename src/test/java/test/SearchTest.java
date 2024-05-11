package test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.SearchPage;
import utility.ExtentFactory;

public class SearchTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest3;
	ExtentTest childTest3;
	
	   @BeforeClass
	   public void openUrl() { 
		   report = ExtentFactory.getInstance();
		   parentTest3 = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>SEARCH TEST</b></p>").assignAuthor("QA TEAM").assignDevice("window");
		   
	   }
	
	   @Test(priority=4)
	   public void Dashboard() throws InterruptedException, IOException {
		   childTest3 = parentTest3.createNode("<p style = \"color:#3E96E7; font-size:20px\">SEARCH TEST</p>"); 
		   SearchPage th = new SearchPage(childTest3);
		   th.search();
	   }
	   
	   @AfterClass  
	   public void afterclass() {
	  	 report.flush();
	   }

}
