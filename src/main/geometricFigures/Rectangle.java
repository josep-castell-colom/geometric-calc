package geometricFigures;

import interfaces.FlatInterface;
import myExceptions.MyException;

import java.util.Scanner;

public class Rectangle implements FlatInterface {
  public static Scanner input = new Scanner(System.in);
  private double b;
  private double h;

  public Rectangle(){}

  public Rectangle(double b, double h){
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
    System.out.println("Rectángulo: ");
    System.out.println("Base: " + b);
    System.out.println("Altura: " + h);
  }

  @Override
  public void solicitarDatos() throws MyException{
    System.out.println("Introduce la base del rectángulo: ");
    if(input.hasNextDouble()){
      this.setB(Double.parseDouble(input.nextLine()));
    }else{
      throw new MyException(1);
    }
    System.out.println("Introduce la altura del rectángulo: ");
    this.setH(Double.parseDouble(input.nextLine()));
  }

  @Override
  public void calcArea() throws MyException{
    solicitarDatos();
    imprimirCaracteristicas();
    System.out.println("Área del rectángulo: " + (b * h));
    FlatInterface.continuar();
  }
}
