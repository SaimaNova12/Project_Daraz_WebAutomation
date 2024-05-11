package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.LoginPage;
import utility.Dataset;


public class LoginTest extends BaseDriver{
     
	   @BeforeClass
	   public void openUrl() {
		   PageDriver.getCurrentDriver().manage().window().maximize(); 
	       PageDriver.getCurrentDriver().get(url);
}
	   
	  /* public void loginwithvalid() throws InterruptedException, IOException{
		   LoginPage th = new LoginPage();
		   th.login("01644417057", "saima34");
	   }
	   
	   @Test(priority=2)
	   public void LoginwithInvalid1() throws InterruptedException, IOException{
		   LoginPage th = new LoginPage();
		   th.login("01644417050", "saima34");
	   }*/
	   
	   @Test(priority = 1,dataProvider = "invaliddata", dataProviderClass = Dataset.class)
	   public void LoginwithInvalid2(String username, String password) throws InterruptedException, IOException{
		   LoginPage th = new LoginPage();
		   th.login(username, password);
	   } 
	  /* @Test(priority=1, dataProvider = "invaliddatafromexcel", dataProviderClass = Dataset.class)
	   public void LoginwithInvalid3(String username, String password) throws InterruptedException, IOException{
		   LoginPage th = new LoginPage();
		   th.login(username, password);
	   }*/
}
