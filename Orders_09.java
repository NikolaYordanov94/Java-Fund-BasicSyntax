package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double pricePerOrder = 0;
        double pricePerOrderTotal = 0;

        // ((daysInMonth * capsulesCount) * pricePerCapsule)
        for (int i = 1; i <= n; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            pricePerOrder = days * capsulesCount * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", pricePerOrder);
            pricePerOrderTotal += pricePerOrder;
        }
        System.out.printf("Total: $%.2f", pricePerOrderTotal);
    }
}
