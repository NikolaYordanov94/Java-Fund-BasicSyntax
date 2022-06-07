package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0.00;
        double totalPrice = 0.00;

        switch (dayOfWeek){
            case "Friday":
                switch (typeOfGroup){
                    case"Students":
                        price = 8.45;
                        break;
                    case"Business":
                        price = 10.90;
                        break;
                    case"Regular":
                        price = 15.00;
                        break;
                }
                break;
            case"Saturday":
                switch (typeOfGroup){
                    case"Students":
                        price = 9.80;
                        break;
                    case"Business":
                        price = 15.60;
                        break;
                    case"Regular":
                        price = 20.00;
                        break;
                }
                break;
            case"Sunday":
                switch (typeOfGroup){
                    case"Students":
                        price = 10.46;
                        break;
                    case"Business":
                        price = 16.00;
                        break;
                    case"Regular":
                        price = 22.50;
                        break;
                }
                break;
        }
        totalPrice = price * numOfPeople;
        if(numOfPeople >= 30 && numOfPeople < 100 && typeOfGroup.equals("Students")){
            totalPrice = totalPrice * 0.85;
        }else if(numOfPeople >= 100 && typeOfGroup.equals("Business")){
            totalPrice = totalPrice - price * 10;
        }else if (numOfPeople >= 10 && numOfPeople <= 20 && typeOfGroup.equals("Regular")){
            totalPrice = totalPrice * 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
