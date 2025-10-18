# 🧮 Calci-App

Calci-App is a simple yet powerful web-based calculator application built with **Spring Boot**, **JPA**, **MySQL**, and **Thymeleaf**.  
It allows users to perform basic arithmetic operations through an interactive and user-friendly web interface.

---

## 🚀 Features

- ➕ Perform basic arithmetic operations (Addition, Subtraction, Multiplication, Division)
- 💾 Stores calculation history using **JPA** and **MySQL**
- 🧠 Dynamic UI rendered with **Thymeleaf**
- ⚙️ Built with **Spring Boot** for fast and scalable backend setup

---

## 🛠️ Technologies Used

| Category | Tools/Technologies |
|-----------|--------------------|
| Backend  | Spring Boot, Spring Data JPA |
| Frontend | Thymeleaf, HTML, CSS |
| Database | MySQL |
| IDE | IntelliJ IDEA / Eclipse |
| Build Tool | Maven |

---

## ⚙️ Installation and Setup

### 1️⃣ Clone the Repository
``bash
git clone https://github.com/your-username/Calci-app.git
cd Calci-app
2️⃣ Configure Database
Create a new MySQL database (e.g., calci_db)

Update your application.properties file:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/calci_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update

3️⃣ Build and Run the App
bash
Copy code
mvn spring-boot:run
Then open your browser and go to:
👉 http://localhost:8080

💻 Usage
Open the Calci-App homepage

Enter numbers and select operations

View results instantly

Check calculation history stored in the database

📸 Screenshots (optional)
Add screenshots of your UI or pages here.

🤝 Contributing
Contributions are welcome!
If you’d like to improve this project, feel free to fork the repo and submit a pull request.

👤 Author
Kantharaju VT
📧 kantharajkantha4862@gmail.com
🔗 https://www.linkedin.com/in/kantharaju-vt-123bb92aa/
🔗 https://github.com/Kantharajuvt

📄 License
This project is open-source and available under the MIT License.







