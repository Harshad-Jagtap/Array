//Created a java program to take user input of elements of an array of char Type and  then count the number of char which has even length of char.
//with ASCII value
import java.util.Scanner;
class charEven
{
public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char c[]=new char[5];		    								
		int count=0;
		System.out.println("Enter elements of array of size "+c.length+" : - ");
		for(int i=0;i<c.length;i++)									
		{
			c[i]=sc.next().charAt(0);
		}
		for(int i=0;i<c.length;i++)									
		{
			if(c[i]%2==0)									
			{
				System.out.print(c[i]+" even ascii ");
				count++;												
			}
			System.out.println();
		}

		System.out.println("\n count of even length of elements is "+ count);

	}
}