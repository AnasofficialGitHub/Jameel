import java.util.Scanner;

public class Palindrome
{
public static void main (String[] args)

{

    String str, another = "y";

    int left, right;

    char charLeft, charRight;
	
    Scanner scan = new Scanner (System.in);


    while (another.equalsIgnoreCase("y")) // allows y or Y

    {

        System.out.println ("Enter a potential palindrome: ");

        str = scan.nextLine();

        left = 0;

        right = str.length() - 1;


        while (left < right)
        {
            charLeft = str.charAt(left);
            charRight = str.charAt(right);
			
            if (charLeft == charRight)
            {
                left++;
                right--;
            }

            else if (charLeft == ',' || charLeft == '.' ||
 charLeft == '-' || charLeft == ':' ||
 charLeft == ';' || charLeft == ' ')

                left++;

            else if (charRight == ',' || charRight == '.' ||
 charRight == '-' || charRight == ':' ||
 charRight == ';' || charRight == ' ')
                right--;
            else

                break;

        }

    System.out.println();


        if (left < right)
            System.out.println ("That string is NOT a palindrome.");
        else

            System.out.println ("That string IS a palindrome.");
        System.out.println();

    System.out.print ("Test another palindrome (y/n)? ");

    another = scan.nextLine();
    }

 }

}