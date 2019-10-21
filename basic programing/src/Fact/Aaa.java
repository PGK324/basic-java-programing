package Fact;
import java.util.Scanner;

public class Aaa {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=s.nextInt();
		String arr[]=new String[n];
		int i=0;
		for(i=0;i<n;i++)
		{
			System.out.println("enter the values");
			arr[i]=s.next();
		}
		char c;
		for(i=0;i<n;i++)
		{
			c=arr[i].charAt(0);
			if((c=='a'||c=='e'||c=='i'||c=='o'||c=='u')||(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'))
			System.out.println(arr[i]);
			s.close();
		}
		
		// TODO Auto-generated method stub

	}

}
