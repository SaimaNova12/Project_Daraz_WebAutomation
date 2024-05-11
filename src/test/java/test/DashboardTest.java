package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.DashboardPage;

public class DashboardTest extends BaseDriver{
	
	   @Test(priority=2)
	   public void Dashboard() throws InterruptedException, IOException {
		   DashboardPage th = new DashboardPage();
		   th.fashion();
	   }
}
