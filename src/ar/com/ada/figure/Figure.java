package ar.com.ada.figure;

import java.util.Objects;

public abstract class Figure {
    protected  Double area;

    public Figure(){}

    public Figure(double area){
        this.area = area;
    }

    public abstract double calculateArea();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public String toString() {
        return "Figure: [ area = " +area + "]";
    }
    @Override
    public int hashCode() {
        return -25 * Objects.hash(this.area);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Figure that = (Figure) obj;
        return this.area.equals(that.area);
    }
}