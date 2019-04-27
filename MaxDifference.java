import java.util.Scanner;
public class MaxDifference
{
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++)
 {
     a[i]=sc.nextInt();
 }
 int diff=-1;
 int min=a[0];
 for(int i=1;i<a.length;i++)
 {
     if (diff<a[i]-min)
      diff=a[i]-min;
     if (min>a[i])
      min=a[i];
 }
System.out.println(diff);
}
}
