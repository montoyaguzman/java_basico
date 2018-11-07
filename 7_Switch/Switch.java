import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numeroMes;
    System.out.println("Introduzca mes: ");
    // poarseo o casteo
    numeroMes = sc.nextInt();

    switch (numeroMes) {
    case 1:
      System.out.println("ENERO");
      break;
    case 2:
      System.out.println("FEBRERO");
      break;
    default:
      System.out.println("MES NO DISPONIBLE");
      break;
    }

  }
}