
package exercicio2;

import java.util.Arrays;


public class BubbleSort implements Ordenavel{
    public void ordenar(int [] numeros){
        
   
       Arrays.sort(numeros);
       for (int i = 0; i < numeros.length; i++){
           System.out.println("" + numeros[i]);
       }
      
    }
}
