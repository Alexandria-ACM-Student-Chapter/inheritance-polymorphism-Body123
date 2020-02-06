/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsd;

/**
 *
 * @author Wafaa
 */
public class circle extends Shape {
    private double redious=1.0;
    public circle(){
        
    }
    public circle(double radious){
       this.redious= radious;
        
    }
    public circle(double radious,String color,boolean filled){
        super(color,filled);
        this.redious=radious;
    }

    /**
     * @return the redious
     */
    public double getRedious() {
        return redious;
    }

    /**
     * @param redious the redious to set
     */
    public void setRedious(double redious) {
        this.redious = redious;
    }
    public double  area(double redious) {
        return 3.14*redious*redious;
    }
    public String tostring(){
        String s="Radious"+this.redious;
        return s;
    }
        
        
        
        
        
        
    
    
    
}
