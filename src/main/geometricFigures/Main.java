package geometricFigures;

import java.util.Scanner;

import myExceptions.MyException;

public class Main{
  public static Scanner input = new Scanner(System.in);
  private static boolean on = true;

  public static boolean getOn(){
    return on;
  }

  public static void setOn(){
    on = !on;
  }

  public static void menu(){
    while(on){
      Triangle triangle = new Triangle();
      Square square = new Square();
      Circle circle = new Circle();
      Rectangle rectangle = new Rectangle();
      Trapecio trapecio = new Trapecio();
      Cube cube = new Cube();
      Cilindre cilindre = new Cilindre();
      Tetra tetra = new Tetra();
      System.out.println("--------------------------------------");
      System.out.println("Introduce una opción: ");
      System.out.println();
      System.out.println("FIGURAS 2D");
      System.out.println("1 - Calcular área de un triángulo");
      System.out.println("2 - Calcular área de un cuadrado");
      System.out.println("3 - Calcular área de un circulo");
      System.out.println("4 - Calcular área de un rectángulo");
      System.out.println("5 - Calcular área de un trapecio");
      System.out.println();
      System.out.println("FIGURAS 3D");
      System.out.println("6 - Calcular área de un cubo");
      System.out.println("7 - Calcular volumen de un cubo");
      System.out.println("8 - Calcular área de un cilindro");
      System.out.println("9 - Calcular volumen de un cilindro");
      System.out.println("10 - Calcular área de un tetraedro");
      System.out.println("11 - Calcular volumen de un tetraedro");
      System.out.println();
      System.out.println("0 - Salir");
  
      String opt = input.nextLine();
      switch(opt){
        case "1": 
          try{
            triangle.calcArea();
          }catch(MyException exception){
            System.out.println(exception.getMessage());
          }
          break;
        case "2":
          try{
            square.calcArea();
          }catch(Exception exception){
            System.out.println(exception.getMessage());
          }
          break;
        case "3":
          try{
            circle.calcArea();
          }catch(Exception exception){
            System.out.println(exception.getMessage());
          }
          break;
        case "4":
          try{
            rectangle.calcArea();
          }catch(Exception exception){
            System.out.println(exception.getMessage());
          }
          break;
        case "5":
          try{
            trapecio.calcArea();
          }catch(Exception exception){
            System.out.println(exception.getMessage());
          }
          break;
        case "6":
          try{
            cube.calcArea();
          }catch(Exception exception){
            System.out.println(exception.getMessage());
          }
          break;
        case "7":
          try{
            cube.calcVolumen();
          }catch(Exception exception){
            System.out.println(exception.getMessage());
          }
          break;
        case "8":
          try{
            cilindre.calcArea();
          }catch(Exception exception){
            System.out.println(exception.getMessage());
          }
          break;
        case "9":
          try{
            cilindre.calcVolumen();
          }catch(Exception exception){
            System.out.println(exception.getMessage());
          }
          break;
        case "10":
          try{
            tetra.calcArea();
          }catch(Exception exception){
            System.out.println(exception.getMessage());
          }
          break;
        case "11":
          try{
            tetra.calcVolumen();
          }catch(Exception exception){
            System.out.println(exception.getMessage());
          }
          break;
        case "0": setOn();
          input.close();
      }
    }
  }
  public static void main(String[] args){
    menu();
  }
}