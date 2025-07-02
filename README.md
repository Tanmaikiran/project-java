# Java Backend OTP Verification App

This is a simple Java-based backend mini-project developed as part of the **Java Development Internship at Nebula Technologies Labs**. It simulates a secure user signup system using **OTP (One-Time Password) verification** through console interaction.

---

## Features

-  Console-based email input
-  Secure 6-digit OTP generation
-  Simulated email sending (printed to terminal)
-  OTP verification logic
-  Basic in-memory user data simulation (no real database)


##  Tech Stack

- Java 17
- Gitpod (Cloud IDE)
- No frameworks (pure Java)


## How to Run

1. **Clone the Repository**
```bash
git clone https://github.com/Tanmaikiran/project-java.git
cd project-java
Compile and Run the Application

bash
Copy
Edit
javac backend/*.java
cd backend
java Main
Test the App
Enter an email address when prompted.

The OTP will be displayed in the terminal (mock email).

Enter the OTP to simulate verification and registration. Project Structure
pgsql
Copy
Edit
project-java/
└── backend/
    ├── Main.java
    ├── User.java
    ├── Database.java
    ├── OtpManager.java
    └── EmailSender.java
 Demo
<img width="940" alt="image" src="https://github.com/user-attachments/assets/2a98e808-ba8b-495f-97bf-3b0c9f6843b4" />

Enter your email:
you@example.com
Sending OTP 123456 to email: you@example.com
Enter the OTP you received:
123456
 User registered successfully!
 Status
 All features implemented and tested
Project complete and ready for submission
