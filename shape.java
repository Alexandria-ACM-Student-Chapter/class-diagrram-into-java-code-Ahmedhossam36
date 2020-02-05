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
public class shape {
    private String color ="red";
    private boolean filled= true;
    public shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public shape(){
   
    }
    public String getcolor(){
        return color;
    }
    public void setcolor(String color){
        this.color=color;
    }
    public boolean isfilled(){
        return filled;
    }
    public void setfilled(boolean filled){
        this.filled=filled;
    }
    public String tostring(){
        return (getcolor()+isfilled());
    }
}
