package hrms;

import java.util.ArrayList;

public class HRMSService {

    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<LeaveRequest> leaveRequests = new ArrayList<>();

    // Add Employee
    public void addEmployee(Employee employee) {

        employees.add(employee);

        System.out.println("Employee added successfully.");
    }

    // View Employees
    public void viewEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("------------------------");
        }
    }

    // Update Employee
    public void updateEmployee(int id,
                               String name,
                               String designation,
                               String department,
                               String contact) {

        for (Employee employee : employees) {

            if (employee.getEmployeeId() == id) {

                employee.setName(name);
                employee.setDesignation(designation);
                employee.setDepartment(department);
                employee.setContact(contact);

                System.out.println("Employee updated successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        Employee removeEmployee = null;

        for (Employee employee : employees) {

            if (employee.getEmployeeId() == id) {
                removeEmployee = employee;
                break;
            }
        }

        if (removeEmployee != null) {

            employees.remove(removeEmployee);

            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Search Employee
    public void searchEmployee(int id) {

        for (Employee employee : employees) {

            if (employee.getEmployeeId() == id) {

                System.out.println(employee);
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    // Mark Attendance
    public void markAttendance(int employeeId, String status) {

        System.out.println("Attendance marked for Employee ID "
                + employeeId + " as " + status);
    }

    // Apply Leave
    public void applyLeave(LeaveRequest leaveRequest) {

        leaveRequests.add(leaveRequest);

        System.out.println("Leave request submitted.");
    }

    // View Leave Requests
    public void viewLeaveRequests() {

        if (leaveRequests.isEmpty()) {

            System.out.println("No leave requests found.");
            return;
        }

        for (LeaveRequest leave : leaveRequests) {

            System.out.println(leave);
            System.out.println("------------------------");
        }
    }

    // Approve Leave
    public void approveLeave(int employeeId) {

        for (LeaveRequest leave : leaveRequests) {

            if (leave.getEmployeeId() == employeeId) {

                leave.approveLeave();

                System.out.println("Leave approved.");
                return;
            }
        }

        System.out.println("Leave request not found.");
    }

    // Reject Leave
    public void rejectLeave(int employeeId) {

        for (LeaveRequest leave : leaveRequests) {

            if (leave.getEmployeeId() == employeeId) {

                leave.rejectLeave();

                System.out.println("Leave rejected.");
                return;
            }
        }

        System.out.println("Leave request not found.");
    }
}
