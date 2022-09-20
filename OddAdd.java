import java.util.Scanner;
public class OddAdd{
	public static void main(String[] args){
	int n,i,sum=0;
	System.out.println("Enter the number of terms:");
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	for(i=1;i<=n;i++){
		System.out.println(2*i-1);
	sum+=2*i-1;}
System.out.println("sum of odd numbers is:"+sum);}}



