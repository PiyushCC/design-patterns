package solid.live.srp;

public class EmployeeStats {
    private static int TOTAL_LEAVES_ALLOWED = 30;
    private double monthlySalary;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private int yearsInOrg;
    //We should not store the current year in employee, we can access that in a more global scope
    //private int thisYeard;
    private int[] leavesLeftPreviously;

    public int calculatetotalLeaveLeftPreviously() {
        int years = 3;
        if (this.getYearsInOrg() < 3) {
            years = this.getYearsInOrg();
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += this.getLeavesLeftPreviously()[this.getYearsInOrg()-i-1];
        }

        return totalLeaveLeftPreviously;
    }
    
    public static int getTOTAL_LEAVES_ALLOWED() {
        return TOTAL_LEAVES_ALLOWED;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public String getAddressStreet() {
        return addressStreet;
    }
    public String getAddressCity() {
        return addressCity;
    }
    public String getAddressCountry() {
        return addressCountry;
    }
    public int getLeavesTaken() {
        return leavesTaken;
    }
    public int getTotalLeaveAllowed() {
        return totalLeaveAllowed;
    }
    public int getLeaveTaken() {
        return leaveTaken;
    }
    public int getYearsInOrg() {
        return yearsInOrg;
    }
    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }
}
