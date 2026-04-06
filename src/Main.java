

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String name = "Shady";
        //int age = 28;
        double baseSalary = 29231.6667;
        //double yearlyBonus = 85000;
        double monthlyLiving = 7440;
        double monthlyCommitments = 14000;
        double monthlySurplus = baseSalary - monthlyLiving - monthlyCommitments;




        System.out.println("=== WEALTH APP v1.0 ===");
        System.out.println("Base salary: AED " + baseSalary);
        System.out.println("Monthly living budget: AED " + monthlyLiving);
        System.out.println("Monthly commitments: AED " + monthlyCommitments);
        System.out.println("Monthly surplus from base: AED " + monthlySurplus);
        System.out.println("==============================");

        // Monthly tracking
        System.out.print("\nWhich month are you entering? ");
        String month = sc.nextLine();

        System.out.print("What hit your bank this month? (AED): ");
        double incomeThisMonth = sc.nextDouble();
        sc.nextLine();

        System.out.print("What is your current bank balance? (AED): ");
        double currentBalance = sc.nextDouble();
        sc.nextLine();

        // Calculate spending
        double savedThisMonth = currentBalance - (currentBalance - monthlySurplus);

        System.out.print("What was your balance BEFORE salary hit? (AED): ");
        double previousBalance = sc.nextDouble();
        sc.nextLine();

        double spent = (previousBalance + incomeThisMonth) - currentBalance;;
        double actualSaved = currentBalance - previousBalance;

        System.out.println("\n=== " + month + " SUMMARY ===");
        System.out.println("Income this month: AED " + incomeThisMonth);
        System.out.println("Previous balance: AED " + previousBalance);
        System.out.println("Current balance: AED " + currentBalance);
        System.out.printf("Spent this month: AED %.2f%n", spent);
        System.out.printf("Actually saved: AED %.2f%n", actualSaved);
        System.out.println("Commitments pot: AED " + monthlyCommitments);


    }
}