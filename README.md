# Banking Management System - Backend

A RESTful Banking Management System developed using **Java 17**, **Spring Boot**, **Spring Data JPA**, and **MySQL**. The application provides APIs to manage bank accounts, including account creation, deposits, withdrawals, account details, and account deletion.

## 🚀 Technologies Used

- Java 17
- Spring Boot 3
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- IntelliJ IDEA
- Postman

## ✨ Features

- Create Bank Account
- Get Account Details by ID
- Deposit Money
- Withdraw Money
- Delete Bank Account
- RESTful APIs
- MySQL Database Integration

## 📂 Project Structure

```
src
└── main
    ├── java
    │   └── com.example.bank
    │       ├── controller
    │       ├── entity
    │       ├── repository
    │       ├── service
    │       └── BankApplication.java
    └── resources
        └── application.properties
```

## ⚙️ Prerequisites

- Java 17
- Maven
- MySQL Server
- IntelliJ IDEA (or any Java IDE)

## 🛠️ Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE banking_db;
```

Configure `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/banking_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## ▶️ Run the Application

Clone the repository:

```bash
git clone https://github.com/priyanshuk5321/banking-management-backend.git
```

Navigate to the project:

```bash
cd banking-management-backend
```

Run the application:

```bash
mvn spring-boot:run
```

Or run the `BankApplication.java` file from IntelliJ IDEA.

## 📡 API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/create` | Create a new bank account |
| GET | `/{id1}` | Get account details by ID |
| PUT | `/{id1}/deposit` | Deposit money into an account |
| PUT | `/{id1}/withdraw` | Withdraw money from an account |
| DELETE | `/{id1}` | Delete a bank account |

## 🧪 API Testing

The REST APIs were tested using:

- Postman

## 📌 Future Improvements

- User Authentication (JWT)
- Transaction History
- Transfer Money Between Accounts
- Account Statement
- Exception Handling
- Input Validation
- Docker Support

## 👨‍💻 Author

**Priyanshu Kashyap**

GitHub: https://github.com/priyanshuk5321

---

⭐ If you found this project helpful, please consider giving it a star!

