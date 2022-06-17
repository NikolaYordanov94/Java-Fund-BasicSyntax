package BasicSyntaxMoreExercises;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double price = 0.00;
        double totalSpentMoney = 0.00;

        while(!command.equals("Game Time")){

            switch (command){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    totalSpentMoney += price;
                    if (currentBalance <= 0){
                        System.out.println("Out of money!");
                        break;
                    }else if(price > currentBalance){
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                    }else{
                        System.out.printf("Bought %s%n", command);
                        currentBalance -= price;
                    }
                    break;
                case "CS: OG":
                    price = 15.99;
                    totalSpentMoney += price;
                    if (currentBalance <= 0){
                        System.out.println("Out of money!");
                        break;
                    }else if(price > currentBalance){
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                    }else{
                        System.out.printf("Bought %s%n", command);
                        currentBalance -= price;
                    }
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    totalSpentMoney += price;
                    if (currentBalance <= 0){
                        System.out.println("Out of money!");
                        break;
                    }else if(price > currentBalance){
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                    }else{
                        System.out.printf("Bought %s%n", command);
                        currentBalance -= price;
                    }
                    break;
                case "Honored 2":
                    price = 59.99;
                    totalSpentMoney += price;
                    if (currentBalance <= 0){
                        System.out.println("Out of money!");
                        break;
                    }else if(price > currentBalance){
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                    }else{
                        System.out.printf("Bought %s%n", command);
                        currentBalance -= price;
                    }
                    break;
                case "RoverWatch":
                    price = 29.99;
                    totalSpentMoney += price;
                    if (currentBalance == 0){
                        System.out.println("Out of money!");
                        break;
                    }else if(price > currentBalance){
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                    }else{
                        System.out.printf("Bought %s%n", command);
                        currentBalance -= price;
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    command = scanner.nextLine();
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totalSpentMoney, currentBalance);
    }
}
