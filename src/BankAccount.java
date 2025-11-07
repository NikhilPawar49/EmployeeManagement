class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount +
                " | Balance: " + balance +
                " | Thread: " + Thread.currentThread().getName());
    }

    public synchronized void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount +
                    " | Balance: " + balance +
                    " | Thread: " + Thread.currentThread().getName());
        } else {
            System.out.println("Insufficient Balance | Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
