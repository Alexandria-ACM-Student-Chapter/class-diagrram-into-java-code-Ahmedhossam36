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
public class rectangle extends shape {

    private double width = 1.0;
    private double length = 1.0;

    public rectangle() {

    }

    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getwidth() {
        return width;
    }

    public double getlength() {
        return length;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    public void setlength(double length) {
        this.length = length;
    }

    public double getarea() {
        return length * width;
    }

    public double getparameter() {
        return ((length + width) * 2);
    }

    public String tostring() {
        return ("" + getwidth() + getlength() + getarea() + getparameter()+super.getcolor()+super.isfilled());
    }
}