import java.util.Scanner;

public class valid_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side  : ");
        int side1 = sc.nextInt();
        System.out.print("Enter the second side : ");
        int side2 = sc.nextInt();
        System.out.print("Enter the third side : ");
        int side3 = sc.nextInt();
        if((side1+side2+side3)==180){
            System.out.println(" It is valid Triangle");
        }
        else{
            System.out.println("Not valid triangle");
        }
    }
}
