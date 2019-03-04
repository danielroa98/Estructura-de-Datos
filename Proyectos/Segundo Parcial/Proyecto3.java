/*
 *Proyecto 3; Busqueda Binaria y Secuencial
 *
 *Daniel Roa
 *
 *A01021960
 *
 *Fecha de entrega: 28 de febrero del 2019
 */

import java.util.*;

public class Proyecto3{

  public void imprimeArreglo(int[] A){
    Arrays.sort(A);

      for (int arreglo = 0; arreglo < A.length; arreglo++)
        System.out.print(A[arreglo] + ", ");

  }//fin imprimeArreglo

  public int busquedaSecuencial(int[] A, int k){

    for (int i = 0; i < A.length; i++) {

      if (A[i] == k) {
        return i;
      }//fin IF

    }//fin FOR
    return -1;
  }

  public int busquedaBinaria(int A[], int primero, int mitad,int ultimo, int k){

    //int mitad = (primero + ultimo)/2;

    while (primero <= ultimo) {
      if (A[mitad] < k) {
        primero = mitad + 1;
      }//fin primer IF

      else if (A[mitad] == k) {
        System.out.println("\nEl valor "+k+" fue encontrado en la posicion: "+(mitad + 1));

        System.exit(0);
      }//fin segundo IF
      else{
        ultimo = mitad - 1;
      }//fin ELSE

      mitad = (primero + ultimo)/2;
    }//fin WHILE
    if (primero > ultimo) {
      System.out.println("\nEl valor "+k+" no fue encontrado");
    }
    return 2;//este valor es 2 para que no afecte el resultado de la consola
  }

  public static void main(String[] args) {
    Proyecto3 p1 = new Proyecto3();
    Proyecto3 p2 = new Proyecto3();
    Proyecto3 p3 = new Proyecto3();

    int[] A = {1,5,3,6,75,23,74,124,65,23,53,12,56,8,3,0,2};

    p1.imprimeArreglo(A);

    int k = 65;
    int primero = 0;
    int ultimo = A.length - 1;

    int mitad = (primero + ultimo)/2;
    //int encontrado = p2.busquedaSecuencial(A, k);
    int encontrado2 = p3.busquedaBinaria(A, primero, mitad, ultimo, k);

    /*
    if (encontrado != -1) {
      System.out.println("\nEl valor "+k+" fue encontrado en la posicion: "+(encontrado+1));
    }else
    System.out.println("\nEl valor "+k+" no fue encontrado");
    */
  }
}
