class EmployeeBankTask implements Runnable {
    private Employee employee;
    private boolean deposit;
    private double amount;

    public EmployeeBankTask(Employee employee, boolean deposit, double amount) {
        this.employee = employee;
        this.deposit = deposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (deposit) {
            employee.getAccount().deposit(amount);
        } else {
            employee.getAccount().withdraw(amount);
        }
    }
}
