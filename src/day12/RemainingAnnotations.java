package day12;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class RemainingAnnotations {

	
	
	@AfterSuite
	public void afterSuite()
	{
		
		System.out.println("AfterSuite");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@BeforeMethod
	public void BeforeMethod1()
	{
		System.out.println("BeforeMethod1");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("@AfterMethod");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("@AfterClass");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("@AfterTest");
	}
	
	@Test
	public void testScenario()
	{
		System.out.println("testCase");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		
		System.out.println("BeforeSuite");
	}
	
}
