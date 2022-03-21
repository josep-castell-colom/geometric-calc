package geometricInterface;

import java.util.Scanner;
import myExceptions.MyException;

public class Square implements GeometricInterface {
  Scanner input = new Scanner(System.in);
  private double side;

  public Square(){}

  public Square(double side){
    this.setSide(side);
  }

  public double getSide(){
    return side;
  }

  public void setSide(double side){
    this.side = side;
  }

  @Override
  public void imprimirCaracteristicas(){
    System.out.println("--------------------------------");
    System.out.println("  Calculadora de Josep Castell");
    System.out.println("--------------------------------");
    System.out.println("Cuadrado: ");
    System.out.println("Lado: " + this.getSide());
  }

  @Override
  public void calcularArea() throws MyException{
    this.imprimirCaracteristicas();
    System.out.println("Área del cuadrado: " + Math.pow(this.side, 2));
  }

  @Override
  public void calcularVolumen(){
    this.imprimirCaracteristicas();
    System.out.println("Volumen del cubo: " + Math.pow(this.side, 3));
  }

  @Override
  public void solicitarDatos(){
    System.out.println("Introduce la longitud del lado: ");
    this.setSide(Double.parseDouble(input.nextLine()));
  }
}
