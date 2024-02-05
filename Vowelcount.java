import java.util.Scanner;

class Vowelcount
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char chararr[]=new char[5];

System.out.println("Enter the charachers");
for(int i=0;i<chararr.length;i++)
{
chararr[i]=sc.next().charAt(0);
}
int count=0;
for(int i=0;i<chararr.length;i++)
{
if(chararr[i]=='a'||chararr[i]=='e'||chararr[i]=='i'||chararr[i]=='o'||chararr[i]=='u')
{
count++;
}

}
System.out.println("the numbers of vowel in char is "+count);
}
}