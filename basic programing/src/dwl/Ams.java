package dwl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ams {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,r;
		int sum=0;
		System.out.println("enter the number");
		a=Integer.parseInt(br.readLine());
		while(a!=0)
		{
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		System.out.println(sum);
		}
		// TODO Auto-generated method stub

	}
