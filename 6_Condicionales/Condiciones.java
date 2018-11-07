public class Condiciones {
  public static void main(String[] args) {
    int numero1 = 10;
    if (numero1 == 11) {
      System.out.println("Estoy en el if");
    } else if (numero1 == 12) {
      System.out.println("Estoy en el else if");
    } else {
      System.out.println("Estoy en el else");
    }
    System.out.println("esto no esta en la condicion");
  }
}