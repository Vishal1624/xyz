import java.util.Scanner;
public class Xor {
    public static void main(String []args){
        int  a =4;
        int b = 3;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("new value of a :" + a);
        System.out.println("new value of b :" + b); 
    }
}
