//separate positive and negative numbers in an arryay
import java.util.*;
public class ArraySort{
public static void main(String args[]){
int i,j,n=10;
int arr[]=new int[20];
Scanner scan=new Scanner(System.in);
for(i=0;i<n;i++)
	arr[i]=scan.nextInt();
for(i=0;i<n;i++)
{
	if(arr[i]>0)
System.out.print(arr[i]);}
for(j=0;j<n;j++)
{
	if(arr[i]<0)
System.out.print(arr[i]);}}
}

	
