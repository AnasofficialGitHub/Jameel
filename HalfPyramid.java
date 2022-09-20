//Half pyramid
import java.util.*;
public class HalfPyramid
{
	public static void main(String[] args)
	{
		int i,j,n;
		System.out.println("Enter the no. of rows to be printed:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
}
}
}