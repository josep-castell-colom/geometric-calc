package geometricInterface;

import interfaces.FlatInterface;
import java.util.Scanner;

public class Triangle implements FlatInterface {
  public static Scanner input = new Scanner(System.in);
  private double b;
  private double h;

  public Triangle(){}

  public Triangle(double b, double h){
    this.setB(b);
    this.setH(h);
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  public double getH() {
    return h;
  }

  public void setH(double h) {
    this.h = h;
  }

  @Override
  public void imprimirCaracteristicas(){
    FlatInterface.imprimirCalculadora();
    System.out.println("Triángulo: ");
    System.out.println("Base: " + this.getB());
    System.out.println("Altura: " + this.getH());
  }

  @Override
  public void solicitarDatos(){
    System.out.println("Introduce la base del triángulo: ");
    this.setB(Double.parseDouble(input.nextLine()));
    System.out.println("Introduce la altura del triángulo: ");
    this.setH(Double.parseDouble(input.nextLine()));
  }

  @Override
  public void calcArea(){
    imprimirCaracteristicas();
    System.out.println("Área del triángulo: " + (b * h) / 2);
  }
}
