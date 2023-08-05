package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class LeaveRecordAdapter implements LeaveRecord{
    ThirdPartyLeaveRecord thirdPartyLeaveRecord;

    public LeaveRecordAdapter(ThirdPartyLeaveRecord thirdPartyLeaveRecord) {
        this.thirdPartyLeaveRecord = thirdPartyLeaveRecord;
    }

    @Override
    public String getMostAbsentEmployee() {
        Employee employee = thirdPartyLeaveRecord.getMostAbsentEmployee();
        return employee.getName();
    }

    @Override
    public int getEmployeeAbsences(String employeeName) {
        Employee employee = new Employee(employeeName);
        return thirdPartyLeaveRecord.getEmployeeAbsences(employee);
    }
    
}
