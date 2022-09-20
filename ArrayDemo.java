import java.util.*;
public class ArrayDemo
{
public static void main(String args[])
{
	int n=5;
	int arr[]=new int[5];
	System.out.println("Enter elements of array");
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<n;i++)
		arr[i]=scan.nextInt();
	String str=Arrays.toString(arr);
	System.out.println(str);}}