import java.util.Scanner;
// import java.io.*;

public class Suma {
  public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      int numero1 = 0;
      int numero2 = 0;

      System.out.println("Ingresa num1: ");
      numero1 = Integer.parseInt(sc.nextLine());

      System.out.println("Ingresa num2: ");
      numero2 = sc.nextInt();

      int resultado = numero1 + numero2;

      System.out.println("Resultado = " + resultado);
      System.out.println(sc.nextLine() instanceof String);
  }
}