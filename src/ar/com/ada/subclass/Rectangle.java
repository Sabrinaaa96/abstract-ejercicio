package ar.com.ada.subclass;

import ar.com.ada.figure.Figure;

import java.util.Objects;

public class Rectangle extends Figure {

    private Double widthR;
    private Double height;

    public Rectangle() {}

    public Rectangle(Double widthR, Double height) {
        this.widthR = widthR;
        this.height = height;
    }

    public double getWidthR() {
        return widthR;
    }

    public double getHeight() {
        return height;
    }

    public void setWidthR(double widthR) {
        this.widthR = widthR;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // implementacion

    @Override
    public double calculateArea(){
        area = widthR * height;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle: [base = " + widthR + " , height = " + height + " ,  area = " + area+ " ]";
    }

    @Override
    public int hashCode() {
        return -12 * Objects.hash(this.widthR, this.height);
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
                this.widthR.equals(that.widthR) &&
                this.height.equals(that.height);
    }
}