/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm;
import java.lang.Math;
/**
 *
 * @author EGYPT_LAPTOP
 */
public class circle extends shape { 
    private double radius=1.0;
    public circle(){
    
    }
    public circle(double radius){
        this.radius=radius;
    }
    public circle(double radius,String color,boolean filled){
       super( color, filled);
       this.radius=radius;
    }
    public double getradius(){
        return radius;
    }
    public void setradius(double radius){
        this.radius=radius;
    }
    public double getarea(){
        return (Math.PI*(Math.pow(radius,2))); 
    }
    public double getparameter(){
        return(2*Math.PI*radius);
    }
    public String tostring(){
        return(""+getradius()+"/"+getarea()+"/"+getparameter()+super.getcolor()+super.isfilled());
    }
    
}

