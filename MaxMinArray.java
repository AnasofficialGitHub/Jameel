//maximum and minimun number of an array
import java.util.*;
public class MaxMinArray
{
public static void main(String args[])
{
	int arr[]=new int[20];
	int i,n,max,min;
	System.out.println("Enter the length of array:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		System.out.println("Enter the elements of array");
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
			max=arr[0];
			min=arr[0];
			for(i=1;i<n;i++){
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
			}
			System.out.println("Max of array = "+max);
			System.out.println("Min of array = "+min);
}}