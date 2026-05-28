package expensetracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ExpenseService service = new ExpenseService();

        int choice;

        do {

            System.out.println("\n===== EXPENSE TRACKER =====");

            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Search By Category");
            System.out.println("4. Calculate Total Expense");
            System.out.println("5. Update Expense");
            System.out.println("6. Delete Expense");
            System.out.println("7. Filter By Amount");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Expense ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String description = sc.nextLine();

                    Expense expense = new Expense(
                            id,
                            date,
                            amount,
                            category,
                            description
                    );

                    service.addExpense(expense);

                    break;

                case 2:

                    service.viewExpenses();

                    break;

                case 3:

                    sc.nextLine();

                    System.out.print("Enter Category: ");

                    String searchCategory = sc.nextLine();

                    service.searchByCategory(searchCategory);

                    break;

                case 4:

                    service.calculateTotalExpense();

                    break;

                case 5:

                    System.out.print("Enter Expense ID: ");

                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Date: ");
                    String newDate = sc.nextLine();

                    System.out.print("Enter New Amount: ");
                    double newAmount = sc.nextDouble();

                    sc.nextLine();

                    System.out.print("Enter New Category: ");
                    String newCategory = sc.nextLine();

                    System.out.print("Enter New Description: ");
                    String newDescription = sc.nextLine();

                    service.updateExpense(
                            updateId,
                            newDate,
                            newAmount,
                            newCategory,
                            newDescription
                    );

                    break;

                case 6:

                    System.out.print("Enter Expense ID: ");

                    int deleteId = sc.nextInt();

                    service.deleteExpense(deleteId);

                    break;

                case 7:

                    System.out.print("Enter Minimum Amount: ");

                    double filterAmount = sc.nextDouble();

                    service.filterByAmount(filterAmount);

                    break;

                case 0:

                    System.out.println("Exiting Expense Tracker...");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
