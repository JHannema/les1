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
public class Engineer extends Employee {
    private String skillSet;
    public Engineer(String firstName, String lastName, String department, int employeeNumber, String skillSet){
        super(firstName, lastName, department, employeeNumber);
        this.skillSet = skillSet;
    }
    
    public String getSkillSet(){
        return skillSet;
    }
    
    public void setSkillSet(String skillSet){
        this.skillSet = skillSet;
    }
}
