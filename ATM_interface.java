import java.util.Scanner;

public class ATM_interface {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int balance = 1000;
        boolean isrunning = true;

        System.out.println("Welcome to the ATM!");

        while(isrunning)
        {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = enter.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;

                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    int amounttowithdraw = enter.nextInt();
                    if(amounttowithdraw > balance)
                    {
                        System.out.println("Insufficient funds!");
                    }
                    else
                    {
                        balance -= amounttowithdraw;
                        System.out.println("You have withdraw " + amounttowithdraw + ". Your new balance is: " + balance);
                    }
                    break;

                case 3:
                    System.out.println("Enter the amount of deposit: ");
                    int amounttodeposit = enter.nextInt();
                    balance += amounttodeposit;
                    System.out.println("You have deposited " + amounttodeposit + ". Your new balanceis: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    isrunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        enter.close();
    }
}
