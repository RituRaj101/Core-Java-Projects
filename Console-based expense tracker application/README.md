# 💰 Expense Tracker Application

A console-based Expense Tracker Application developed using Core Java that helps users record, manage, and analyze their daily expenses efficiently.

The application provides functionalities for:
- Recording expenses
- Managing expense categories
- Tracking spending
- Filtering expenses
- Updating and deleting expenses
- Generating expense summaries

This project demonstrates the practical implementation of:
- Object-Oriented Programming (OOP)
- Java Collections Framework
- Exception Handling
- Menu-Driven Application Design

---

# 📌 Project Overview

The Expense Tracker Application is designed to help users monitor their personal expenses through a simple and interactive console interface.

The system allows users to:
- Store expense records
- Categorize expenses
- Analyze spending habits
- Search and filter expenses
- Maintain expense history

This project serves as a beginner-friendly real-world Java application for understanding data management and application flow.

---

# ✨ Features

## 📝 Expense Recording
- Add new expense entries
- Store expense details including:
  - Expense ID
  - Date
  - Amount
  - Category
  - Description

---

## 📂 Expense Category Management
- Organize expenses by category
- Examples:
  - Food
  - Travel
  - Shopping
  - Bills
  - Entertainment

---

## 📊 Expense Tracking
- View all expenses
- Calculate total expenses
- Analyze spending patterns

---

## 🔍 Expense Filtering
- Search expenses by category
- Filter expenses based on minimum amount

---

## ✏️ Expense Modification
- Update existing expense details
- Edit:
  - Date
  - Amount
  - Category
  - Description

---

## 🗑️ Expense Deletion
- Delete expense records using Expense ID

---

## ⚠️ Error Handling
- Invalid menu choice handling
- Expense not found handling
- Input validation support

---

# 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Core Programming Language |
| OOP Concepts | Application Design |
| ArrayList | Expense Data Storage |
| Scanner Class | User Input |
| Exception Handling | Runtime Error Handling |

---

# 🏗️ Project Structure

```text
ExpenseTracker
│
├── Expense.java
├── ExpenseService.java
└── Main.java
```

---

# 📖 Module Description

## 1. Expense.java
Represents an expense entity.

### Responsibilities:
- Store expense information
- Provide getter and setter methods
- Display formatted expense details

---

## 2. ExpenseService.java
Contains the core business logic.

### Responsibilities:
- Add expenses
- View expenses
- Update expenses
- Delete expenses
- Search by category
- Filter by amount
- Calculate total expenses

---

## 3. Main.java
Application entry point.

### Responsibilities:
- Display menu
- Handle user interaction
- Manage program flow

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

If Java is installed correctly, the installed version will be displayed.

---

# ▶️ How to Run the Project

## Method 1: Using Command Prompt / Terminal

---

## Step 1: Create Project Folder

Create a folder named:

```text
ExpenseTracker
```

---

## Step 2: Add Java Files

Create the following files inside the folder:

```text
Expense.java
ExpenseService.java
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

The compiler generates:

```text
Expense.class
ExpenseService.class
Main.class
```

---

## Step 5: Run the Application

Execute the application using:

```bash
java Main
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
2. Add all Java files
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

# 🖥️ Sample Console Output

```text
===== EXPENSE TRACKER =====

1. Add Expense
2. View Expenses
3. Search By Category
4. Calculate Total Expense
5. Update Expense
6. Delete Expense
7. Filter By Amount
0. Exit

Enter Choice:
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

# 📋 Minimum Requirements

- Java JDK 8 or above
- Any Java IDE or terminal
- Basic understanding of Java execution

