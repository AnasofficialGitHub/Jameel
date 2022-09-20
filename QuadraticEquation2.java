import java.util.Scanner;
public class QuadraticEquation2
{
public static void main(String[] args){
	double d,sqrt,r1,r2;
	System.out.println("Enter a");
	Scanner scan=new Scanner(System.in);
	double a=scan.nextInt();
	System.out.println("Enter b");
	double b=scan.nextInt();
	System.out.println("Enter c");
	double c=scan.nextInt();
	d=b*b-4*a*c;
	sqrt=Math.sqrt(d);
	if(d>0.0){
		r1=((-b+sqrt)/2*a);
		r2=((-b-sqrt/2*a));
	System.out.println("roots are ::"+r1+"and"+r2);}
	else if(d==0.0){
	System.out.println("root is:"+((-b+sqrt)/2*a));
	}
}
}
		
	

