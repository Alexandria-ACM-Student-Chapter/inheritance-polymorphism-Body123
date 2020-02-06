/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsd;

/**
 *
 * @author
 */
public class rectangle1 extends Shape{
        private double width=1.0;
        private double length=1.0;
    
        public rectangle1(){
            
        }
        public rectangle1(double width,double lengh){
            this.width=width;
            this.length=lengh;
            
        }
        public rectangle1(double width,double lengh,String color,boolean filled){
            super(color,filled);
            this.width=width;
            this.length=lengh;
            
            
        }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }
     public double getarea() {
        return this.length*this.width;
    }
     public double permiter() {
        return 2*this.length*2*this.width;
    }
     public String tostring() {
        String s="Length"+this.length+"width"+this.width;
        return s;
        
    }
     
        
    
}
