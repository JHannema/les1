/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package les1;
import java.util.Arrays;

/**
 *
 * @author hannema
 */
public class Manager extends Employee {
    private String leaseAuto;
    private Employee[] employeeArray = new Employee[10];

    public Employee[] getEmployeeArray() {
        return employeeArray;
    }

    /**
     *
     * @return
     */
    @Override  
    public String getDetails () {
        return super.getDetails() + ", Leaseauto: " + this.getLeaseAuto();
    }
    
    public void setEmployeeArray(Employee[] employeeArray) {
        this.employeeArray = employeeArray;
    }
    
    public Manager(String firstName, String lastName, String department, int employeeNumber, String autoNaam){
        super(firstName, lastName, department, employeeNumber);
        this.leaseAuto = autoNaam;
    }
    
    // Getter
    public String getLeaseAuto() {
        return leaseAuto;
    }
    
    // Setter
    public void setLeaseAuto(String leaseAuto) {
        this.leaseAuto = leaseAuto;
    }
    
    public void removeEmployee(Employee emp){
        if(employeeArray.length == 0){
            return;
        }
        if(Arrays.asList(employeeArray).contains(emp)){
            employeeArray[Arrays.asList(employeeArray).indexOf(emp)] = null;
            System.out.println(emp.getLastName() + " verwijderd ... ");
        }
    }
    
    public void addEmployee(Employee emp){
           if(!Arrays.asList(employeeArray).contains(emp)){
               for(int i=0; i<employeeArray.length; i++){
                    if(employeeArray[i]==null){
                        employeeArray[i]=emp;
                        break;
                    }
                }
                System.out.println(emp.getLastName() + " Toegevoegd ... ");
            }else{
                System.out.println(emp.getLastName() + " staat al in de lijst... ");
           }        
    }
    
    public int findEmployee(Employee emp){
        int result = -1;
        if(Arrays.asList(employeeArray).contains(emp)){
            result = Arrays.asList(employeeArray).indexOf(emp);
        }
        return result;
    }
}