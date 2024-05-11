package utility;

import drivers.BaseDriver;

public class CommonMethods extends BaseDriver{
      
	public static void timeout() throws InterruptedException {
		Thread.sleep(1000);
	}	
	    public static void timeout(int time) throws InterruptedException {
	    Thread.sleep(time);
	}
}

