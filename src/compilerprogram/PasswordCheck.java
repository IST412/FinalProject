/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerprogram;

/**
 *
 * @author Mazayan
 */
public class PasswordCheck {
    
    public PasswordCheck() {
        
    }
    
    public void testpasswordLength(String password) {
        if(password.length() >= 10 && password.length() <= 20) {
            System.out.println("Password is appropriate length");
        }
        else {
            System.out.println("Password is NOT appropriate length");
        }
    }
    
    public void testPasswordCase(String password) {
    }
    
    public void testPasswordNumbers(String password) {
        
    }
    
    public void testPasswordCharacters(String password) {
        
    }
}
