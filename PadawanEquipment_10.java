package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyBudget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double priceLightSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        int freeBelts = studentsCount / 6;

        double priceTotalLightSabers = priceLightSaber * Math.ceil(studentsCount * 1.10);
        double priceTotalRobes = priceRobe * studentsCount;
        double priceTotalBelts = priceBelt * (studentsCount - freeBelts);

        double totalPriceEquipment = priceTotalLightSabers + priceTotalRobes + priceTotalBelts;

        if(totalPriceEquipment <= moneyBudget){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPriceEquipment);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", totalPriceEquipment - moneyBudget);
        }
    }
}
