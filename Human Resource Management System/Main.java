package hrms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HRMSService service = new HRMSService();

        // Login
        System.out.println("===== HRMS LOGIN =====");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (!username.equals("admin")
                || !password.equals("admin123")) {

            System.out.println("Invalid Credentials.");
            return;
        }

        System.out.println("Login Successful.");

        int choice;

        do {

            System.out.println("\n===== HRMS MENU =====");

            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee");
            System.out.println("6. Mark Attendance");
            System.out.println("7. Apply Leave");
            System.out.println("8. View Leave Requests");
            System.out.println("9. Approve Leave");
            System.out.println("10. Reject Leave");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Designation: ");
                    String designation = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();

                    Employee employee = new Employee(
                            id,
                            name,
                            designation,
                            department,
                            contact
                    );

                    service.addEmployee(employee);

                    break;

                case 2:

                    service.viewEmployees();

                    break;

                case 3:

                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Designation: ");
                    String newDesignation = sc.nextLine();

                    System.out.print("Enter New Department: ");
                    String newDepartment = sc.nextLine();

                    System.out.print("Enter New Contact: ");
                    String newContact = sc.nextLine();

                    service.updateEmployee(
                            updateId,
                            newName,
                            newDesignation,
                            newDepartment,
                            newContact
                    );

                    break;

                case 4:

                    System.out.print("Enter Employee ID: ");

                    int deleteId = sc.nextInt();

                    service.deleteEmployee(deleteId);

                    break;

                case 5:

                    System.out.print("Enter Employee ID: ");

                    int searchId = sc.nextInt();

                    service.searchEmployee(searchId);

                    break;

                case 6:

                    System.out.print("Enter Employee ID: ");

                    int attendanceId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Status (Present/Absent/Leave): ");

                    String status = sc.nextLine();

                    service.markAttendance(attendanceId, status);

                    break;

                case 7:

                    System.out.print("Enter Employee ID: ");

                    int empId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Leave Type: ");

                    String leaveType = sc.nextLine();

                    System.out.print("Enter Start Date: ");

                    String startDate = sc.nextLine();

                    System.out.print("Enter End Date: ");

                    String endDate = sc.nextLine();

                    LeaveRequest leaveRequest =
                            new LeaveRequest(
                                    empId,
                                    leaveType,
                                    startDate,
                                    endDate
                            );

                    service.applyLeave(leaveRequest);

                    break;

                case 8:

                    service.viewLeaveRequests();

                    break;

                case 9:

                    System.out.print("Enter Employee ID: ");

                    int approveId = sc.nextInt();

                    service.approveLeave(approveId);

                    break;

                case 10:

                    System.out.print("Enter Employee ID: ");

                    int rejectId = sc.nextInt();

                    service.rejectLeave(rejectId);

                    break;

                case 0:

                    System.out.println("Exiting HRMS...");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
