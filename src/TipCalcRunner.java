import java.util.Scanner;

public class TipCalcRunner
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello welcome to Tip Calculator");
        System.out.println("-------------------------------");
        System.out.println();
        System.out.print("Please input the total bill: ");
        double tBill = input.nextDouble(); //user inputs the total bill amount
        System.out.print("Please input the tip percentage (in a whole number, without the percentage sign): ");
        double tTip = input.nextDouble(); //user inputs the percentage amount in whole number
        System.out.print("Please input the number of people in the party: ");
        int people = input.nextInt(); //user inputs the total number of people in the party
        System.out.println();

        TipCalculator tipCalc = new TipCalculator(tTip, people);
        tipCalc.addMeal(tBill);

        System.out.print("Total tip amount: ");
        System.out.printf("%.2f", tipCalc.getTipAmount());
        System.out.println();
        System.out.print("Total bill including tip: ");
        System.out.printf("%.2f", tipCalc.getTotalBill());
        System.out.println();
        System.out.print("Tip per person: ");
        System.out.printf("%.2f", tipCalc.getPerPersonTipAmount());
        System.out.println();
        System.out.print("Total per person: ");
        System.out.printf("%.2f", tipCalc.getPerPersonTotalCost());
        System.out.println();
        System.out.println("-------------------------------");

    }
}
