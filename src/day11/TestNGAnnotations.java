package day11;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test
	public void testCase()
	{
		System.out.println("testCase");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("testCase2");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
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
	
	
	
}
