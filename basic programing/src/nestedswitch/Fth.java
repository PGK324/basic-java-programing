package nestedswitch;
import java.util.Scanner;


public class Fth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		switch(n) 
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
			System.out.println("31 days");
		break;
		case 4:
		case 6:
		case 11:
		case 12:
			System.out.println("30 days");
		break;
		case 2:
			System.out.println("28 days or 29 days");	
		}
		
		
		// TODO Auto-generated method stub

	}

}
