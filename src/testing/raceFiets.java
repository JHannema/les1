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
public class raceFiets extends fiets{
    public String fietsType = "Ik ben een Racefiets";
    private int aantalVersnellingen;
    public raceFiets(int aantalWielen, int aantalVersnellingen){
        super(aantalWielen);
        this.aantalVersnellingen = aantalVersnellingen;
    }
    
    public int getAantalVersnellingen() {
        return aantalVersnellingen;
    }

    public void setAantalVersnellingen(int aantalVersnellingen) {
        this.aantalVersnellingen = aantalVersnellingen;
    }
    
}
