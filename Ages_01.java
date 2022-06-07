package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Ages_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String type = "";

        if(age >= 0 && age <= 2){
            type = "baby";
        }else if(age >= 3 && age <= 13){
            type = "child";
        }else if(age >= 14 && age <= 19){
            type = "teenager";
        }else if(age >= 20 && age <= 65){
            type = "adult";
        }else if(age >= 66){
            type = "elder";
        }else{
            type = "inclusive";
        }
        System.out.println(type);
    }
}
