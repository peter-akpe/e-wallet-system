import java.util.Scanner;

public class BankManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        double totalDeposits = 0;   // running total, declared OUTSIDE the loop
        int count = 0;              // number of valid deposits

        do {
            System.out.println("\n=========================");
            System.out.println("BANK MANAGER SYSTEM");
            System.out.println("=========================");
            System.out.println("1. Deposit Money");
            System.out.println("2. Check Your Balance");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();   // read the choice

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();

                    if (amount > 0 && amount <= 10000000) {
                        totalDeposits += amount;
                        count++;
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Invalid amount. Must be above 0 and not more than 10,000,000.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No deposits yet.");
                    } else {
                        System.out.printf("Total deposits: %.2f (%d deposits)%n", totalDeposits, count);
                    }
                    break;

                case 3:
                    System.out.println("Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice. Enter 1, 2, or 3.");
            }
        } while (choice != 3);

        scanner.close();
    }
}