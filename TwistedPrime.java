import java.util.*;
public class TwistedPrime
{
static int n;
static int remainder=0;
static int rev=0;
static int flag=1;
public static void main(String args[])
{

System.out.println("Enter a number");
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
if(n==0||n==1)
	flag=0;
TwistedPrime obj=new TwistedPrime();
obj.met(n);

while(n>0)
{
	remainder=n%10;
	rev=rev*10+remainder;
	n=n/10;
}
System.out.println("Reverse="+rev);
obj.met(rev);
if(n!=flag)
	System.out.println("So, It is a Twisted prime");
else
	System.out.println("So, It is not a Twisted prime");

}
static void met(int n){
	for(int i=2;i<=n/2;i++){
	if(n%i==0){
		flag=0;
		break;
	}}
	if(flag==1)
		System.out.println("It is a prime number");
	else 
		System.out.println("It is a not a prime number");
}}

