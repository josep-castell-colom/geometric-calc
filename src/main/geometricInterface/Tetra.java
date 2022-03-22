package geometricInterface;

import interfaces.VolumeInterface;
import java.util.Scanner;

public class Tetra implements VolumeInterface {
  public static Scanner input = new Scanner(System.in);
  private double arista;

  public Tetra(){}

  public Tetra(double arista){
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
    System.out.println("Introduce la longitud de la arista del tetraedro: ");
    this.setArista(Double.parseDouble(input.nextLine()));
  }

  @Override
  public void calcArea(){
    imprimirCaracteristicas();
    System.out.println("Área del tetraedro: " + Math.sqrt(3) * Math.pow(arista, 2));
    VolumeInterface.continuar();
  }

  @Override
  public void calcVolumen(){
    imprimirCaracteristicas();
    System.out.println("Volumen del tetraedro: " + (Math.sqrt(2) / 12) * Math.pow(arista, 3));
    VolumeInterface.continuar();
  }
}
