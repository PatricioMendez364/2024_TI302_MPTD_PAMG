/*
ITESS
TICS
Agosto - Diciembre 2024
Estructura y organizacion de datos
Profesor Francisco Javier Montecillo Puente
Programador Patricio Arturo Mendez Gonzalez
Desctripcion: -Tarea numero optimo -Clase test-
13 de septiembre
*/
package unidad1.proglineal;

/**
 *
 * @author patol
 */
public class NumeroOptTest {
    public static void main(String[] args) {
        int arr[] = {-1,2,3,-4,5,-6};
        int arr2[] = {1,2,3};
        
        NumeroOpt nop = new NumeroOpt(arr);
        System.out.println(nop.calcular());
        
        nop.setArreglo(arr2);
        System.out.println(nop.calcular());
    }
}
