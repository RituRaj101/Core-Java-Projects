
# 🏢 Human Resource Management System (HRMS)

A console-based Human Resource Management System (HRMS) developed using Core Java.  
This application helps organizations manage employee records, attendance, and leave requests efficiently through a menu-driven interface.

The project demonstrates the implementation of:
- Object-Oriented Programming (OOP)
- Java Collections Framework
- Exception Handling
- Console-Based Application Development

---

# 📌 Project Overview

The Human Resource Management System (HRMS) is designed to automate basic HR operations such as:

- Employee management
- Attendance tracking
- Leave management
- Employee searching
- Admin authentication

This project provides a simplified preview of how HR systems work in real organizations.

---

# ✨ Features

## 👨‍💼 Employee Management
- Add employee records
- View employee details
- Update employee information
- Delete employee records

### Employee Information Includes:
- Employee ID
- Name
- Designation
- Department
- Contact Details

---

## 📅 Attendance Tracking
- Mark employee attendance
- Attendance status options:
  - Present
  - Absent
  - Leave

---

## 📝 Leave Management
- Apply leave requests
- View leave requests
- Approve leave requests
- Reject leave requests

### Leave Information Includes:
- Leave Type
- Start Date
- End Date
- Leave Status

---

## 🔍 Employee Search
Search employees using:
- Employee ID

---

## 🔐 User Authentication
- Secure admin login system
- Prevents unauthorized access

---

## ⚠️ Error Handling
- Invalid menu option handling
- Employee not found handling
- Leave request validation
- Login validation

---

# 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Core Programming Language |
| OOP Concepts | Application Design |
| ArrayList | Data Storage |
| Scanner Class | User Input |
| Exception Handling | Runtime Error Management |

---

# 🏗️ Project Structure

```text
HRMS
│
├── Employee.java
├── LeaveRequest.java
├── HRMSService.java
└── Main.java
```

---

# 📖 Module Description

## 1. Employee.java
Represents employee information.

### Responsibilities:
- Store employee details
- Provide getter and setter methods
- Display formatted employee information

---

## 2. LeaveRequest.java
Represents employee leave requests.

### Responsibilities:
- Store leave request details
- Handle leave approval/rejection
- Display leave information

---

## 3. HRMSService.java
Contains the core business logic of the application.

### Responsibilities:
- Employee CRUD operations
- Attendance management
- Leave management
- Employee search functionality

---

## 4. Main.java
Application entry point.

### Responsibilities:
- User authentication
- Menu handling
- User interaction
- Program execution flow

---

# ⚙️ System Requirements

Before running the project, ensure the following software is installed:

| Requirement | Version |
|---|---|
| Java JDK | 8 or Above |
| Operating System | Windows / Linux / macOS |
| IDE (Optional) | IntelliJ / Eclipse / VS Code |

---

# ☕ Java Installation

## Step 1: Download Java JDK

Download Java JDK from:

- Oracle JDK  
  https://www.oracle.com/java/technologies/downloads/

OR

- Eclipse Adoptium  
  https://adoptium.net/

---

## Step 2: Install Java

Install the JDK normally.

---

## Step 3: Verify Installation

Open terminal or command prompt and run:

```bash
java -version
```

If Java is installed successfully, the installed version will be displayed.

---

# ▶️ How to Run the Project

## Method 1: Using Command Prompt / Terminal

---

## Step 1: Create Project Folder

Create a folder named:

```text
HRMS
```

---

## Step 2: Add Java Files

Create the following files inside the folder:

```text
Employee.java
LeaveRequest.java
HRMSService.java
Main.java
```

Copy the respective source code into each file.

---

## Step 3: Open Terminal

Open terminal or command prompt inside the project folder.

---

## Step 4: Compile the Project

Run the following command:

```bash
javac *.java
```

### Compilation Output

The compiler generates `.class` files:

```text
Employee.class
LeaveRequest.class
HRMSService.class
Main.class
```

---

## Step 5: Run the Application

Execute the program using:

```bash
java Main
```

---

# 🔐 Login Credentials

Use the following admin credentials:

```text
Username : admin
Password : admin123
```

---

# 💻 Running the Project in IDEs

## ▶️ Visual Studio Code

### Steps:
1. Install VS Code
2. Install **Extension Pack for Java**
3. Open the project folder
4. Open `Main.java`
5. Click **Run**

---

## ▶️ IntelliJ IDEA

### Steps:
1. Create a new Java project
2. Add all Java source files
3. Open `Main.java`
4. Click **Run**

---

## ▶️ Eclipse IDE

### Steps:
1. Create a new Java project
2. Create all Java classes
3. Paste the source code
4. Right-click `Main.java`
5. Select:

```text
Run As → Java Application
```

---

# 📚 Core Concepts Implemented

## Object-Oriented Programming
- Classes and Objects
- Encapsulation
- Constructors
- Method Abstraction

---

## Java Collections Framework
- ArrayList

---

## Exception Handling
- Input validation
- Runtime error handling

---

## Console-Based Application Design
- Menu-driven architecture
- User interaction handling

---



# 📋 Minimum Requirements

- Java JDK 8 or above
- Any Java IDE or terminal
- Basic understanding of Java execution

---
