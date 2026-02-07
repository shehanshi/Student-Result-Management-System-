/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheha
 */
//First Handler : check student login
public class LoginHandler extends Handler {
      @Override
    public void handle(String studentId){
        System.out.println("Checking student login for ID: " + studentId);
// Check student id contains "UWU"
if (studentId.toUpperCase().contains("UWU")){
    System.out.println("Login Successful");
    
    if(next !=null){
        next.handle(studentId);
    }
}else {
    System.out.println("Login unsuccessfull! Invalid Student ID");
}
        
        
    }
        
    
    
    
    
}
