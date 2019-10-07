package ar.com.ada.subclass;

import ar.com.ada.figure.Figure;

import java.util.Objects;

public class Rectangle extends Figure {

    private Double base;
    private Double height;

    public Rectangle() {}

    public Rectangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcularArea(){
        area = base * height;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle: [base = " + base + " , height = " + height + " ,  area = " + area+ " ]";
    }

    @Override
    public int hashCode() {
        return -12 * Objects.hash(this.base, this.height);
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
        Rectangle that = (Rectangle) obj;
        return super.equals(that) &&
                this.base.equals(that.base) &&
                this.height.equals(that.height);
    }
}