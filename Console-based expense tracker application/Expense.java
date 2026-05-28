package expensetracker;

public class Expense {

    private int expenseId;
    private String date;
    private double amount;
    private String category;
    private String description;

    public Expense(int expenseId,
                   String date,
                   double amount,
                   String category,
                   String description) {

        this.expenseId = expenseId;
        this.date = date;
        this.amount = amount;
        this.category = category;
        this.description = description;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {

        return "\nExpense ID  : " + expenseId +
                "\nDate        : " + date +
                "\nAmount      : ₹" + amount +
                "\nCategory    : " + category +
                "\nDescription : " + description;
    }
}