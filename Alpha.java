import java.util.*;
public class Alpha
{
public static void main(String args[])
{
	int n;
	char alp;
	Scanner scan=new Scanner(System.in);
	//System.out.println("Enter number of letters you need to enter");
	//n=scan.next);
	//System.out.println("Enter alphabets");
	char arr[]=new char[10];
	for(int i=0;i<arr.length;i++)
		arr[i]=scan.next().charAt(i);
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>='a'&&arr[i]<='z')
		{
			alp=(char)(122-(int)arr[i]+97);
			System.out.print(alp);
			}
		else if(arr[i]>='A'&&arr[i]<='Z')
		{
			alp=(char)(90-(int)arr[i]+65);
			System.out.print(alp);
			}
		else
			System.out.println("Enter alphabets only");			
	}
}}
			