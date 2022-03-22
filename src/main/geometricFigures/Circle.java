package geometricFigures;

import interfaces.FlatInterface;
import myExceptions.MyException;

import java.util.Scanner;

public class Circle implements FlatInterface {
  public static Scanner input = new Scanner(System.in);
  private double r;

  public Circle(){}

  public Circle(double r){
    this.setR(r);
  }

  public double getR(){
    return this.r;
  }

  public void setR(double r){
    this.r = r;
  }

  @Override
  public void imprimirCaracteristicas(){
    FlatInterface.imprimirCalculadora();
    System.out.println("Círculo: ");
    System.out.println("Radio: " + this.getR());
  }

  @Override
  public void solicitarDatos() throws MyException{
    System.out.println("Introduce el radio del círculo: ");
    if(input.hasNextDouble()){
      this.setR(Double.parseDouble(input.nextLine()));
    }else{
      throw new MyException(1);
    }
  }

  @Override
  public void calcArea() throws MyException{
    solicitarDatos();
    imprimirCaracteristicas();
    System.out.println("Área del círculo: " + Math.PI * (Math.pow(r, 2)));
  }
}
