import java.util.Scanner;

public class ReverseTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for (int i = 10; i >0; i--) {
            System.out.println(n +"*"+ i+"="+n*i );
        }
    }
}
