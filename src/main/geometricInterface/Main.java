package geometricInterface;

import java.util.Scanner;
import myExceptions.MyException;

public class Main{
  private static boolean on = true;

  public static boolean getOn(){
    return on;
  }

  public static void setOn(){
    on = !on;
  }
  public static void main(String[] args){
    while(on){
      Scanner input = new Scanner(System.in);
      Square square = new Square();
      System.out.println("--------------------------------");
      System.out.println("Introduce una opción: ");
      System.out.println("1 - Calcular área de un cuadrado");
      System.out.println("2 - Calcular volumen de un cubo");
  
      System.out.println("0 - Salir");
  
      String opt = input.nextLine();
      switch(opt){
        case "1": 
        try{
          square.solicitarDatos();
          square.calcularArea();
        }catch(Exception exception){
          System.out.println(exception.getMessage());
        }
          break;
        case "2":
          square.solicitarDatos();
          square.calcularVolumen();
          break;
        case "0": setOn();
      }
    }
  }
}