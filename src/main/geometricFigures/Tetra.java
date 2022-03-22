package geometricFigures;

import interfaces.VolumeInterface;
import myExceptions.MyException;

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
    System.out.println("Tetraedro: ");
    System.out.println("Longitud de arista: " + arista);
  }

  @Override
  public void solicitarDatos() throws MyException {
    System.out.println("Introduce la longitud de la arista del tetraedro: ");
    if(input.hasNextDouble()){
      this.setArista(Double.parseDouble(input.nextLine()));
    }else{
      throw new MyException(1);
    }
  }

  @Override
  public void calcArea() throws MyException {
    solicitarDatos();
    imprimirCaracteristicas();
    System.out.println("Área del tetraedro: " + Math.sqrt(3) * Math.pow(arista, 2));
    VolumeInterface.continuar();
  }

  @Override
  public void calcVolumen(){
    try{
      solicitarDatos();
    }catch(MyException exception){
      
    }
    imprimirCaracteristicas();
    System.out.println("Volumen del tetraedro: " + (Math.sqrt(2) / 12) * Math.pow(arista, 3));
    VolumeInterface.continuar();
  }
}
