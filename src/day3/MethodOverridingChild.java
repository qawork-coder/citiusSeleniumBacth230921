package day3;

public class MethodOverridingChild extends MethodOverridingBase{

	public void method1() {
		super.sum(10);
	}
	
	public void sum (int a)
	{
		System.out.println("child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverridingChild obj=new MethodOverridingChild();
		obj.sum(10);
		obj.method1();
		
		
	}

}
