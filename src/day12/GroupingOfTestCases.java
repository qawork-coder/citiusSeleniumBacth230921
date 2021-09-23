package day12;

import org.testng.annotations.Test;

public class GroupingOfTestCases {

	
	@Test(groups = {"Regression"})
	public void testCase()
	{
		System.out.println("test1");
	}
	
	
	@Test(groups = {"Sanity","Regression"})
	public void testCase2()
	{
		System.out.println("test2");
	}
	
	@Test
	public void testCase3()
	{
		System.out.println("test3");
	}
}
