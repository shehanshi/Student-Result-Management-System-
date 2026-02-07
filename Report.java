/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheha
 */
//Subsystem class : report genarate
public class Report {
    public void generateReport(String studentId, String name, String faculty, String degree, double gpa){
        System.out.println("----- RESULT REPORT -----");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Faculty: " + faculty);
        System.out.println("Degree: " + degree);
        System.out.println("GPA: " + gpa);
    }
}
