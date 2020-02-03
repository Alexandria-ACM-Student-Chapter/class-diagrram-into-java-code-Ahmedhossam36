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
public class account {
    private String id;
    private String name;
    private int balance=0;
    public  account (String id, String name){
        this.id=id;
        this.name=name;
    }
     public  account (String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public String getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getbalance(){
        return balance;
    }
    public int credit(int amount){
        this.balance=amount+balance;
        return balance;
    }
     public void setbalance(int balance){
            this.balance=balance;
                  
        }
    public int debit(int amount){
        if(amount<=balance){
            balance=balance-amount;
        }
       
        else{
            System.out.println("Amount exceeded balance");
        } 
        return balance;
        }
   public int transferto(int amount, account another){
       if(amount<=balance){
           this.balance=balance-amount;
           another.balance=amount;
       }
       else{
           System.out.println("the amount exceeds balance");
       }
     return balance;  
   } 
 public String toString(){
     return (getid()+getname()+getbalance());
 }   
}
