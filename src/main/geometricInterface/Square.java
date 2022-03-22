package geometricInterface;

import java.util.Scanner;

import interfaces.FlatInterface;
import myExceptions.MyException;

public class Square implements FlatInterface {
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
    FlatInterface.imprimirCalculadora();
    System.out.println("Cuadrado: ");
    System.out.println("Lado: " + this.getSide());
  }
  
  @Override
  public void solicitarDatos(){
    System.out.println("Introduce la longitud del lado: ");
    this.setSide(Double.parseDouble(input.nextLine()));
  }
  
    @Override
    public void calcArea() throws MyException{
      this.imprimirCaracteristicas();
      System.out.println("Área del cuadrado: " + Math.pow(this.side, 2));
      FlatInterface.continuar();
    }
}
