# Employee Management System

A Spring Boot REST API project designed to understand **layered architecture**, **RESTful services**, and **database integration using MySQL**.  
This project performs basic **CRUD operations** for managing employee details.

---

## 📌 Project Objective

The goal of this project is to:
- Understand **Spring Boot project flow**
- Learn **Controller → Service → Repository** architecture
- Implement **REST APIs**
- Work with **MySQL database**
- Test APIs using **Postman**
- Push and manage code using **Git & GitHub**

---

## 🛠 Tech Stack

- **Java 21**
- **Spring Boot**
- **Spring Web (REST API)**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Maven**
- **Postman**
- **Git & GitHub**

---

## 📂 Project Structure (Layered Architecture)
src/main/java
└── com.example.employee
├── controller
│ └── EmployeeController.java
├── service
│ ├── EmployeeService.java
│ └── EmployeeServiceImpl.java
├── repository
│ └── EmployeeRepository.java
├── entity
│ └── Employee.java
├── dto
│ └── EmployeeDetails.java
└── EmployeeManagementApplication.java


---

## 🧱 Layers Explanation

### 1️⃣ Controller Layer
- Handles **HTTP requests**
- Exposes REST endpoints
- Uses annotations like:
  - `@RestController`
  - `@RequestMapping`
  - `@GetMapping`
  - `@PostMapping`
  - `@PutMapping`
  - `@DeleteMapping`

📌 Example:
```java
@RestController
@RequestMapping("/employees")
public class EmployeeController { }

2️⃣ Service Layer

Contains business logic

Acts as a bridge between controller and repository

Uses:

@Service

@Autowired

📌 Why Service layer?

Keeps controller clean

Makes code maintainable and testable

3️⃣ Repository Layer

Interacts with database

Uses Spring Data JPA

No SQL required for basic operations

📌 Example:

public interface EmployeeRepository extends JpaRepository<Employee, Long> { }

4️⃣ Entity Layer

Represents a database table

Each object = one row in table

📌 Annotations used:

@Entity

@Id

@GeneratedValue

@Column

5️⃣ DTO (Data Transfer Object)

📌 Why DTO is used?

To transfer only required data

To avoid exposing full entity

To support partial updates

📌 In this project:

EmployeeDetails DTO is used for update operation

Example:

public class EmployeeDetails {
    private String name;
    private String department;
    private double salary;
}

🔁 Project Flow (End-to-End)
Postman Request
   ↓
Controller Layer
   ↓
Service Layer
   ↓
Repository Layer
   ↓
MySQL Database

🔗 REST API Endpoints
➕ Add Employee
POST /employees


Request Body

{
  "name": "Neha",
  "department": "Finance",
  "salary": 70000
}

📄 Get Employee by ID
GET /employees/{id}

✏️ Update Employee
PUT /employees/{id}


Request Body

{
  "name": "Neha Sharma",
  "department": "HR",
  "salary": 75000
}

❌ Delete Employee
DELETE /employees/{id}

🗄 Database Configuration

application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

▶️ How to Run the Project

Clone the repository

Create MySQL database:

CREATE DATABASE employee_db;


Update DB credentials in application.properties

Run project as Spring Boot App

Test APIs using Postman

🧪 Testing

All APIs tested using Postman

Proper HTTP status codes verified

CRUD operations working successfully

🎯 What I Learned from This Project

Spring Boot project structure

REST API design principles

HTTP methods (GET, POST, PUT, DELETE)

DTO concept and usage

JPA & Hibernate

MySQL integration

Exception understanding (404, 405)

Postman testing

Git & GitHub version control

🚀 Future Enhancements

Add validation using @Valid

Global exception handling

Pagination & sorting

Swagger API documentation

Authentication & authorization

👨‍💻 Author

Anand Dev Singh
GitHub: https://github.com/devsingh63866

