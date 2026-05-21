package banking.system;

import java.util.List;

public class BankService {

    private static long generatedAccountNumber = 100001;

    public Account registerUser(String name,
                                String address,
                                String phoneNumber,
                                String password,
                                double initialDeposit) {

        long accountNumber = generatedAccountNumber++;

        Account account = new Account(
                accountNumber,
                name,
                address,
                phoneNumber,
                password,
                initialDeposit
        );

        Transaction transaction = new Transaction(
                "Initial Deposit",
                initialDeposit,
                initialDeposit
        );

        account.getTransactions().add(transaction);

        DataStore.accounts.put(accountNumber, account);

        return account;
    }

    public Account login(long accountNumber, String password) {

        Account account = DataStore.accounts.get(accountNumber);

        if (account == null) {
            System.out.println("Invalid Account Number");
            return null;
        }

        if (!account.getPassword().equals(password)) {
            System.out.println("Invalid Password");
            return null;
        }

        return account;
    }

    public void deposit(Account account, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
            return;
        }

        double updatedBalance = account.getBalance() + amount;

        account.setBalance(updatedBalance);

        Transaction transaction = new Transaction(
                "Deposit",
                amount,
                updatedBalance
        );

        account.getTransactions().add(transaction);

        System.out.println("Amount Deposited Successfully");
        System.out.println("Updated Balance : " + updatedBalance);
    }

    public void withdraw(Account account, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
            return;
        }

        if (account.getBalance() < amount) {
            System.out.println("Insufficient Balance");
            return;
        }

        double updatedBalance = account.getBalance() - amount;

        account.setBalance(updatedBalance);

        Transaction transaction = new Transaction(
                "Withdrawal",
                amount,
                updatedBalance
        );

        account.getTransactions().add(transaction);

        System.out.println("Withdrawal Successful");
        System.out.println("Updated Balance : " + updatedBalance);
    }

    public void transferFunds(Account sender,
                              long receiverAccountNumber,
                              double amount) {

        Account receiver = DataStore.accounts.get(receiverAccountNumber);

        if (receiver == null) {
            System.out.println("Receiver Account Not Found");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid Transfer Amount");
            return;
        }

        if (sender.getBalance() < amount) {
            System.out.println("Insufficient Balance");
            return;
        }

        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        Transaction senderTransaction = new Transaction(
                "Transfer Sent",
                amount,
                sender.getBalance()
        );

        Transaction receiverTransaction = new Transaction(
                "Transfer Received",
                amount,
                receiver.getBalance()
        );

        sender.getTransactions().add(senderTransaction);
        receiver.getTransactions().add(receiverTransaction);

        System.out.println("Fund Transfer Successful");
        System.out.println("Sender Updated Balance : " + sender.getBalance());
    }

    public void viewAccountDetails(Account account) {

        System.out.println("\n===== ACCOUNT DETAILS =====");

        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Name           : " + account.getName());
        System.out.println("Address        : " + account.getAddress());
        System.out.println("Phone Number   : " + account.getPhoneNumber());
        System.out.println("Balance        : " + account.getBalance());
    }

    public void updateAccount(Account account,
                              String newName,
                              String newAddress,
                              String newPhone) {

        account.setName(newName);
        account.setAddress(newAddress);
        account.setPhoneNumber(newPhone);

        System.out.println("Account Updated Successfully");
    }

    public void printStatement(Account account) {

        List<Transaction> transactionList = account.getTransactions();

        System.out.println("\n===== ACCOUNT STATEMENT =====");

        for (Transaction transaction : transactionList) {

            System.out.println(
                    transaction.getTransactionDate()
                            + " | "
                            + transaction.getTransactionType()
                            + " | Amount : "
                            + transaction.getAmount()
                            + " | Balance : "
                            + transaction.getRemainingBalance()
            );
        }
    }
}