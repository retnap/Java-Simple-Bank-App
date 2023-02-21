import java.util.*;

import java.io.*;

public class Functions {
    double balance = 1000;
    int customer_id;

    public Functions(int customer_id)
    {
        this.customer_id = customer_id;
    }

    public void showBalance(double balance)
    {
        System.out.println("Your balance is: " + balance);
    }

    public void deposit(double amountDeposit)
    {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an amount: ");
        double amountDeposit = scanner.nextDouble();
        */

        balance += amountDeposit;
        System.out.println("Your new balance is: " + balance);
    }

    public void withDraw(double amountDraw)
    {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an amount: ");
        double amountDraw = scanner.nextDouble();
        */

        if(balance >= amountDraw){
            balance -= amountDraw;
            System.out.println("Your new balance is: " + balance);
        }
        else{
            System.out.println("Check your balance again.");
        }
    }

    public void menu()
    {
        int key;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome id: " + customer_id);
        System.out.println("\n");
        System.out.println("Press 1 to check your balance");
        System.out.println("Press 2 to deposit");
        System.out.println("Press 3 to withdraw");
        System.out.println("Press 0 to exit");

        do{
            System.out.println("What would you like to do?");
            key = scanner.nextInt();
            System.out.println("\n");

            switch(key)
            {
                case 1:
                    System.out.println("......................");
                    System.out.println("Your Balance =" + balance);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("......................");
                    System.out.println("Please enter an amount to deposit");
                    Scanner scanner2 = new Scanner(System.in);
                    double deposit_amount = scanner2.nextDouble();
                    deposit(deposit_amount);
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("......................");

                    System.out.println("Please enter an amount to withdraw");
                    Scanner scanner3 = new Scanner(System.in);
                    double withDraw_amount = scanner3.nextDouble();
                    withDraw(withDraw_amount);
                    System.out.println("\n");
                    break;

                case 0:
                    System.out.println("......................");
                    System.out.println("Thank you for choosing us!");
                    break;

                default:
                    System.out.println("Please press correct button");
                    break;
            }
        }while(key != 0);
    }
}
