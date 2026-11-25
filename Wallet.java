import java.util.Scanner;
public class Wallet{
    public static void main(String[] args) {

        // char currency = '$';
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("QUICKPAY E-WALLET:");
        System.out.println("============================");
        
        System.out.println("Enter your Account holder name:");
        String accountHolderName = scanner.nextLine();
        
        System.out.println("Enter Account Number: ");
        long accountNumber = scanner.nextLong();
        
        System.out.println("Enter your balance: ");
        double accountBalance = scanner.nextDouble();
        
        System.out.println("============================");
        System.out.println("RECORD CAPTURED");
        System.out.println("============================");
        
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Balance NGN: %,.2f%n " , accountBalance);
        
        System.out.println("============================");
        





        scanner.close();
    }
}