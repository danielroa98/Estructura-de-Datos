import java.util.*;

public class Busqueda{

  public int[] arregloAleatorio(int numElem){
    int[] arr = new int[numElem];
    Random rand = new Random();

    for (int i = 0; i < numElem; i++) {
      arr[i] = (rand.nextInt(100) + 1);
    }

    System.out.println(arr[3]);
    return arr;

  }

  public int secuencial(int[] arreglo, int k){

    int cont = 0;

    for (int a : arreglo) {
      if (a == k)
          return cont;
        cont++;

    }
    return -1;

  }

  public int mejorado(int[] arreglo, int k){
    return 0;
  }

  public void print(int[] arr){
    for (int a : arr) {
      System.out.print(a+" ");
    }
  }

  public static void main(String[] args) {

    Busqueda b = new Busqueda();
    int[] arr = b.arregloAleatorio(50);
    b.print(arr);
    int encontrado = b.secuencial(arr, 40);
    if(encontrado != -1)
      System.out.println("Encontrado en "+encontrado);
    else
      System.out.println("No encontrado");

  }
}
