import java.util.Scanner;

class Namestring
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str[]=new String[5];
System.out.println("Enter the names ");

for(int i=0;i<str.length;i++)
{
str[i]=sc.nextLine();
   
if(str[i].equals("sita"))
{
System.out.println("The name found at index ");
System.out.println(i);
//break;
}
}

}
}