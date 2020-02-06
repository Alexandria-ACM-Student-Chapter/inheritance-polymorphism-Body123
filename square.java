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
public class square extends rectangle1{
    
    public square(){
        
    }
    public square(double side){
        this.setLength(side);
        
    }
    public square(double side,String color,boolean filled){
        this.setColor(color);
        this.setLength(side);
        this.setFilled(filled);
        
    }

   

    /**
     * @return the size
     */
    public double getSide() {
        return this.getLength();
    }
    public double setSide() {
        return this.getLength();
    }

    /**
     * @param size the size to set
     */
    public double setwidth(double side) {
        return this.setwidth(side);
    }
    public double setlenght(double side) {
        return this.setlenght(side);
    }
    public String tostring() {
        String s;
        return s="Side"+this.getSide();
    }
    
    
    
}
