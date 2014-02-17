/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;
 
import les1.Director;
import les1.Employee;
import les1.Manager;

/**
 *
 * @author hannema
 */
public class testrun {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hoiii");
        
        Employee Joram = new Employee("Joram","Hannema","Digitaal",1233445);
        Employee Jos = new Employee("Jos","Koster","Digitaal",12322115);
        Employee Philippe = new Employee("Philippe","Bressers","Digitaal",8267863);
        Employee Nabil = new Employee("Nabil","Zehabar","Business Intelligence",8200963);
        
        Manager Marian = new Manager("Marian","De Ruyter","Digitaal",4487755,"Audi A6");
        Director Laurens = new Director("Laurens", "Lochtenberg","Digitaal",871430,"Audi A8",12_000_000);
        
        System.out.println("hallo " + Joram.getFirstName() + " " + Joram.getLastName());
        System.out.println("Je zit op afdeling " + Joram.getDepartment() + " en hebt nummer " + Joram.getEmployeeNumber());
        System.out.println("Je hebt geen leaseauto ... sorry :) ");
        
        System.out.println("hallo " + Marian.getFirstName() + " " + Marian.getLastName());
        System.out.println("Je bent manager van de afdeling " + Marian.getDepartment() + " en hebt nummer " + Marian.getEmployeeNumber());
        System.out.println("Jouw leaseauto is een " + Marian.getLeaseAuto());
        
        Marian.addEmployee(Joram);
        Marian.addEmployee(Jos);
        Marian.addEmployee(Joram);
        Marian.addEmployee(Philippe);
        
        if(Joram instanceof Employee){
            System.out.println("\n\t JA \n");
        }else{
            System.out.println("\n\t NEE \n");
        }
        System.out.println("Overzicht van mensen met Marian als manager: ");
        for(Employee emp:Marian.getEmployeeArray()){
            if( emp != null)
                System.out.println(emp.getLastName());
        }
        
        System.out.println("Nu verwijderen we Philippe ");
        Marian.removeEmployee(Philippe);
        
        System.out.println("Opnieuw het overzicht van mensen met Marian als manager: ");
        for(Employee emp:Marian.getEmployeeArray()){
            if( emp != null)
                System.out.println(emp.getLastName());
        }
        
        if(Marian.findEmployee(Nabil) != -1){
            System.out.println("Nabil gevonden");
        }else{
            System.out.println("Nabil niet gevonden");
        }
        
        if(Marian.findEmployee(Joram) != -1){
            System.out.println("Joram gevonden");
        }else{
            System.out.println("Joram niet gevonden");
        }        
        
        System.out.println("Details Joram: " + Joram.getDetails());
        System.out.println("Details Marian: " + Marian.getDetails());
        
        
    }
}
