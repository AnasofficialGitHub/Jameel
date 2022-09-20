import java.util.*;
public class StringRev {
	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		//char arr[]=new char[20];
		char arr[]=str.toCharArray();
		System.out.println("reversed string: ");
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]);

}}
