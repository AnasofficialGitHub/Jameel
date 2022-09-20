import java.util.*;

public class String1{
	public static void main(String args[]){
		System.out.println("Enter a string");
		Scanner scan = new Scanner(System.in);
		
		String sr = scan.next();
		char b[] = sr.toCharArray();
		
		for(int i=0;i<sr.length();i++){
			System.out.println(b[i]);
		}	
	}
}