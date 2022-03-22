package interfaces;

public interface VolumeInterface {
  public void calcArea();
  public void calcVolumen();

  public void imprimirCaracteristicas();

  public static void imprimirCalculadora(){
    System.out.println("--------------------------------------");
    System.out.println("     Calculadora de Josep Castell     ");
    System.out.println("--------------------------------------");
  }
}
