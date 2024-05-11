package utility;

import org.testng.annotations.DataProvider;

import drivers.BaseDriver;

public class Dataset{
      
	@DataProvider(name = "invaliddata")
	public static Object invalidlogindata() {
		Object[][] object = {{"88812703338", "saima34"},{"01644417057", "#pass34"},{"", "saima34"},{"01644417057", "saima34"}}; 
		return object;	
	}

	
}
