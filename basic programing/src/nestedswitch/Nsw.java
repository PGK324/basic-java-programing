package nestedswitch;
import java.util.Scanner;

public class Nsw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//v-veg,n-non veg
		Scanner n=new Scanner(System.in);
	    System.out.println("Enter your menu");
	    int st=n.nextInt();	
		switch(st)
		{
			case 1:
				System.out.println("veg");
		break;
		case 2:
			System.out.println("chapthi,kuruma ");
		    int t=n.nextInt();
			switch(t)
			{
			case 1:
				System.out.println("non veg");
           break;
			case 2:
				System.out.println("chicken biriyani");

          break;
			
			}
		}
		
		

	}

}
