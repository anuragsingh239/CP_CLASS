import java.util.Scanner;

public class uppercase_lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is uppercase");
        } else {
            System.out.println(ch + " is lowecase");
        }
    }
}
