/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package les4;
 
/**
 *
 * @author hannema
 */
public class vergelijkTest {
    public static void main(String[] args) {
        String a = new String("Ajax Amsterdam"); 
        String b = new String("abc"); 
        if(a.equals(b)){
            System.out.println(a + " equals Gelijk " + b);
        }else {
            System.out.println(a + " equals ONGelijk " + b);
        }
        if(a==b){
            System.out.println(a + " ==Gelijk " + b);
        }else {
            System.out.println(a + " == ONGelijk " + b);
        }
        
        b = "Ajax Amsterdam";
        if(a.equals(b)){
            System.out.println(a + " equals Gelijk " + b);
        }else {
            System.out.println(a + " equals ONGelijk " + b);
        }
        if(a==b){
            System.out.println(a + " == Gelijk " + b);
        }else {
            System.out.println(a + " == ONGelijk " + b);
        }
    }
}
