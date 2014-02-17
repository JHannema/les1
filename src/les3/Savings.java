/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package les3; 

/**
 *
 * @author hannema
 */
public class Savings extends Account {
    private double interestRate;
    public Savings(double balance, double rate) {
        super(balance);
        this.interestRate = rate;
    }
    
    public double getRate(){
        return interestRate;
    }
    
    public void setRate(double interestRate){
        this.interestRate = interestRate;
    }
}
