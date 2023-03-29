/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author nitisakkangkhan
 */
public class MyException extends Exception { // constructor
    public MyException(String msg) { 
        super(msg);
    }
    public MyException() { 
        super();
    }
}
