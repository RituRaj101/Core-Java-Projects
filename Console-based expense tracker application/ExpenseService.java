package expensetracker;

import java.util.ArrayList;

public class ExpenseService {

    private ArrayList<Expense> expenses = new ArrayList<>();

    // Add Expense
    public void addExpense(Expense expense) {

        expenses.add(expense);

        System.out.println("Expense added successfully.");
    }

    // View All Expenses
    public void viewExpenses() {

        if (expenses.isEmpty()) {

            System.out.println("No expenses found.");
            return;
        }

        for (Expense expense : expenses) {

            System.out.println(expense);
            System.out.println("------------------------");
        }
    }

    // Search Expense By Category
    public void searchByCategory(String category) {

        boolean found = false;

        for (Expense expense : expenses) {

            if (expense.getCategory()
                    .equalsIgnoreCase(category)) {

                System.out.println(expense);
                System.out.println("------------------------");

                found = true;
            }
        }

        if (!found) {

            System.out.println("No expenses found in this category.");
        }
    }

    // Calculate Total Expense
    public void calculateTotalExpense() {

        double total = 0;

        for (Expense expense : expenses) {

            total += expense.getAmount();
        }

        System.out.println("Total Expense : ₹" + total);
    }

    // Update Expense
    public void updateExpense(int expenseId,
                              String date,
                              double amount,
                              String category,
                              String description) {

        for (Expense expense : expenses) {

            if (expense.getExpenseId() == expenseId) {

                expense.setDate(date);
                expense.setAmount(amount);
                expense.setCategory(category);
                expense.setDescription(description);

                System.out.println("Expense updated successfully.");

                return;
            }
        }

        System.out.println("Expense not found.");
    }

    // Delete Expense
    public void deleteExpense(int expenseId) {

        Expense removeExpense = null;

        for (Expense expense : expenses) {

            if (expense.getExpenseId() == expenseId) {

                removeExpense = expense;
                break;
            }
        }

        if (removeExpense != null) {

            expenses.remove(removeExpense);

            System.out.println("Expense deleted successfully.");
        } else {

            System.out.println("Expense not found.");
        }
    }

    // Filter Expense By Amount
    public void filterByAmount(double amount) {

        boolean found = false;

        for (Expense expense : expenses) {

            if (expense.getAmount() >= amount) {

                System.out.println(expense);
                System.out.println("------------------------");

                found = true;
            }
        }

        if (!found) {

            System.out.println("No matching expenses found.");
        }
    }
}
