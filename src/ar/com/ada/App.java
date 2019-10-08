package ar.com.ada;

import ar.com.ada.figure.Figure;
import ar.com.ada.subclass.Circle;
import ar.com.ada.subclass.Rectangle;
import ar.com.ada.subclass.Triangle;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<Figure> figures = new ArrayList<Figure>();

        Scanner scanner = new Scanner(System.in);

        int choiceFigure, i = 0;

        do {
            System.out.printf("Ingrese 1 si la figura a calcular es un circulo, " +
                    "2 si la figura es un rectangulo o 3 si es un triangulo: ");

            choiceFigure = scanner.nextInt();

            switch (choiceFigure) {
                case 1:
                    //pido y capturo el dato
                    System.out.print("Ingrese el radio de su figura : ");
                    Double radio = scanner.nextDouble();
                    //instancio la clase con el constructor con parametro
                    Circle circle1 = new Circle(radio);
                    //agrego el objeto a la lista
                    figures.add(circle1);
                    i++;
                    break;

                case 2:
                    System.out.print("Ingrese la base de su figura : ");
                    Double widthT = scanner.nextDouble();
                    System.out.print("Ingrese la altura de su figura: ");
                    Double height = scanner.nextDouble();
                    Triangle triangle1 = new Triangle(widthT, height);
                    figures.add(triangle1);
                    i++;
                    break;
                case 3:
                    System.out.print("Ingrese la base de su figura: ");
                    Double widhtR = scanner.nextDouble();
                    System.out.print("Ingrese la altura de su figura: ");
                    height = scanner.nextDouble();
                    Rectangle rectangle1 = new Rectangle(widhtR, height);
                    figures.add(rectangle1);
                    i++;
                    break;
                default:
                    System.out.println("Ha ingresado una figura que no es valida");
            }

        } while (i <= 3);
        for (int j = 0; j < figures.size(); j++) {
            Figure figure = figures.get(j);
            System.out.println("El area creada de su figura: " + j + "es: " + figure.calculateArea());
            System.out.println("Su figura creada es: " + figure.toString());
        }
    }
}