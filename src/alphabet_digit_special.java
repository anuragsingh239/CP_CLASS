import java.util.Scanner;

public class alphabet_digit_special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character ");
        char ch = sc.next().charAt(0);
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
            System.out.print(ch+" is an Alphabet ");
        }
        if((ch>='0'&&ch<='9')){
            System.out.println(ch+" is digit");
        }
        else{
            System.out.println(ch+" is special character");
        }
    }
}
