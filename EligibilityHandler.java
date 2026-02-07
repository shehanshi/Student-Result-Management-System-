/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheha
 */
//Second Handler : check eligibility
public class EligibilityHandler extends Handler {
     @Override
    public void handle(String studentId){
        System.out.println("Checking exam eligibility...");

        
        System.out.println("Student is eligible to view results");

        if(next != null){
            next.handle(studentId);
        }
    }
    
}
