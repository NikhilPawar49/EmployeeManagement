public class Designer extends Employee{
    private String designTool;
    private int designsCompleted = 0;
    private String specialization;
    public Designer(String fullName, double baseSalary, String department,String designTool,String specialization) {
        super(fullName, baseSalary, department);
        this.designTool = designTool;
        this.specialization = specialization;
    }
    public double calculateSalary(){
        return getBaseSalary() + getBaseSalary() * 0.15 + getBonus();
    }
    public String getRole(){
        return "Designer";
    }
    public int getBonus(){
        return designsCompleted*500;
    }
    public void completeDesign(){
        designsCompleted++;
    }
    public void completeDesign(int a){
        if(a > 0) designsCompleted += a;
    }
    public String generatePortfolioURL(){
        return "https://portfolio.techcorp.com/" +getFirstName()+getLastName();
    }
    public String createSignature() {
        return "✎" + initialName() + " | " + designTool + " | " + specialization;
    }
}
