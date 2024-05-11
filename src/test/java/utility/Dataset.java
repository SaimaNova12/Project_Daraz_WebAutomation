package utility;

import org.testng.annotations.DataProvider;

public class Dataset {
      
	@DataProvider(name = "invaliddata")
	public static Object invalidlogindata() {
		Object[][] object = {{"01988812708", "pass34"},{"01988812708", "pass34"},{"01988812708", "pass34"},{"01644417057", "saima34"}}; 
		return object;	
	}

	
}
