import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)
    {
        int login_id1 = 12345;
        String login_id1_name = "Selman";

        Scanner getCustomerPassword = new Scanner(System.in);
        System.out.println("Please enter your customer id: ");
        int customer_id = getCustomerPassword.nextInt();

        Functions functions = new Functions(customer_id);

        if(customer_id == login_id1)
        {
            System.out.println("Welcome: " + login_id1_name);
            functions.menu();
        }
        else{
            System.out.println("Please try again...");
        }

    }
}