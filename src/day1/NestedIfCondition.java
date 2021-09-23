package day1;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int age=20;
	String citizen="yes";
		
		if(age>=18)
		{
			System.out.println("eligible");
			
			if(citizen.contains("yes"))
			{
				System.out.println(" u r citozen");
			}
			else
			{
				System.out.println("not a citizen ");
			}
		}
		else
		{
			System.out.println("ineligile ");
		}
		
		
	}

}
