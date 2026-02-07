/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheha
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

         Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();

        // Chain pattern
        Handler login = new LoginHandler();
        Handler eligibility = new EligibilityHandler();
        login.setNext(eligibility);
        login.handle(studentId);

        // Facade pattern
        ResultFacade facade = new ResultFacade();
        facade.checkResult(studentId);

        System.out.println("\nProcess completed.");
    }
    
}
