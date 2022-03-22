package interfaces;
import java.util.Scanner;
import myExceptions.MyException;

public interface VolumeInterface {
  public static Scanner input = new Scanner(System.in);
  public void calcArea() throws MyException;
  public void calcVolumen();

  public void imprimirCaracteristicas();

  public static void imprimirCalculadora(){
    System.out.println("--------------------------------------");
    System.out.println("     Calculadora de Josep Castell     ");
    System.out.println("--------------------------------------");
  }

  public void solicitarDatos() throws MyException;

  public static void continuar(){
    System.out.println("CONTINUAR (ENTER)");
    input.nextLine();
  }
}
