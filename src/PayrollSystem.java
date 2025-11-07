import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employees= new ArrayList<>();
    private String companyName;
    public PayrollSystem(String company){
        this.companyName = company;
    }
    public void addEmployee(Employee e){
            employees.add(e);
    }
    public boolean removeEmployees(String id){
        return employees.removeIf(e->e.getEmployeeId().equalsIgnoreCase(id));
    }
    public List<Employee> searchByName(String name){
        List<Employee> result = new ArrayList<>();
        for(Employee e: employees){
            if(e.getFullName().toLowerCase().contains(name.toLowerCase())){
                result.add(e);
            }
        }
        return result;
    }

    public List<Employee> searchByRole(String role){
        List<Employee> result = new ArrayList<>();
        for(Employee e: employees){
            if(e.getRole().toLowerCase().contains(role.toLowerCase())){
                result.add(e);
            }
        }
        return result;
    }

    public double calculateTotalPayroll(){
        double total = 0;
        for(Employee e : employees){
            total+=e.calculateSalary();
        }
        return total;
    }

    public void displayAllEmployees(){
        System.out.println("\nEmployees at"+companyName);
        for(Employee e: employees){
            System.out.println(e.getEmployeeId() + " | " + e.getFullName() +
                    " | " + e.getRole() +
                    " | Salary: " + e.calculateSalary());
        }
    }
    public void generateSummaryReport() {
        int managerCount = 0;
        int developerCount = 0;
        int designerCount = 0;

        double managerPay = 0;
        double developerPay = 0;
        double designerPay = 0;

        for (Employee e : employees) {
            String role = e.getRole().toLowerCase();
            double sal = e.calculateSalary();

            if (role.contains("manager")) {
                managerCount++;
                managerPay += sal;
            } else if (role.contains("developer")) {
                developerCount++;
                developerPay += sal;
            } else if (role.contains("designer")) {
                designerCount++;
                designerPay += sal;
            }
        }

        System.out.println("\n--- Summary Report ---");
        System.out.println("Managers: "   + managerCount   + " | Total: " + managerPay);
        System.out.println("Developers: " + developerCount + " | Total: " + developerPay);
        System.out.println("Designers: "  + designerCount  + " | Total: " + designerPay);
        System.out.println("\nTotal Payroll: " + calculateTotalPayroll());
    }
}
