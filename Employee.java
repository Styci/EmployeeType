import java.util.Arrays;

public class Employee {
    private String name;
    private String ssn;
    private double salary;

    public Employee(String name, String ssn, double salary){
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSsn(){
        return ssn;
    }

    public double getSalary(){
        return salary;
    }

    public void display(){
        System.out.println("Name:" + name + ",Ssn:" + ssn + ",Salary:" + salary);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++){
            employees[i] = new Employee("Employee" + (i + 1), "Ssn" + (i + 1), (i + 1) * 1000);
        }

        Arrays.stream(employees).forEach(Employee::display);
        
    }
}
    

