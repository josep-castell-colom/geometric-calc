package geometricFigures;

import interfaces.VolumeInterface;
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
    System.out.println("Longitud de arista: " + arista);
  }

  @Override
  public void solicitarDatos(){
    System.out.println("Introduce la longitud de la arista del cubo: ");
    this.setArista(Double.parseDouble(input.nextLine()));
  }

  @Override
  public void calcArea(){
    solicitarDatos();
    imprimirCaracteristicas();
    System.out.println("Área del cubo: " + 6 * Math.pow(arista, 2));
    VolumeInterface.continuar();
  }

  @Override
  public void calcVolumen(){
    solicitarDatos();
    imprimirCaracteristicas();
    System.out.println("Volumen del cubo: " + Math.pow(arista, 3));
    VolumeInterface.continuar();
  }
}
