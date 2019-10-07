package ar.com.ada.subclass;

import ar.com.ada.figure.Figure;

import java.util.Objects;

public class Circle extends Figure {
    //attr
    private Double radio;
    static final Double pi = 3.1415;

    //constructores
    public Circle(){}

    public Circle (Double radio){
        this.radio = radio;
    }

    //getter and setter
    public double getRadio() {
        return radio;
    }
    public static double getPi() {
        return pi;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return this.area = pi * radio * radio;
    }

    @Override
    public String toString() {
        return "Circle: [radio = " + radio + ", pi= " + pi + " , area= " +area +"]";
    }

    @Override
    public int hashCode() {
        return -12 * Objects.hash(this.radio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        //castear la clase
        Circle that = (Circle) obj;
        return super.equals(that) &&
                this.radio.equals(that.radio);
    }
}
