import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        final double ADULT_PRICE = 7.00;
        final double CHILD_PRICE = 4.00;
        int adultMeals, childMeals;
        double totalAdult, totalChild, grandTotal;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of adult meals ordered: ");
        adultMeals = input.nextInt();

        System.out.print("Enter the number of child meals ordered: ");
        childMeals = input.nextInt();

        totalAdult = adultMeals * ADULT_PRICE;
        totalChild = childMeals * CHILD_PRICE;
        grandTotal = totalAdult + totalChild;

        System.out.println();
        System.out.println(adultMeals + " adult meals were ordered at $" + ADULT_PRICE + " each.");
        System.out.println(childMeals + " child meals were ordered at $" + CHILD_PRICE + " each.");
        System.out.println("Total for adult meals: $" + totalAdult);
        System.out.println("Total for child meals: $" + totalChild);
        System.out.println("Grand total collected: $" + grandTotal);
    }
}
