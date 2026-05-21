package banking.system;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private long accountNumber;
    private String name;
    private String address;
    private String phoneNumber;
    private String password;
    private double balance;

    private List<Transaction> transactions = new ArrayList<>();

    public Account(long accountNumber,
                   String name,
                   String address,
                   String phoneNumber,
                   String password,
                   double balance) {

        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

