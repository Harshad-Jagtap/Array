//Created a java program to take user input of elements of an array of String Type and  then count the number of string which has even length of string.



import java.util.Scanner;												//imported Scanner class to take user input

public class  Array_StringLenght_isEven 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str[]=new String[5];		    							//Declared an array of String type	
		int count=0;
		System.out.println("Enter elements of array of size "+str.length+" : - ");
		for(int i=0;i<str.length;i++)									//using loop we can initialize values 
		{
			str[i]=sc.nextLine();
		}
		for(int j=0;j<str.length;j++)									//using loop for checking the length of string is even or not and count it.
		{
			if(str[j].length()%2==0)									//used length() method to check the length of the string
			{
				System.out.print(str[j]+"  ");
				count++;												//update the value of count
			}
			System.out.println();
		}

		System.out.println("count of even length of elements is "+ count);

	}
}