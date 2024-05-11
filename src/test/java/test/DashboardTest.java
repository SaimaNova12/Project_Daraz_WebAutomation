package test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.DashboardPage;
import utility.ExtentFactory;

public class DashboardTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest1;
	ExtentTest childTest1;
	
	   @BeforeClass
	   public void openUrl() { 
		   report = ExtentFactory.getInstance();
		   parentTest1 = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>DASHBOARD TEST</b></p>").assignAuthor("QA TEAM").assignDevice("window");
		   
	   }
	   
	   @Test(priority=2)
	   public void Dashboard() throws InterruptedException, IOException {
		   childTest1 = parentTest1.createNode("<p style = \"color:#3E96E7; font-size:20px\">DASHBOARD TEST</p>");
		   DashboardPage th = new DashboardPage(childTest1);
		   th.fashion();
	   }
	   
	    @AfterClass
	    public void afterClass() {
	        report.flush();
	    }
	   
}
