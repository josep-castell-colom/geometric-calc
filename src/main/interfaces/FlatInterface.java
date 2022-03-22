package interfaces;

import myExceptions.MyException;
import java.util.Scanner;

public interface FlatInterface{
  public static Scanner input = new Scanner(System.in);
  public void calcArea() throws MyException;
  
  public void imprimirCaracteristicas();

  public void solicitarDatos();

  public static void imprimirCalculadora(){
    System.out.println("--------------------------------------");
    System.out.println("     Calculadora de Josep Castell     ");
    System.out.println("--------------------------------------");
  }

  public static void continuar(){
    System.out.println("CONTINUAR (ENTER)");
    input.nextLine();
  }
}