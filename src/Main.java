public class Main {
    public static void main(String[] args) {

        PayrollSystem payroll = new PayrollSystem("TechCorp");

        Manager m1 = new Manager("Elon rao Musk", 80000, "Management");
        m1.setTeamSize(5);
        m1.setProjectBonus(15000);
        m1.generateEmployeeId();

        Developer d1 = new Developer("Nikhil padamsing Pawar", 60000, "IT", "Java", "Senior");
        d1.completeProject();
        d1.completeProject(3);
        d1.generateEmployeeId();

        Designer ds1 = new Designer("Bill sham gates", 55000, "Design", "Figma", "UI/UX");
        ds1.completeDesign(2);
        ds1.generateEmployeeId();

        payroll.addEmployee(m1);
        payroll.addEmployee(d1);
        payroll.addEmployee(ds1);

        //  Demonstrate Encapsulation
        System.out.println("Manager Name: " + m1.getFullName());
        System.out.println("Developer Base Salary: " + d1.getBaseSalary());

        //  Demonstrate Inheritance
        System.out.println(m1.getFullName() + " is a " + m1.getRole());
        System.out.println(d1.getFullName() + " is a " + d1.getRole());
        System.out.println(ds1.getFullName() + " is a " + ds1.getRole());

        //  Demonstrate Polymorphism: method overriding
        System.out.println("Manager Salary: " + m1.calculateSalary());
        System.out.println("Developer Salary: " + d1.calculateSalary());
        System.out.println("Designer Salary: " + ds1.calculateSalary());

        //  Demonstrate Polymorphism: Overloading
        d1.completeProject();
        d1.completeProject(2); // overloaded

        //  Abstraction - implemented abstract methods
        System.out.println(m1.generatePaySlip());
        System.out.println("\n" + d1.generatePaySlip());

        //  String Manipulation
        System.out.println("Initials: " + d1.initialName());
        System.out.println("Developer Email: " + d1.generateEmail());
        System.out.println("Designer Portfolio: " + ds1.generatePortfolioURL());
        System.out.println("Designer Signature: " + ds1.createSignature());

        payroll.displayAllEmployees();

        payroll.searchByName("Nikhil")
                .forEach(e -> System.out.println(e.getFullName()));

        payroll.searchByRole("designer")
                .forEach(e -> System.out.println(e.getFullName()));

        payroll.generateSummaryReport();
    }
}
