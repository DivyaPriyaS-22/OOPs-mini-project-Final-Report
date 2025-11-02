package application;

public class Leave {
    private String empName;
    private String empId;
    private int leaveDays;
    private String reason;

    public Leave(String empName, String empId, int leaveDays, String reason) {
        this.empName = empName;
        this.empId = empId;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public String getEmpName() { return empName; }
    public String getEmpId() { return empId; }
    public int getLeaveDays() { return leaveDays; }
    public String getReason() { return reason; }
}
