import java.util.Scanner;

public class no_of_notes {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int totalAmount=sc.nextInt();
        int arr[] = {500, 100, 50, 20, 10, 5,1};
        int temp = totalAmount;
        if(totalAmount==500){
            System.out.println("Number of "+totalAmount+" notes = "+temp / totalAmount);
            temp = temp % totalAmount;
        }
        if(totalAmount==200){
            System.out.println("Number of "+totalAmount+" notes = "+temp / totalAmount);
            temp = temp % totalAmount;
        }
        if(totalAmount==100){
            System.out.println("Number of "+totalAmount+" notes = "+temp / totalAmount);
            temp = temp % totalAmount;
        }
        if(totalAmount==50){
            System.out.println("Number of "+totalAmount+" notes = "+temp / totalAmount);
            temp = temp % totalAmount;
        }
        if(totalAmount==20){
            System.out.println("Number of "+totalAmount+" notes = "+temp / totalAmount);
            temp = temp % totalAmount;
        }
        if(totalAmount==10){
            System.out.println("Number of "+totalAmount+" notes = "+temp / totalAmount);
            temp = temp % totalAmount;
        }
        if(totalAmount==5){
            System.out.println("Number of "+totalAmount+" notes = "+temp / totalAmount);
            temp = temp % totalAmount;
        }
        if(totalAmount==1){
            System.out.println("Number of "+totalAmount+" notes = "+temp / totalAmount);
            temp = temp % totalAmount;
        }
    }
}
