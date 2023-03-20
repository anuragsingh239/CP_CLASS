import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        float a=sc.nextFloat();
        if(a%5==0&&a%11==0){
            System.out.println("Divisible");
        }else{
            System.out.println("Not divisible");
        }
    }
}
