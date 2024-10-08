//package input;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String Value = sc.next();
        calculator(x,y,Value);

        }

    public  static void calculator (int a , int b , String value) {
      int result;

        switch (value) {
            case "Add":
                result = a + b;
                System.out.println(result);
                break;
            case "diff":
                result = a - b;
                System.out.println(result);
                break;
            case "mul":
                result = a * b;
                System.out.println(result);
                break;
            case "div":
                result = a / b;
                System.out.println(result);
                break;
            case "mod":
                result = a % b;
                System.out.println(result);
                break;
            default:
                System.out.println("invalid choice");
        }

    }
}