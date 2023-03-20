//Java Program to check whether the given character is an alphabet or not
import java.util.Scanner;
public class Character_or_not {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character ");
        char ch=sc.next().charAt(0);
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
            System.out.print(ch+" is an Alphabet ");
        }
        else
        {
            System.out.print(ch+" is not an Alphabet ");
        }
    }
}