import java.util.Scanner;

class Evenindex
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num[]=new int[5];

System.out.println("Enter the numbers ");
for(int i=0;i<num.length;i++)
{
num[i]=sc.nextInt();
}
for(int i=2;i<num.length;i++)
{
if(i%2==0)
{
System.out.println("Even index number "+i+" the number is "+num[i]);
}
}
}
}