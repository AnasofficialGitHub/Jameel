//Rotating array in clockwise direction
import java.util.*;
public class RotateArray
{
	public static void main (String [] args)
	{
		int i,j,last,r;
		int arr[]=new int[10];
		System.out.println("Enter the length of array:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("Enter the elements of array");
		for(i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Original Array : ");
		for(i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println("Enter the rotation amount: ");
		r=scan.nextInt();
		for(i=0;i<r;i++)
		{
			last=arr[n-1];
			for(j=n-1;j>0;j--){
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println("Array after rotation: ");
		for(i=0;i<n;i++){
		System.out.println(arr[i]+" ");
		}
}
}
