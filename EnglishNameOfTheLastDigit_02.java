package BasicSyntaxMoreExercises;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String digitInEnglish = "";

        int lastDigit = n % 10;
        switch (lastDigit){
            case 0:
                digitInEnglish = "zero";
                break;
            case 1:
            digitInEnglish = "one";
            break;
            case 2:
                digitInEnglish = "two";
                break;
            case 3:
                digitInEnglish = "three";
                break;
            case 4:
                digitInEnglish = "four";
                break;
            case 5:
                digitInEnglish = "five";
                break;
            case 6:
                digitInEnglish = "six";
                break;
            case 7:
                digitInEnglish = "seven";
                break;
            case 8:
                digitInEnglish = "eight";
                break;
            case 9:
                digitInEnglish = "nine";
                break;
        }
        System.out.println(digitInEnglish);
    }
}
