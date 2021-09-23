package day12;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestnG {
	
	@DataProvider(name = "testData")
	public Object[][] dataSet()
	{
		return new Object[][] {{"tj"}, {"Selenium"}};
	}

	
	@Test(dataProvider="testData")
	public void tc(String val)
	{
		System.out.println("value is "+ val);
	}
}
