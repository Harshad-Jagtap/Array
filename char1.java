import java.util.Scanner;
class char1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char char1arr[]= new char[5];


System.out.println("Enter the elements of char array");
for(int i=0;i<char1arr.length;i++)
{
char1arr[i]=sc.next().charAt(0);
}
for(int i=0;i<char1arr.length;i++)
{
System.out.println(" the value at "+i+"index is "+char1arr[i]);
}
}
}