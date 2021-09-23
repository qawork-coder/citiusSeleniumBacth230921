package day1;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b =20;
		
		
		System.out.println(++a);//11
		System.out.println(a++);//11
		System.out.println(a);//12
		
		System.out.println(--b);//19
		System.out.println(b--);//19
		System.out.println(b);//18
		
		System.out.println(10%3);//1
		
		System.out.println("------------------");
		
		System.out.println(a>10);//true
		System.out.println(a!=10);//true
		System.out.println(a==10);//false
		System.out.println(a>=20);//false
		
		System.out.println("------------------");
		
		System.out.println(a+=-20);//a=a-20 //-8
		
		System.out.println("------------------");
		
		System.out.println((a>10)&&(a>20));//T&&F//F
		System.out.println((a>10)||(a>20));//T||F//F
		
		System.out.println(!((a>10)||(a>20)));//T||F//!F//T
		
	}

}
