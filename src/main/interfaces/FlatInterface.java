package interfaces;

import myExceptions.MyException;

public interface FlatInterface{
  public void calcArea() throws MyException;
  
  public void imprimirCaracteristicas();

  public void solicitarDatos();

  public static void imprimirCalculadora(){
    System.out.println("--------------------------------------");
    System.out.println("     Calculadora de Josep Castell     ");
    System.out.println("--------------------------------------");
  }
}