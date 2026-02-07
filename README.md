# Student-Result-Management-System-
This is a Java-based Student Result Management System demonstrating object-oriented design principles and design patterns such as:
        Chain of Responsibility Pattern – For sequentially handling student login and eligibility verification.
        Facade Pattern – Provides a simplified interface to interact with multiple subsystems (student info, GPA calculation, report generation).
        Open–Closed Principle (OCP) – GPA calculation is dynamic and extendable, allowing multiple calculation strategies without modifying existing code.
        
#Features
        1.Login Validation: Only student IDs containing "UWU" are considered valid. Invalid IDs stop the process.
        2.Eligibility Check: Students passing the login check are verified for exam eligibility.
        3.Dynamic Student Data: Student information (name, faculty, degree) is fetched from a simulated database.
        4.GPA Calculation: Each student’s GPA is calculated based on their individual grades. Supports adding new GPA calculation strategies easily.
        5.Result Reporting: Generates a detailed report including student ID, name, faculty, degree, and GPA.
#How to Use
        1.Run (Main.java).
        2.Enter a student ID containing "UWU" to login.
        3.The system will:
               Verify login
               Check eligibility
               Fetch student info
               Calculate GPA
               Generate the result report  
        4.Invalid student IDs will show Login Unsuccessful and stop the process.
#Example Run
<img width="745" height="661" alt="image" src="https://github.com/user-attachments/assets/3c6dabfd-5059-4e73-99ee-6048eb9cd0e9" />

