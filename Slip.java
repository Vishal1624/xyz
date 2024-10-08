import java.util.Scanner;
public class Slip {
    public static void main(String[] args){
        System.out.println("Your Order Slip");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String Name = sc.nextLine();
        System.out.println("how many items did you purchased");
        int a = sc.nextInt();
        for (int i = 1; i<=a;i++){
            System.out.println("Product name");
            String Product = sc.next();
            System.out.println("Product Price");
            double Price = sc.nextDouble();
            System.out.println("Tax to be Paid");
            double Tax = sc.nextDouble();
            double Sum = Price + (Tax/100)*Price;
            System.out.println("Total Amount To Pay: "+ Sum);
        }
        System.out.println("Thank You");
    }
}
