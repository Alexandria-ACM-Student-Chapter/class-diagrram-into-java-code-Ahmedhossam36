
package acm;


public class square extends rectangle{
    public square(){}
    public square(double side){
        super(side,side);
    }
    public square(double side, String color,boolean filled){
        super(side,side);
        super.setfilled(filled);
        super.setcolor(color);
        
    }
    public double getside(){
        return super.getlength();
    }
    public  void setside(double side){
        super.setlength(side);
    }
    public void setwidth(double side){
        super.setwidth(side);
    }
    public void setlength(double side){
        super.setlength(side);
    }
    public String tostring(){
        return(""+getside()+super.getcolor()+super.isfilled());
    }
 }