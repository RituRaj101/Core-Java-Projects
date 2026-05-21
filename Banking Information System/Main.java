package banking.system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankService bankService = new BankService();

        while (true) {

            System.out.println("\n===== BANKING INFORMATION SYSTEM =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name : ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Address : ");
                    String address = scanner.nextLine();

                    System.out.print("Enter Phone Number : ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter Password : ");
                    String password = scanner.nextLine();

                    System.out.print("Enter Initial Deposit : ");
                    double initialDeposit = scanner.nextDouble();

                    Account account = bankService.registerUser(
                            name,
                            address,
                            phone,
                            password,
                            initialDeposit
                    );

                    System.out.println("Registration Successful");
                    System.out.println("Generated Account Number : " + account.getAccountNumber());

                    break;

                case 2:

                    System.out.print("Enter Account Number : ");
                    long accountNumber = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Enter Password : ");
                    String loginPassword = scanner.nextLine();

                    Account loggedInAccount = bankService.login(
                            accountNumber,
                            loginPassword
                    );

                    if (loggedInAccount != null) {

                        boolean loggedIn = true;

                        while (loggedIn) {

                            System.out.println("\n===== BANK MENU =====");
                            System.out.println("1. View Account Details");
                            System.out.println("2. Deposit");
                            System.out.println("3. Withdraw");
                            System.out.println("4. Transfer Funds");
                            System.out.println("5. View Statement");
                            System.out.println("6. Update Account");
                            System.out.println("7. Logout");
                            System.out.print("Enter Choice : ");

                            int bankChoice = scanner.nextInt();
                            scanner.nextLine();

                            switch (bankChoice) {

                                case 1:
                                    bankService.viewAccountDetails(loggedInAccount);
                                    break;

                                case 2:

                                    System.out.print("Enter Deposit Amount : ");
                                    double depositAmount = scanner.nextDouble();

                                    bankService.deposit(loggedInAccount, depositAmount);

                                    break;

                                case 3:

                                    System.out.print("Enter Withdrawal Amount : ");
                                    double withdrawalAmount = scanner.nextDouble();

                                    bankService.withdraw(loggedInAccount, withdrawalAmount);

                                    break;

                                case 4:

                                    System.out.print("Enter Receiver Account Number : ");
                                    long receiverAccountNumber = scanner.nextLong();

                                    System.out.print("Enter Amount : ");
                                    double transferAmount = scanner.nextDouble();

                                    bankService.transferFunds(
                                            loggedInAccount,
                                            receiverAccountNumber,
                                            transferAmount
                                    );

                                    break;

                                case 5:
                                    bankService.printStatement(loggedInAccount);
                                    break;

                                case 6:

                                    scanner.nextLine();

                                    System.out.print("Enter New Name : ");
                                    String newName = scanner.nextLine();

                                    System.out.print("Enter New Address : ");
                                    String newAddress = scanner.nextLine();

                                    System.out.print("Enter New Phone Number : ");
                                    String newPhone = scanner.nextLine();

                                    bankService.updateAccount(
                                            loggedInAccount,
                                            newName,
                                            newAddress,
                                            newPhone
                                    );

                                    break;

                                case 7:
                                    loggedIn = false;
                                    System.out.println("Logged Out Successfully");
                                    break;

                                default:
                                    System.out.println("Invalid Choice");
                            }
                        }
                    }

                    break;

                case 3:
                    System.out.println("Thank You For Using Banking System");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}