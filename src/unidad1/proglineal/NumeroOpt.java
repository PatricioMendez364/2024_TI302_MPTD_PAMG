/*
ITESS
TICS
Agosto - Diciembre 2024
Estructura y organizacion de datos
Profesor Francisco Javier Montecillo Puente
Programador Patricio Arturo Mendez Gonzalez
Desctripcion: -Tarea numero optimo-
13 de septiembre
*/
package unidad1.proglineal;

/**
 *
 * @author patol
 */
public class NumeroOpt {
    private int[] arreglo;

    public NumeroOpt(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
    
    
    public int calcular(){
        int minimo = arreglo[0];
        int index = 0;
        for(int i = 1; i < arreglo.length; i++){
            if(arreglo[i] < minimo){
                index = i;
                minimo = arreglo[i];
            }
        }
        return minimo <= 0 ? -1: index;
    }
    
}
