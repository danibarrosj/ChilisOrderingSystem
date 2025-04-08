import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {

        final double ADULT_PRICE = 7;
        final double CHILD_PRICE = 7;
        final double ADULT_COST = 4.35;
        final double CHILD_COST = 3.35;
        int adultMeals,childMeals;
        double totalAdult, totalChild, grandTotal;
        double profitAdult, profitChild, totalProfit;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number of adult meals ordered: ");
        adultMeals = input.nextInt();

        System.out.println("Enter the number of child meals ordered: ");
        childMeals = input.nextInt();

        totalAdult = adultMeals * ADULT_PRICE;
        totalChild = childMeals * CHILD_PRICE;
        grandTotal = totalAdult + totalChild;


        profitAdult = totalAdult - ADULT_COST;
        profitChild = totalChild - CHILD_COST;
        totalProfit = profitAdult + profitChild;

        System.out.println(adultMeals + " adult meals were ordered at " + ADULT_PRICE + "each.");
        System.out.println(childMeals + " child meals were ordered at " + CHILD_PRICE + "each.");
        System.out.println("The total for adult meals is $" + totalAdult);
        System.out.println("The total for child meals is $" + totalChild);
        System.out.println("The grand total is $" + grandTotal);
        System.out.println("Profits:");
        System.out.println("The adult profit is $" + profitAdult);
        System.out.println("The child profit is $" + profitChild);
        System.out.println("The total profit is $" + totalProfit);


    }
}
