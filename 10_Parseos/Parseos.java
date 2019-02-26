public class Parseos {
  public static void main(String args[]) {
      
      // parse directo
      short numero1 = 10;
      double numero2 = numero1;

      // parse explicito
      int numero3 = 10;
      byte numero4 = (byte) numero3;

      byte n = 127;
      char a = (char) n;

      System.out.println(numero1);
      System.out.println(numero2);
      System.out.println(numero3);
      System.out.println(numero4);
      System.out.println(n);

      byte i = 1;
      byte j = 1;
      k = (int)i + (int)j;
      System.out.println("k: " + k);

  }
}