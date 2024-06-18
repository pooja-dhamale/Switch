package Switchh;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=12;
		switch(a+b)
		{
		case 1:System.out.println(a+b);
		break;
		case 2:System.out.println(a-b);
		break;
		case 3:System.out.println(a*b);
		break;
		case 4:System.out.println(a%b);
		break;
		case 5:System.out.println(a/b);
		break;
		default: System.out.println("Invalid");
		
		
		}
	}

}
