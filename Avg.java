import java.util.*;
public class Avg
{
public static void main(String args[])
{
	float n1,n2,n3;
	System.out.println("Enter 3 numbers:");
	Scanner scan=new Scanner(System.in);
	n1=scan.nextFloat();
	n2=scan.nextFloat();
	n3=scan.nextFloat();
	System.out.println("Average: "+(n1+n2+n3)/3);
}}
