public class EmployeeType {
    private String fname;
    private String lname;
    private int eid;
    private String dept;
    private String position;
    private double rate;
    private double hr;

    // Default constructor
    public EmployeeType() {
        this.fname = "NA";
        this.lname = "NA";
        this.eid = 0;
        this.dept = "NA";
        this.position = "NA";
        this.rate = 0.0;
        this.hr = 0.0;
    }

    // Parameterized constructor
    public EmployeeType(String fname, String lname, int eid, String dept, String position, double rate, double hr) {
        this.fname = fname;
        this.lname = lname;
        this.eid = eid;
        this.dept = dept;
        this.position = position;
        this.rate = rate;
        this.hr = hr;
        validate();
    }

    // Mutator methods (setters)
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHr(double hr) {
        this.hr = hr;
    }

    // Accessor methods (getters)
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getEid() {
        return eid;
    }

    public String getDept() {
        return dept;
    }

    public String getPosition() {
        return position;
    }

    public double getRate() {
        return rate;
    }

    public double getHr() {
        return hr;
    }

    // Private validation method
    private void validate() {
        if (this.rate <= 0) {
            System.out.println("Error: Rate must be a positive value.");
            this.rate = 0.0;
        }
        if (this.hr <= 0) {
            System.out.println("Error: Hours worked must be a positive value.");
            this.hr = 0.0;
        }
        if (this.eid <= 0) {
            System.out.println("Error: Employee ID must be a positive value.");
            this.eid = 0;
        }
        if (this.dept.length() > 4) {
            System.out.println("Error: Department code must not exceed 4 characters.");
            this.dept = "NA";
        }
    }

    // Method to calculate total pay
    public double calculatePay() {
        return this.rate * this.hr;
    }

    // Method to print employee details
    public void print() {
        System.out.println("Employee id: " + this.eid + " Name: " + this.lname + ", " + this.fname + " Department code: " + this.dept);
        System.out.println("== " + this.hr + " hrs @ $" + this.rate + "/HR");
        System.out.println("== Net pay: $" + calculatePay());
    }
}