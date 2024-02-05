//create a program student and their marks
import java.util.Scanner;
class Student
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str[]=new String[1];
System.out.println("Enter how many students name and marks you want to print ");
int b=sc.nextInt();

for(int j=1;j<=b;j++)
{
System.out.println("Enter the name of student ");
int i=0;
str[i]=sc.nextLine();
System.out.println("Enter the marks of student ");
double a=sc.nextInt();


System.out.println("The name of student is "+str[i]);
System.out.println("The marks of student is "+a);
}
}
}