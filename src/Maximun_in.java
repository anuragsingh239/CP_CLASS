import java.util.Scanner;

public class Maximun_in {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number 1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();
        System.out.print("Enter third number: ");
        int num3= sc.nextInt();
//        if(num1>num2&&num1>num3){
//            System.out.println(num1);
//        }if(num2>num1&&num2>num3){
//            System.out.println(num2);
//        }else{
//            System.out.println(num3);
//        }
        int max=Math.max(num1,num2);
        int output=Math.max(max,num3);
        System.out.println(output);
    }
}
