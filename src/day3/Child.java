package day3;

public class Child extends Parent{

	public void method2()
	{
		System.out.println("Child");
	}
	
	public static void main(String args[])
	{
		Child obj=new Child();
		obj.method1();
		obj.method2();
	}
}
