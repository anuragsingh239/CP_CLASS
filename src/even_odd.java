import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        float a=sc.nextFloat();
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
