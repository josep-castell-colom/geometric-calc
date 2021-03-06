package geometricFigures;

import interfaces.VolumeInterface;
import myExceptions.MyException;

import java.util.Scanner;

public class Cilindre implements VolumeInterface {
  public static Scanner input = new Scanner(System.in);
  private double r;
  private double h;

  public Cilindre(){}

  public Cilindre(double r, double h){
    this.setR(r);
    this.setH(h);
  }

  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
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
    System.out.println("Cilindro: ");
    System.out.println("Radio: " + r);
    System.out.println("Altura: " + h);
  }

  @Override
  public void solicitarDatos() throws MyException{
    System.out.println("Introduce el radio del cilindro: ");
    if(input.hasNextDouble()){
      this.setR(Double.parseDouble(input.nextLine()));
    }else{
      throw new MyException(1);
    }
    System.out.println("Introduce la altura del cilindro: ");
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
    System.out.println("Área del cilindro: " + 2 * Math.PI * r * (r + h));
    VolumeInterface.continuar();
  }

  @Override
  public void calcVolumen(){
    try{
      solicitarDatos();
    }catch(MyException exception){
      
    }
    imprimirCaracteristicas();
    System.out.println("Volumen del cilindro: " + Math.PI * Math.pow(r, 2) * h);
    VolumeInterface.continuar();
  }
}
