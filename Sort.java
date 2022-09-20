//descending and ascending order of an array
import java.util.*;
public class Sort
{
public static void main(String args[])
{
	int i,j,temp,n;
	System.out.println("Enter number of elements of array:");
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	int arr[]=new int[11];
	for(i=0;i<n;i++)
		arr[i]=scan.nextInt();
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
	    arr[j]=temp;}}}
		System.out.println("ascended array");
			for(i=0;i<n;i++)
				System.out.println(arr[i]+" ");
		System.out.println("Descended array");
			for(i=n-1;i>0;i--)
				System.out.println(arr[i]+" ");		
				
				}}