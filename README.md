# Electronic Store Management System

The **Electronic Store Management System** is a console-based Java application developed to manage the basic operations of an electronic store.

The project brings together four main modules: Employee Management, Product Management, Sales Management, and Payment Management. It demonstrates how Object-Oriented Programming (OOP) concepts can be used to build a structured and organized management system.

## Features

### 1. Employee Management
- Manage different types of employees.
- Store employee details such as name, employee ID, salary, and department.
- Support Manager, Developer, and Salesperson roles.
- Calculate salaries using bonuses, project allowances, and commissions.
- Display employee information and total employee count.

### 2. Product Management
- Store product details, including name, model, purchase price, and selling price.
- Display available product information.
- Calculate profit per product.

### 3. Sales Management
- Record product sales.
- Specify the quantity sold.
- Calculate the total bill based on the product's selling price.
- Display sales receipts and total sales records.

### 4. Payment Management
- Support cash and card payment methods.
- Calculate and display payment amounts.
- Demonstrate different payment implementations using inheritance and method overriding.

## OOP Concepts Used

This project demonstrates the following Java OOP concepts:

- **Classes and Objects:** Organizing the system into separate classes.
- **Encapsulation:** Protecting data using private fields and getters/setters.
- **Inheritance:** Reusing common properties and methods through parent and child classes.
- **Abstraction:** Using abstract classes and abstract methods.
- **Polymorphism:** Using method overriding and parent-class references.
- **Method Overriding:** Providing specialized implementations of inherited methods.
- **Static Members:** Maintaining shared employee and sales counters.
- **Constructors:** Initializing objects with the required information.
- **super Keyword:** Accessing parent-class constructors and methods.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Visual Studio Code
- Git and GitHub

## Project Structure

```text
Electronic-Store-Management-System/
│
├── Main.java
│
├── Employee.java
├── Manager.java
├── Developer.java
├── Salesperson.java
│
├── Product.java
├── Sales.java
│
├── Payment.java
├── CashPayment.java
└── CardPayment.java
```

## How to Run the Project

1. Install the Java Development Kit (JDK).
2. Clone or download this repository.
3. Open the project folder in Visual Studio Code or another Java IDE.
4. Make sure all Java files are in the same package.
5. Run `Main.java`.
6. View the output in the terminal.

## Project Output

The application displays the results of all four management modules in one execution:

- Employee details and salary calculations.
- Electronic product information and profit per product.
- Sales receipts and total bill calculations.
- Cash and card payment details.

## Team Collaboration

This project was developed collaboratively by two students, with responsibilities divided across different management modules and integrated through a common `Main.java` file.

## Team Member 
Kanwal Younas -- Employee Management Module
Gulnaz Azhar -- Product Ans Sales Management Module

**Developed as a Java Object-Oriented Programming academic project.**
