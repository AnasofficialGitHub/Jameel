import java.util.*;
public class AreaPeri
{
public static void main(String args[])
{
	System.out.println("Enter the radius: ");
	Scanner scan=new Scanner(System.in);
	double rad=scan.nextDouble();
	System.out.println("Area :"+3.14*rad*rad);
	System.out.println("Perimeter :"+2*3.14*rad);
	}}
