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
public class fiets {
    private int aantalWielen;
    private String fietsType = "Ik ben een Fiets";
    public fiets(int aantalWielen){
        this.aantalWielen = aantalWielen;
    }
    public int getAantalWielen() {
        return aantalWielen;
    }

    public void setAantalWielen(int aantalWielen) {
        this.aantalWielen = aantalWielen;
    }
    
    public String getFietstype(){
        return fietsType;
    }
}
