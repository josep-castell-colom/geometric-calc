package geometricFigures;

import interfaces.VolumeInterface;
import myExceptions.MyException;

import java.util.Scanner;

public class Cube implements VolumeInterface {
  public static Scanner input = new Scanner(System.in);
  private double arista;

  public Cube(){}

  public Cube(double arista){
    this.setArista(arista);
  }

  public double getArista() {
    return arista;
  }

  public void setArista(double arista) {
    this.arista = arista;
  }

  @Override
  public void imprimirCaracteristicas(){
    VolumeInterface.imprimirCalculadora();
    System.out.println("Cubo: ");
    System.out.println("Longitud de arista: " + arista);
  }

  @Override
  public void solicitarDatos() throws MyException{
    System.out.println("Introduce la longitud de la arista del cubo: ");
    if(input.hasNextDouble()){
      this.setArista(Double.parseDouble(input.nextLine()));
    }else{
      throw new MyException(1);
    }
  }

  @Override
  public void calcArea() throws MyException{
    solicitarDatos();
    imprimirCaracteristicas();
    System.out.println("Área del cubo: " + 6 * Math.pow(arista, 2));
    VolumeInterface.continuar();
  }

  @Override
  public void calcVolumen(){
    boolean ok = false;
    while(!ok){
      try{
        solicitarDatos();
        ok = true;
      }catch(MyException exception){
        System.out.println(exception.getMessage());
      }
    }
    imprimirCaracteristicas();
    System.out.println("Volumen del cubo: " + Math.pow(arista, 3));
    VolumeInterface.continuar();
  }
}
