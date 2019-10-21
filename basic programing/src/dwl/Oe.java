package dwl;

import java.util.Scanner;


public class Oe {

public static void main(String[] args)
{
	Scanner n=new Scanner(System.in);
    System.out.println("Enter the size");
    int s=n.nextInt();
    int i=0;
    int sum=0;
    int b=0;
    int sum1=0;
    int c=0;
    int e=0;
    int o=0;
    int[] a=new int[s];

for(i=0;i<s;i++)
{
	System.out.println("enter the values");
	a[i]=n.nextInt();
   if(a[i]%2==0)
{
    sum=sum+a[i];
    b++;
}
 else
{
  sum1=sum1+a[i];
c++;
}


}
e=sum/b;
o=sum1/c;
System.out.println("Average of even numberes"+e);
System.out.println("Average of odd numbers "+o);
		// TODO Auto-generated method stub

}
}
