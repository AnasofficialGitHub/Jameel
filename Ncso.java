//Program to find the no.of characters,numbers,spaces,others in a string.
import java.util.*;
public class Ncso{
	public static void main(String args[])
	{
		int number=0,space=0,character=0,spl=0;
		System.out.println("Enter a string:");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='0'&&arr[i]<='9')
				number++;
			else if(arr[i]>='a'&&arr[i]<='z'||arr[i]>='A'&&arr[i]<='Z')
				character++;
			else if(arr[i]==' ')
				space++;
			else
				spl++;
		}
		System.out.println("no. of digits in this string : "+number);
		System.out.println("no. of characters in this string : "+character);
		System.out.println("no. of spaces in this string : "+space);
		System.out.println("no. of other other characters in this string : "+spl);
	}
}

		//for(int i=0;i<arr.length;i++)
			//System.out.print(arr[i]);}}