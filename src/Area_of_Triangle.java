import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base: ");
        double b=sc.nextInt();
        System.out.print("Enter height: ");
        double h= sc.nextInt();
        double area=(b*h)/2;
        System.out.println("area of traiangle is:"+area);
    }
}
