package dwl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Amstrong {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int r;
		int sum=0;
		System.out.println("Enter The Number");
		int a=Integer.parseInt(br.readLine());
		int b=a;
		while(a!=0)
		{
			r=a%10;
			sum=(r*r*r)+sum;
			a=a/10;
		}
			if(sum==b)
				System.out.println("yes");
			else
				System.out.println("not");
		}
		// TODO Auto-generated method stub

	}


