//numbers pyramid
import java.util.*;
public class NumberPyramid
{
	public static void main(String[] args)
	{
		int i,j,n,num=1;
		System.out.println("Enter the no. of rows to be printed:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
}
}
}