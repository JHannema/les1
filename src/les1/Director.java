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
public class Director extends Manager {
    private double budget;

    public Director(String firstName, String lastName, String department, int employeeNumber, String autoNaam, double budget){
        super(firstName, lastName, department, employeeNumber, autoNaam);
        this.budget = budget;
    }
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    
    public void approveExpense(double exp){
        
    }
}
