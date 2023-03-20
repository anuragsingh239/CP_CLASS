//Corecsion of data type means changing of small data type into large data type
public class Operator {
    public static void main(String[] args) {
//        int a=14,b=5;
//        int c=a/b;
//        int r=a%b;
//        System.out.println(c);
//        System.out.println(r);
        int a=14,b=5;
        float c=(float) a/b;
        int r=a%b;
        System.out.println(c);
        System.out.println(r);
        float d= (float) 14.3,e=3.2f;
        int rr= (int) (d%e);
        System.out.println(rr);
    }
}

