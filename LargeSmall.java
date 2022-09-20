import java.util.Scanner;
public class LargeSmall
{
	Public static void main(String[] args){
	System.out.println("Enter a number:");
	Scanner scan=new Scanner(System.in);
	double n=scan.nextDouble();
	if(n>0)
	{
		if(n<1)
		{
			System.out.println("Positive small number");
		}
		else if(n>100000){
			System.out.println("Positive large number");
		}
		else{
			System.out.println("Positive number");}}
	else if(n<0)
	{
		if(math.abs(n)<1){
				System.out.println("negative small number");}
			else if(math.abs(n)>100000){
				System.out.println("negative large number");}
			else{
				System.out.println("Positive  number");}}
	else{
System.out.println("zero");}}}


		

