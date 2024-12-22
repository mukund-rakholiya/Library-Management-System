# Library Management System API 📚

A Spring Boot backend API for managing a **library system**. This project helps users efficiently handle book and user data using a **MySQL** database. It supports various operations such as **adding books**, **searching by title or author**, **borrowing** and **returning books**, and **tracking borrowed books**.

---

## Features 🌟

- **Book Management**: Add, search, and manage books by title, author, and genre.
- **User Management**: Track users and their borrowed books.
- **Borrow & Return**: Handle book borrowing and returning with automatic late fee calculation.
- **Search Functionality**: Search books by title or author.

---

## Technology Stack 🛠️

- **Backend Framework**: Spring Boot
- **Database**: MySQL
- **ORM**: Hibernate (JPA)
- **Language**: Java
- **Tools**: Maven, Postman (for API testing)

---

## Setup Instructions ⚙️

### Prerequisites 🧰

- **Java Development Kit (JDK)**: Version 11 or higher.
- **MySQL**: Installed and running.
- **Maven**: For dependency management.
- **Postman** (optional): For testing API endpoints.

---

### Installation Steps 🚀

1. **Clone the repository**:

```bash
git clone https://github.com/your-username/library-management-system-api.git
```
2. **Navigate to the project directory**:
``` bash
cd library-management-system-api
```
3. **Configure the database in application.properties**:
- Open the src/main/resources/application.properties file and configure the database:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
4. **Build and run the project**:
```bash
   mvn spring-boot:run
```
5. **Access the API at** http://localhost:8080.

## Future Enhancements 🚧
- 🔒 Add authentication and authorization for better security.
- 🖥️ Introduce a UI for library staff and users.
- 📧 Implement notifications for overdue books.
- 📱 Add support for e-books and digital lending.

## License 📄
- This project is licensed under the MIT License.

## Contribution 🤝
### - Contributions are welcome! Feel free to:
  - Fork the repository.
- Create a new branch.
- Make your changes.
- Submit a pull request.

## Contact 📬
### - For any queries or suggestions, feel free to reach out:
[Mukund Rakholiya](https://www.linkedin.com/in/mukund-rakholiya/)
