package day3;

public class MethodOverloading {

	public void sum() {

	}

	public void sum(int n) {

	}

	public void sum(double n) {

	}

	public void sum(double n, int a) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.sum(10.2, 10);
	}

}
