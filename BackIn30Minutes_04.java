package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeHours = Integer.parseInt(scanner.nextLine());
        int timeMinutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (timeHours * 60) + timeMinutes + 30;

        int hours = allMinutes / 60;
        int minutes = allMinutes % 60;

        if(hours > 23){
            hours = 0;
        }
        if (minutes > 59){
            minutes = 0;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
