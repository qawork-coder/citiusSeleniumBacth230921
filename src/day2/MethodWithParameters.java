package day2;

public class MethodWithParameters {

	public void checkEligibility(int age) {

		if (age >= 18) {
			System.out.println("eligible");
		} else {
			System.out.println("ineligile ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithParameters obj = new MethodWithParameters();
		obj.checkEligibility(0);

	}

}
