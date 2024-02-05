import java.util.Scanner;
class string
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str[]= new String[5];

System.out.println("Enter mahabharat name");
//for(int i=0;i<str.length;i++)
for(int i=0;i<5;i++)
{
str[i]=sc.nextLine();
}
System.out.println("Entered name is");
System.out.println(str[0]);
System.out.println(str[1]);
System.out.println(str[2]);
System.out.println(str[3]);
System.out.println(str[4]);
}
}