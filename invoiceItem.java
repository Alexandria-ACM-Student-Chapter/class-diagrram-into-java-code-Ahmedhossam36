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
public class invoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitprice;
    public invoiceItem(String id,String desc,int qty,double unitprice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitprice=unitprice;
    }
    public String getid(){
        return id;
    }
    public String getdesc(){
        return desc;
    }
    public int getqty(){
        return qty;
    }
    public void setqty(int qty){
        this.qty=qty;
    }
    public double getunitprice(){
        return unitprice;
    }
    public void setunitprice(double unitprice){
        this.unitprice=unitprice;
    }
    public double gettotal(){
        return qty*unitprice;
    }
    public String toString(){
        return(getid()+"\t"+getdesc()+"\t"+getqty()+"\t"+getunitprice());
    }
}
