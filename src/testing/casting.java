/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;
 
/**
 *
 * @author hannema
 */
public class casting {
    public static void main(String[] args) {
        fiets mijnFiets = new raceFiets(3,7);
        System.out.println("" + mijnFiets.getFietstype() );
        
        raceFiets mijnFiets2 = new raceFiets(3,7);
        System.out.println("" + mijnFiets2.getFietstype() );
    }
}
