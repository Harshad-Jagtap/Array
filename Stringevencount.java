import java.util.Scanner;

class Stringevencount
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String a=new String[10];

System.out.println("Enter the names");

int count=0;
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextLine();
}
for(int i=0;i<a.length;i++)
{
if(a[i].length()%2==0)
{
System.out.println(a[i]);
count++;
}
}
System.out.println("The count of even name is "+count);
}

}
