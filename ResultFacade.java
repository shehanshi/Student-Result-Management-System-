/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheha
 */
//Facade pattern class
public class ResultFacade {
     private DatabaseService db = new DatabaseService();
    private GPA gpaCalculator = new StandardGPA();
    private Report report = new Report();

    public void checkResult(String studentId){

        // Get student info
        String[] info = db.getStudentInfo(studentId);
        String name = info[0];
        String faculty = info[1];
        String degree = info[2];

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Faculty: " + faculty);
        System.out.println("Degree: " + degree);

        // Get student's grades
        String grades = db.getGrades(studentId);

        // Calculate GPA dynamically
        double gpa = gpaCalculator.calculateGPA(grades);

        // Generate report
        report.generateReport(studentId, name, faculty, degree, gpa);
    }
}
