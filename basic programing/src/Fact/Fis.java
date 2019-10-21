package Fact;
import java.util.Scanner;

public class Fis {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int i=0;
		int gcd=0;
		int min=(a<b)?a:b;
		for(i=min;i>0;i--)
		{
		if(a%i==0 &&b%i==0)
			gcd=i;
		break;
		}
		System.out.println(gcd);
			
		}
		
		
		
		// TODO Auto-generated method stub

	}


