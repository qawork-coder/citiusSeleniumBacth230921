package day2;

public class MethodWithNoReturnType {
	
	
		public void checkEligibility()
		{
			int age=10;
			
			if(age>=18)
			{
				System.out.println("eligible");
			}
			else
			{
				System.out.println("ineligile ");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithNoReturnType obj=new MethodWithNoReturnType();//Creation of the object
		obj.checkEligibility();//Calling of the method
		
	}

}
