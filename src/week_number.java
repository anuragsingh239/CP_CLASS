import java.util.Scanner;

public class week_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number= sc.nextInt();
        if(number<1||number>7){
            System.out.println("Please enter number greater than 1 and less than 7");
        }
        if(number==1){
            System.out.println("Sunday");
        }
        if(number==2){
            System.out.println("Monday");
        }
        if(number==3){
            System.out.println("Tuesday");
        }
        if(number==4){
            System.out.println("Wednesday");
        }
        if(number==5){
            System.out.println("Thursday");
        }
        if(number==6){
            System.out.println("Friday");
        }
        if(number==7){
            System.out.println("Saturday");
        }
    }
}
