import java.util.Scanner;

public class monthname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number= sc.nextInt();
        if(number<1||number>12){
            System.out.println("Please enter number greater than 1 and less than 7");
        }
        if(number==1){
            System.out.println("January");
        }
        if(number==2){
            System.out.println("February");
        }
        if(number==3){
            System.out.println("March");
        }
        if(number==4){
            System.out.println("April");
        }
        if(number==5){
            System.out.println("May");
        }
        if(number==6){
            System.out.println("June");
        }
        if(number==7){
            System.out.println("July");
        }
        if(number==8){
            System.out.println("August");
        }
        if(number==9){
            System.out.println("September");
        }
        if(number==10){
            System.out.println("October");
        }
        if(number==11){
            System.out.println("November");
        }
        if(number==7){
            System.out.println("December");
        }
    }
}
