//Sum of array elements
import java.util.*;
public class Sum{
	public static void main(String []args){
		int n,i,sum=0;
		int arr[]=new int[];
		System.out.println("Enter number of elements:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		System.out.println("Enter the elements of array: ");
		for(i=0;i<=n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<=n;i++){
			sum+=arr[i];}
		System.out.println("Sum is: "+sum);}
	}

			
		