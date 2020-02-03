/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm;

/**
 *
 * @author EGYPT_LAPTOP
 */
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary ;
   public  Employee(int id,String firstname,String lastname,int salary){
       this.id=id;
       this.firstname=firstname;
       this.lastname=lastname;
       this.salary=salary;
    }
   public int getid(){
       return id;
   } 
   public String getfirstname(){
       return firstname;
   }
   public String getlastname(){
       return lastname;
   }
   public int getsalary(){
       return salary;
   } 
   public String getname(){
       String name=this.firstname+this.lastname;
       return name;
   }
   
   public  void setsalary(int salary){
        this.salary=salary;
    }
    public  int  getAnnualsalary(int salary){
        this.salary=salary*12;
        return salary;
    }
    public int raisesalary(int percent){
        this.salary=salary+(salary*(percent/100));
        return salary;
    }
    public String tostring(){
      return (getid()+getname()+getsalary());
        
    }
}
