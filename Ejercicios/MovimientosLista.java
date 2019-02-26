import java.util.*;

public class MovimientosLista {
  public static void main (String args[]){
    // CASOS
    Integer[] caso = {0,1,0,1,0,1};
    Integer[] caso2 = {1,0,0,1,1};
    Integer[] caso3 = {1,1,0,1,0,0};
    Integer[] caso4 = {1,0,1,0,1,0};
    Integer[] caso5 = {1,0,1,0,1,0,1,1};
    Integer[] caso6 = {0,0,1,0,1,0,1,1};

    List<Integer> iLista = new ArrayList(Arrays.asList(caso));
    System.out.println(iLista);

    
    int inicio = 0;

    for (int i = 0; i < iLista.size(); i++) {
        if(iLista.get(i) == 0) {
            inicio = i;
            break;
        }
    }  
    
    int movs = 0;
    // System.out.println("inicio : " + inicio);
    for (int i = inicio; i < iLista.size(); i++) {
        if(iLista.get(i) == 1) {
            movs += i - inicio;
            // System.out.println(i +  " - " + inicio + " = " + movs);
            inicio++;
        } 
    }

    System.out.println("Movs : " + movs);

  }
}