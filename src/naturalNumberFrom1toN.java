import java.util.Scanner;

public class naturalNumberFrom1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            System.out.println(i);
//        }
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
