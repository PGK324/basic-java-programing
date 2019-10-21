package statement;
import java.util.Scanner;

public class nif {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
	    System.out.println("Enter your Brand");
	    String st=n.nextLine();	
	    if(st.equals("HP"))
	    {
	    	System.out.println("Your brand is available");
	    	System.out.println("Enter your RAM size");
	    	 int rm=n.nextInt();
	    	 if(rm==16)
	    	 {
	    		 System.out.println("Your RAM is available");
	    		 
	    	 }
	    	 else
	    		 System.out.println("Your RAM is not available");
	    }
	    
	    else
	    {
	    	System.out.println("Your brand is not available");
	    }
		}
		
		// TODO Auto-generated method stub

	}


