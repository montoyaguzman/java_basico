import java.util.*;

public class OrdenamientoLista {
  public static void main (String args[]){
      // CASOS
      Integer[] caso = {0,1,0,1,0,1};
      Integer[] caso2 = {1,0,0,1,1};
      Integer[] caso3 = {1,1,0,1,0,0};
      Integer[] caso4 = {1,0,1,0,1,0};
      Integer[] caso5 = {1,0,1,0,1,0,1,1};
      Integer[] caso6 = {0,0,1,0,1,0,1,1};
      List<Integer> iLista = new ArrayList(Arrays.asList(caso5));
      System.out.println(iLista.toString());

      int cont = 0;

      for (int i = 0; i < iLista.size(); i++) {
          if(iLista.get(i) == 1) {
              for(int j=i; j>=0; j--) {
                // System.out.println(j);
                    if (iLista.get(j) == 0 && iLista.get(j+1) == 1) {
                      iLista.set(j, 1);
                      iLista.set(j + 1, 0);
                      cont++;
                      // System.out.println(cont);
                  }
              }
          }
      }

      System.out.println(iLista.toString());
      System.out.println("Movs : " + cont);
  }
}