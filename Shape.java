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
public class Shape {
    private String color="red";
    private boolean filled=true;
    public Shape(){
       
    }
    public Shape(String color,boolean Filled){
        this.color=color;
        this.filled=filled;
        
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String tostring() {
        String s="color"+this.color+"filled"+this.filled;
        return s;
    }
    
    
}
