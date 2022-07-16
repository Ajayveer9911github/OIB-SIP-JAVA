package ATM;

import java.util.Scanner;

public class atminterface {

    public static void main(String[] args) {

        int Balance = 66854500, Withdraw, Deposit;

        Scanner sc = new Scanner(System.in);


        int atmpin = 0000;
        Scanner in = new Scanner(System.in);
        System.out.println("\tWelcome");
        System.out.println("Insert Your Card and Enter Your PIN");
        System.out.print("Your PIN: ");
        int pin = in.nextInt();
        if ((atmpin == pin)) {

            while (true) {
                System.out.println("\nOIB-SIB ATM");
                System.out.println("Press 1 to Check Balance");
                System.out.println("Press 2 to Withdraw");
                System.out.println("Press 3 to Deposit");
                System.out.println("Press 4 to Transfer");
                System.out.println("Press 5 to EXIT");
                System.out.print("Choose the operation you want to perform:");

                int Press = sc.nextInt();

                if (Press == 1) {
                    System.out.println("\nYour Balance is: " + Balance);
                } else if (Press == 2) {
                    System.out.print("\nEnter the Amount to be withdrawn:");

                    Withdraw = sc.nextInt();

                    if (Balance >= Withdraw) {
                        Balance = Balance - Withdraw;
                        System.out.println("\nPlease Collect Your Amount");
                    } else {
                        System.out.println("\nYour Balance is Insufficient");
                    }
                } else if (Press == 3) {
                    System.out.print("\nEnter the Amount to be deposited:");

                    Deposit = sc.nextInt();

                    Balance = Balance + Deposit;
                    System.out.println("\nYour Amount has been successfully deposited\n");
                } else if (Press == 4) {
                    System.out.println("\nEnter the Account Number: ");
                    int anumber  = sc.nextInt();
                    System.out.println("Enter the Amount: ");
                    int amount = sc.nextInt();
                    System.out.printf("Rs. %d has been successfully transmitted to Account Number %d\n",amount,anumber);
                }

                else {
                    System.out.println("Thank You for Using Our System!\n Visit Again!");
                    break;
                }
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }
}
