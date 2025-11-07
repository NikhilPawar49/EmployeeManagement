public class Manager extends Employee{
    private int teamSize;
    private double projectBonus;

    public Manager(String fullName, double baseSalary, String department) {
        super(fullName, baseSalary, department);
    }
    public double calculateSalary(){
        return getBaseSalary() + getBaseSalary() * 0.20 + projectBonus + getBonus();
    }
    public String getRole(){
        return "Manager";
    }
    public int getBonus(){
        return teamSize*500;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void setProjectBonus(double projectBonus) {
        this.projectBonus = projectBonus;
    }

    public void setProjectBonus(String projectBonus) {
        try {
            this.projectBonus = Double.parseDouble(projectBonus);
        }catch (Exception e){
            System.out.println("Invalid project bonus Value");
            this.projectBonus = 0;
        }
    }
}
