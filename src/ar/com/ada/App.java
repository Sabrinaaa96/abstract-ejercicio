package ar.com.ada;

import ar.com.ada.figure.Figure;
import ar.com.ada.subclass.Circle;
import ar.com.ada.subclass.Rectangle;
import ar.com.ada.subclass.Triangle;

import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        int chosenFigure;

        Scanner scanner = new Scanner(System.in);

        ArrayList<Figure> figures = new ArrayList<>();


        System.out.printf("Ingrese 1 si la figura a calcular es un circulo, " +
                "2 si la figura es un rectangulo o 3 si es un triangulo: ");

        chosenFigure = scanner.nextInt();

        switch (chosenFigure) {
            case 1:
                System.out.print("Ingrese el radio de su figura : ");
                double radio = scanner.nextDouble();
                Circle circle1 = new Circle(radio);
                figures.add(circle1);
                circle1.calcularArea();
                System.out.println("Su figura creada es " + circle1.toString());
                break;

            case 2:
                System.out.print("Ingrese la base de su figura : ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura de su figura: ");
                double height = scanner.nextDouble();
                Triangle triangle1 = new Triangle(base, height);
                figures.add(triangle1);
                triangle1.calcularArea();
                System.out.println("Su figura creada es " + triangle1.toString());
                break;
            case 3:
                System.out.print("Ingrese la base de su figura: ");
                base = scanner.nextDouble();
                System.out.print("Ingrese la altura de su figura: ");
                height = scanner.nextDouble();
                Rectangle rectangle1 = new Rectangle(base, height);
                figures.add(rectangle1);
                rectangle1.calcularArea();
                System.out.println("Su figura creada es " + rectangle1.toString());
                break;
            default:
                System.out.println("Ha ingresado una figura que no es valida");
        }

        System.out.printf("¿Desea calcular el area otra figura?");
        System.out.println("Digite 1 si quiere continuar de lo contrario digite 2");
        int answer = scanner.nextInt();

        //falta comparar
    }
}