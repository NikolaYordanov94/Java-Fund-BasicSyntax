package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. username  - text (вход)
        String username = scanner.nextLine();
        // 2. Празен стринг - парола
        String password = "";
        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }
        //3. Повтарящо се действие - въвеждане на парола
        // спираме, когато въведем правилна парола == password
        // продължаваме напред: въведената парола != password
        String enteredPassword = scanner.nextLine();
        int countFailed = 0; // брой грешно въведени пароли
        while (!enteredPassword.equals(password)){
            countFailed++;
            if(countFailed == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        // enteredPassword == password
        if(enteredPassword.equals(password)){
            System.out.printf("User %s logged in.", username);
        }
    }
}
