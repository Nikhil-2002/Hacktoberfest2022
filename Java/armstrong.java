import java.util.*;
 class Armstrong
 {
  public static void main(String args[])
{
Scanner arm=new Scanner(System.in);
System.out.println("Enter any digit number: ");
int n=arm.nextInt();
int temp=n;
int a;
double r=0;
int d=count(temp);

while(n!=0)
{
a=n%10;
r=r+Math.pow(a,d);
n=n/10;
}

if(temp==r)
{
  System.out.println(temp +" is a Armstrong number");
}
else
{
  System.out.println(temp +" is Not a Armstrong number");
}
}
public static int count(int x)
{
 int c=0;
  while(x!=0)
   {
  x=x/10;
  c++;
   }
return c;
}

}
