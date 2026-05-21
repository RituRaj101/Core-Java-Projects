package banking.system;

import java.time.LocalDateTime;

public class Transaction {

    private String transactionType;
    private double amount;
    private double remainingBalance;
    private LocalDateTime transactionDate;

    public Transaction(String transactionType,
                       double amount,
                       double remainingBalance) {

        this.transactionType = transactionType;
        this.amount = amount;
        this.remainingBalance = remainingBalance;
        this.transactionDate = LocalDateTime.now();
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public double getRemainingBalance() {
        return remainingBalance;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }
}
