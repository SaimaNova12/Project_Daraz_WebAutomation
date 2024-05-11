package test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.MultipleItemSelection;
import utility.ExtentFactory;

public class MultipleSelectionTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest4;
	ExtentTest childTest4;
	
	   @BeforeClass
	   public void openUrl() { 
		   report = ExtentFactory.getInstance();
		   parentTest4 = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>MULTIPLESELECTION TEST</b></p>").assignAuthor("QA TEAM").assignDevice("window");
		   
	   }
	
	   @Test(priority=5)
	   public void Dashboard() throws InterruptedException, IOException {
		   childTest4 = parentTest4.createNode("<p style = \"color:#3E96E7; font-size:20px\">MULTIPLESELECTION TEST</p>"); 
		   MultipleItemSelection th = new MultipleItemSelection(childTest4);
		   th.multiple();
	   }
	   
	   @AfterClass  
	   public void afterclass() {
	  	 report.flush();
	   }
}
