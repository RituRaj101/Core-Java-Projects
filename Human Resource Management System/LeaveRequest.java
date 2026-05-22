package hrms;

public class LeaveRequest {

    private int employeeId;
    private String leaveType;
    private String startDate;
    private String endDate;
    private String status;

    public LeaveRequest(int employeeId,
                        String leaveType,
                        String startDate,
                        String endDate) {

        this.employeeId = employeeId;
        this.leaveType = leaveType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "Pending";
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStatus() {
        return status;
    }

    public void approveLeave() {
        status = "Approved";
    }

    public void rejectLeave() {
        status = "Rejected";
    }

    @Override
    public String toString() {

        return "\nEmployee ID : " + employeeId +
                "\nLeave Type  : " + leaveType +
                "\nStart Date  : " + startDate +
                "\nEnd Date    : " + endDate +
                "\nStatus      : " + status;
    }
}