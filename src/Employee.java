public abstract class Employee {
     private String employeeId;
     private String fullName;
     private String firstName;
     private String middleName;
     private String lastName;
     private double baseSalary;
     private String department;
     static int id = 100;
    private BankAccount account;

     public Employee(){
     }
    public Employee(String fullName, double baseSalary, String department) {
        this.fullName = fullName;
        this.baseSalary = baseSalary;
        this.department = department;
        parseName();
        this.account = new BankAccount(baseSalary);
    }
    public void  parseName(){
         try {
             String parts[] = fullName.trim().split("\\s+");
             firstName = parts[0];
             middleName = parts[1];
             lastName = parts[2];
         }catch (Exception e){
             System.out.println("Invalid name format! Expected first middle and last name");
             firstName = middleName = lastName ="";
         }
    }
    public String initialName(){
        StringBuilder sb = new StringBuilder();
        sb.append(firstName.charAt(0));
        sb.append(middleName.charAt(0));
        sb.append(lastName.charAt(0));
        return sb.toString();
    }
    public void generateEmployeeId(){
         employeeId = getRole().substring(0,3) + "_"+initialName()+"_"+id++;
    }
    public String generatePaySlip() {
        return "Employee : " + fullName
                + "\nRole : " + getRole()
                + "\nBase Salary : " + baseSalary
                +"\nBonus Salary :"+ getBonus()
                +"\nTotal Salary :"+ calculateSalary();
    }

    public abstract double calculateSalary();
    public abstract String getRole();
    public abstract int getBonus();

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getDepartment() {
        return department;
    }
    public BankAccount getAccount() {
        return account;
    }
}
