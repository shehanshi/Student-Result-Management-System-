/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheha
 */
import java.util.HashMap;
import java.util.Map;
//Subsystem class : fetch student grades from database
public class DatabaseService {
     private Map<String, String[]> studentData = new HashMap<>();
    private Map<String, String> gradesData = new HashMap<>();

    // Constructor: add mulsttiple students
    public DatabaseService(){
        // Student info: {Name, Faculty, Degree}
        studentData.put("UWU/ICT/21/004", new String[]{"Ladeesha Shehanshi", "Faculty of Technological Studies", "Information & Communication Technology"});
        studentData.put("UWU/SCT/21/002", new String[]{"Nimal Perera", "Faculty of Applied Sciences", "Science and Technology"});
        studentData.put("UWU/CST/21/001", new String[]{"Kasuni De Silva", "Faculty of Applied Sciences", "Computer science and Technology"});

        // Grades for each student
        gradesData.put("UWU/ICT/21/004", "A,B,A");
        gradesData.put("UWU/SCT/21/002", "B,A,B");
        gradesData.put("UWU/CST/21/001", "A,C,B");
    }

    // Fetch student info
    public String[] getStudentInfo(String studentId){
        return studentData.getOrDefault(studentId, new String[]{"Unknown", "Unknown", "Unknown"});
    }

    // Fetch grades for a specific student
    public String getGrades(String studentId){
        System.out.println("Fetching grades for student " + studentId + "...");
        return gradesData.getOrDefault(studentId, "F,F,F");
    }
}
