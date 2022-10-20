/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttf;

/**
 *
 * @author skyhawk
 */
public class Complex {

    public double realNum;
    public double imagNum;

    public Complex(double real, double imag) {
        this.realNum = real;
        this.imagNum = imag;
    }

    public Complex add(Complex secondNumber) {
        double newReal = this.realNum + secondNumber.realNum;
        double newImag = this.imagNum + secondNumber.imagNum;

        return new Complex(newReal, newImag);
    }

    public void addInPlace(Complex secondNumber) {
        this.realNum += secondNumber.realNum;
        this.imagNum += secondNumber.imagNum;
    }

    public Complex subtract(Complex secondNumber) {
        double newReal = this.realNum - secondNumber.realNum;
        double newImag = this.imagNum - secondNumber.imagNum;

        return new Complex(newReal, newImag);
    }

    public void subtractInPlace(Complex secondNumber) {
        this.realNum -= secondNumber.realNum;
        this.imagNum -= secondNumber.imagNum;
    }

    
    public Complex multiply(Complex secondNumber)
    {
        double newReal = (this.realNum*secondNumber.realNum)-(this.imagNum*secondNumber.imagNum);
        double newImag = (this.imagNum*secondNumber.realNum)+(this.realNum*secondNumber.imagNum);
        return new Complex(newReal, newImag);
    }
    
    public void multiplyInPlace(Complex secondNumber)
    {
        this.imagNum = (this.realNum*secondNumber.realNum)-(this.imagNum*secondNumber.imagNum);
        this.imagNum = (this.imagNum*secondNumber.realNum)+(this.realNum*secondNumber.imagNum);
    }
    
    public String toString(){
        return this.realNum + " + " + this.imagNum+"i";
    }
    
    
    public static void main(String[] args) {
        Complex first = new Complex(2, 4);
        Complex second = new Complex(6, 5);

        Complex third = first.add(second);
        System.out.println("Adding: " + third);
        
        Complex fourth = first.subtract(second);
        System.out.println("Subtracting: " + fourth);
        
        Complex fifth = first.multiply(second);
        System.out.println("Multiplying " + fifth);
    }

}
