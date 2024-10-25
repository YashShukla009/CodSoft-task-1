import java.util.Scanner;

public class AtmInterface {

    
    static String accountHolderName;
    static double balance = 0.0;

    
    public static void displayMenu() {
        System.out.println("\n=== Wellcome to sos ATM ===");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    
    public static void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    
    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

   
    public static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew ₹" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the account holder's name
        System.out.print("Enter your name: ");
        accountHolderName = scanner.nextLine();

        boolean running = true;

        while (running) {
            
            displayMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using sos ATM. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}



