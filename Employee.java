public class Employee {
    private String name;
    private String id;
    private String department;
    private double basicSalaryINR; // Salary in INR
    private double deductionsINR; // Deductions in INR
    private double bonusINR; // Bonus in INR

    public Employee(String name, String id, String department, double basicSalaryINR, double deductionsINR, double bonusINR) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.basicSalaryINR = basicSalaryINR;
        this.deductionsINR = deductionsINR;
        this.bonusINR = bonusINR;
    }

    public double calculateNetSalaryINR() {
        return basicSalaryINR + bonusINR - deductionsINR;
    }

    public double convertToUSD(double amountINR) {
        return amountINR / 74.5; // Example conversion rate
    }

    public double convertToJPY(double amountINR) {
        return amountINR * 1.5; // Example conversion rate
    }

    @Override
    public String toString() {
        double netSalaryINR = calculateNetSalaryINR();
        double netSalaryUSD = convertToUSD(netSalaryINR);
        double netSalaryJPY = convertToJPY(netSalaryINR);

        return "Employee Salary Slip\n" +
                "-------------------\n" +
                "Name: " + name + "\n" +
                "ID: " + id + "\n" +
                "Department: " + department + "\n" +
                "Basic Salary (INR): " + basicSalaryINR + "\n" +
                "Deductions (INR): " + deductionsINR + "\n" +
                "Bonus (INR): " + bonusINR + "\n" +
                "Net Salary (INR): " + netSalaryINR + "\n" +
                "Net Salary (USD): " + netSalaryUSD + "\n" +
                "Net Salary (JPY): " + netSalaryJPY + "\n";
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "E123", "IT", 50000, 5000, 2000);
        System.out.println(emp);
    }
}

