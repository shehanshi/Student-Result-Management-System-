/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheha
 */
//Abstract handler class for chain for Responsibility Pattern
abstract class Handler {
    protected Handler next;

    // set next handler
    public void setNext(Handler next){
        this.next = next;
    }

    public abstract void handle(String studentId);
    
}
