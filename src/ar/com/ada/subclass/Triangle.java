package ar.com.ada.subclass;

import ar.com.ada.figure.Figure;

import java.util.Objects;

public class Triangle extends Figure {
    private Double widthT;
    private Double height;

  public Triangle (){}

  public Triangle (Double base, Double height) {
      this.widthT = base;
      this.height = height;
  }

    public double getWidthT() {
        return this.widthT;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidthT(double widthT) {
        this.widthT = widthT;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
       area = (widthT *height)/ 2;
       return area;
    }

    @Override
    public String toString() {
        return "Triangle: [base = " + widthT + " , height = " + height+ " , area = "+area + "]";
    }

    @Override
    public int hashCode() {
        return -12 * Objects.hash(this.widthT, this.height);
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
        Triangle that = (Triangle) obj;

        //verificar los estados de los atrr
        return super.equals(that) &&
                widthT.equals(that.height) &&
                height.equals(that.height);
    }
}
