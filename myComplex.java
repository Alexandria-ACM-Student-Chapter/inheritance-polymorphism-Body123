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
public class myComplex {
    private double real=0.0;
    private double imag =0.0;
    public myComplex(){
        
    }
    public myComplex(double real,double imag){
        this.imag=imag;
        this.real=real;
        
    }

    /**
     * @return the real
     */
    public double getReal() {
        return real;
    }

    /**
     * @param real the real to set
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * @return the imag
     */
    public double getImag() {
        return imag;
    }

    /**
     * @param imag the imag to set
     */
    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real,double imag) {
        this.real= real;
        this.imag=imag;
    }
    public String tostring() {
        String s;
        return s="(real+imagi)"+this.real+this.imag;
    }
    public boolean isReal() {
        if(this.getReal()!=0){
            return true;
        }
        else
            return false;
    }
    public boolean isImag() {
        if(this.getImag()!=0){
            return true;
        }
        else
            return false;
    }
    public boolean equals1(){
        if(this.getReal()==this.getImag()){
            return true;
        }
        else 
            return false;
    }
    public boolean equals2(myComplex another){
        if(this.getReal()==another.getReal()&&this.getImag()==another.getImag()){
            return true;
        }
        else 
            return false;
    }
    public myComplex add(myComplex right) {
        right.imag=this.imag+right.imag;
        right.real=this.real+right.real;
        return right;
    }
    public myComplex sub(myComplex right) {
        right.imag=this.imag-right.imag;
        right.real=this.real-right.real;
        return right;
    }
    public myComplex multibly(myComplex right) {
        right.imag=this.imag*right.imag;
        right.real=this.real*right.real;
        return right;
    }
    public myComplex divide(myComplex right) {
        right.imag=this.imag/right.imag;
        right.real=this.real/right.real;
        return right;
    }
     myComplex  new1;
    public myComplex addnew(myComplex right) {
     
      new1.imag=this.imag+right.imag;
      new1.real=this.real+right.real;
        return new1;
    }
    public myComplex subnew(myComplex right) {
     
      new1.imag=this.imag-right.imag;
      new1.real=this.real-right.real;
        return new1;
    }
    
    
}
