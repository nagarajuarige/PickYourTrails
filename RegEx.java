import java.util.Scanner;
public class RegEx
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   int counta=0,countb=0;
   int i;
   for(i=0;i<str.length();i++)
   {
       if(str.charAt(i)=='a' || str.charAt(i)=='c')
       counta++;
       else if(str.charAt(i)=='b' || str.charAt(i)=='d')
       countb++;
   }
   if(counta%2==0 && countb%2==0)
System.out.println("true");
else
System.out.println("false");
}
}