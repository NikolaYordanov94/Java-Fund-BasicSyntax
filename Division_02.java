package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Division_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = Integer.parseInt(scanner.nextLine());
        String divisible = "";

        if(integer % 10 == 0){
            divisible = "The number is divisible by 10";
        }else if(integer % 7 == 0){
            divisible = "The number is divisible by 7";
        }else if (integer % 6 == 0){
            divisible = "The number is divisible by 6";
        }else if(integer % 3 == 0){
            divisible = "The number is divisible by 3";
        }else if (integer % 2 == 0){
            divisible = "The number is divisible by 2";
        }else{
            divisible = "Not divisible";
        }
        System.out.println(divisible);
    }
}
