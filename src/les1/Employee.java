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
public class Employee {
    private String firstName;
    private String lastName;
    private int employeeNumber; 
    private String department; 
    
    public Employee(String firstName, String lastName, String department, int employeeNumber){
         this.firstName = firstName;
         this.lastName = lastName;
         this.department = department; 
         this.employeeNumber = employeeNumber; 
    }
    
    public String getDetails () {
        return firstName + " " + lastName + ", afdeling: " + department + ", nummer: " + employeeNumber;
    }
    
    // Getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getDepartment(){
        return department;
    }
    public int getEmployeeNumber(){
        return employeeNumber;
    }
    
    // Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setemployeeNumber(int employeeNumber){
        this.employeeNumber = employeeNumber;
    }
}
