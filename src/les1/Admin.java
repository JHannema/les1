/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package les1;
 
/**
 *
 * @author hannema
 */
public class Admin extends Employee {
    private boolean fullTimer;
    public Admin(String firstName, String lastName, String department, int employeeNumber, boolean fullTimer){
        super(firstName, lastName, department, employeeNumber);
        this.fullTimer = fullTimer; 
    }
    
    public boolean isFullTimer() {
        return fullTimer;
    }

    public void setFullTimer(boolean fullTimer) {
        this.fullTimer = fullTimer;  
    }
}
