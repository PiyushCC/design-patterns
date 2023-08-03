package solid.live.srp;

public class Employee {
    private int empId;
    private String name;
    private String manager;
    public EmployeeStats stats;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    }
//public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously)