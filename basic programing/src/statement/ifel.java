package statement;
import java.util.Scanner;

public class ifel {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		if(a<18)
		{
			System.out.println("child");
		}
		else if(a<20)
		{
			System.out.println("young");	
		}
		else if(a>30 && a<60)
				{
			System.out.println("midle age");
				}
		else
		{
			System.out.println("old");	
		}
		// TODO Auto-generated method stub

	}

}
