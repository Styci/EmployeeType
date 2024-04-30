import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        List<EmployeeType> empList = new ArrayList<>();
        empList = initEmpList("employeeData.txt", empList);
        printEmpList(empList);
        searchUpdateEmpList(empList);
        printEmpList(empList);
    }

    public static List<EmployeeType> initEmpList(String fileName, List<EmployeeType> empList) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                EmployeeType emp = new EmployeeType(data[4], data[3], Integer.parseInt(data[1]), data[2], data[0], Double.parseDouble(data[5]), Double.parseDouble(data[6]));
                empList.add(emp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return empList;
    }

    public static void printEmpList(List<EmployeeType> empList) {
        for (EmployeeType emp : empList) {
            System.out.println("\nEmployee id: " + emp.getEid() + " Name: " + emp.getLname() + ", " + emp.getFname() + " Department code: " + emp.getDept());
            System.out.println("== " + emp.getHr() + " hrs @ $" + emp.getRate() + "/HR");
            System.out.println("== Net pay: $" + emp.calculatePay());
        }
    }

    public static void searchUpdateEmpList(List<EmployeeType> empList) {
        for (EmployeeType emp : empList) {
            if (emp.getDept().equalsIgnoreCase("COSC")) {
                emp.setRate(emp.getRate() * 1.03);
            }
        }
    }
}