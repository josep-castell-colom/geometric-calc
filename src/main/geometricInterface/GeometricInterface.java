package geometricInterface;

import myExceptions.MyException;

public interface GeometricInterface{
  public void calcularArea() throws MyException;
  public void calcularVolumen();
  public void imprimirCaracteristicas();
  public void solicitarDatos();
}