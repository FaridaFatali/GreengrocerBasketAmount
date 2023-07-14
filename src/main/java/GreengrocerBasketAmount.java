import java.util.Scanner;

/*
Here are the prices for vegetables.
Calculate the total cost by asking the customer
how many kilograms of what kind of vegetables they bought.
 */

public class GreengrocerBasketAmount {
    public static void main(String[] args) {
        double cucumber = 3.14;
        double apple = 4.11;
        double pumpkin = 2.22;
        double tomato = 0.95;
        double eggplant = 7.00;

        Scanner sc = new Scanner(System.in);

        System.out.print("How many kilograms of cucumbers? : ");
        double buyCucumber = sc.nextDouble();

        System.out.print("How many kilograms of apple? : ");
        double buyApple = sc.nextDouble();

        System.out.print("How many kilograms of pumpkin? : ");
        double buyPumpkin = sc.nextDouble();

        System.out.print("How many kilograms of tomato? : ");
        double buyTomato = sc.nextDouble();

        System.out.print("How many kilograms of eggplant? : ");
        double buyEggplant = sc.nextDouble();


        double amount = (cucumber * buyCucumber) + (apple * buyApple) + (pumpkin * buyPumpkin) + (tomato * buyTomato) + (eggplant * buyEggplant);
//         or
//        double amount = 0;
//        amount += (cucumber * buyCucumber);
//        amount += (apple * buyApple);
//        amount += (pumpkin * buyPumpkin);
//        amount += (tomato * buyTomato);
//        amount += (eggplant * buyEggplant);

        System.out.println("Total amount: " + amount + " TL");


//        OR
//        double cucumberAmount = cucumber * buyCucumber;
//        double appleAmount = apple * buyApple;
//        double pumpkinAmount = pumpkin * buyPumpkin;
//        double tomatoAmount = tomato * buyTomato;
//        double eggplantAmount = eggplant * buyEggplant;
//
//        double amount = cucumberAmount + appleAmount + pumpkinAmount + tomatoAmount + eggplantAmount;
//
//        System.out.println("Total amount : " + amount + " TL");
    }
}
