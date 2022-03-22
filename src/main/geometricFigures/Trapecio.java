package geometricFigures;

import interfaces.FlatInterface;
import interfaces.VolumeInterface;
import myExceptions.MyException;

import java.util.Scanner;

public class Trapecio implements FlatInterface {
  public static Scanner input = new Scanner(System.in);
  private double b;
  private double B;
  private double h;

  public Trapecio(){}

  public Trapecio(double b, double B, double h){
    this.setB(b);
    this.setBB(B);
    this.setH(h);
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  public double getBB() {
    return B;
  }

  public void setBB(double b) {
    boolean ok = false;
    while(!ok){
      if(b > this.getB()){
        B = b;
        ok = true;
      } else {
        System.out.println("La base mayor tiene que ser mayor que " + this.getB());
        b = Double.parseDouble(input.nextLine());
      }
    }
  }

  public double getH() {
    return h;
  }

  public void setH(double h) {
    this.h = h;
  }

  @Override
  public void imprimirCaracteristicas(){
    VolumeInterface.imprimirCalculadora();
    System.out.println("Trapecio:");
    System.out.println("Base menor: " + b);
    System.out.println("Base mayor: " + B);
    System.out.println("Altura: " + h);
  }

  @Override
  public void solicitarDatos() throws MyException{
    System.out.println("Introduce la base menor del trapecio: ");
    if(input.hasNextDouble()){
      this.setB(Double.parseDouble(input.nextLine()));
    }else{
      throw new MyException(1);
    }
    System.out.println("Introduce la base mayor del trapecio: ");
    if(input.hasNextDouble()){
      this.setBB(Double.parseDouble(input.nextLine()));
    }else{
      throw new MyException(1);
    }
    System.out.println("Introduce la altura del trapecio: ");
    if(input.hasNextDouble()){
      this.setH(Double.parseDouble(input.nextLine()));
    }else{
      throw new MyException(1);
    }
  }

  @Override
  public void calcArea() throws MyException{
    solicitarDatos();
    imprimirCaracteristicas();
    System.out.println("Área del trapecio: " + ((B + b) / 2) * h);
    FlatInterface.continuar();
  }
  
}
