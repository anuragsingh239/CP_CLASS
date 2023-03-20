import java.util.*;
public class Literal {
    public static void main(String[] args) {
        byte b=15;
        short s= 15;
        int i=15;

        byte  b1= 10;
        byte b2= 0b1010;
        byte b3 = 012;
        byte b4 =0XA;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    long l=999999999999l;
        System.out.println(l);

        long ll=999_999_999;
        float f=123_456.56f;
        float ff=123_456.56f;
        System.out.println(f);
        System.out.println(ll);
        System.out.println(ff);
    }
}
