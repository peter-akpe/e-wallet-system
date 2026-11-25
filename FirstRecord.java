
import java.util.Scanner;

public class FirstRecord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== [Your Project Name] — First Record ===");

        System.out.print("Enter Author: ");
        String field1 = input.nextLine();

        System.out.print("Enter Title ");
        String field2 = input.nextLine();

        System.out.print("Enter Price: ");
        double field3 = input.nextDouble();
        
        System.out.println("=======================");
        System.out.println("RECORD CAPTURED");
        System.out.println("=======================");
        System.out.println("Author: " + field1);
        System.out.println("Title: " + field2);
        System.out.println("Price NGN: " + field3);
        System.out.println("========================");
        input.close();
    }
}
