package solid.live.srp;

public class EmployeeFormatter {
    public static String toHtml(Employee emp) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + emp.getEmpId() + "'>" +
                "<span>" + emp.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (emp.stats.getTotalLeaveAllowed() - emp.stats.getLeaveTaken()) + "</span>";
        str += "<span>" + Math.round(emp.stats.getMonthlySalary() * 12) + "</span>";
        if (emp.getManager() != null) str += "<span>" + emp.getManager() + "</span>";
        else str += "<span>None</span>";
        
        str += "<span>" + emp.stats.calculatetotalLeaveLeftPreviously()+ "</span>";
        return str + "</div> </div>";
    }
}