package pack1;

public class User {
    private String name;
    private String password;
    private double balance;

    public User() {
        this.balance = 10000.0;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.balance = 10000.0;
    }

    public String getPhoneNumber() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.name = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}

