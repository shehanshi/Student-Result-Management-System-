/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheha
 */
//Default GPA calculation class
public class StandardGPA implements GPA {
   @Override
    public double calculateGPA(String grades){
        String[] gradeArray = grades.split(",");
        double total = 0;
        for(String g : gradeArray){
            switch(g){
                case "A": total += 4.0; break;
                case "B": total += 3.0; break;
                case "C": total += 2.0; break;
                case "D": total += 1.0; break;
                default: total += 0; break;
            }
        }
        return total / gradeArray.length;
    }
    
}
