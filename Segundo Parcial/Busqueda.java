/*
 * Busqueda Secuencial/Binaria
 * Daniel Roa
 * A01021960
 */
 
import java.util.Random;
import java.util.Arrays;

public class Busqueda {
 public int[] randomArray(int numElem) {
  
  int[] arr = new int[numElem];
  Random r = new Random();
  
  for (int i = 0; i < numElem; i++) {
   arr[i] = (r.nextInt(100) + 1);
  }
  
  Arrays.sort(arr);
  return arr;
 }
 public int secuential(int[] array, int k) {
  long start = System.nanoTime();
  for (int cont = 0; cont < array.length; cont++) {
   if (array[cont] == k) {
    long end = System.nanoTime();
    long duration = end - start;
    System.out.println("\nthe search took: " + duration + " nanoseconds");
    return cont;
   }
  }
  return -1;
 }
 public int improvedSearch(int[] array, int k) {
  int val0 = 0;
  int cont = 0;
  int valF = array.length + 1;
  int valR;

  System.out.println("Searching for value: "+k);
  
  while (val0 <= valF) {

   cont = (val0 + valF) / 2;
   
   if (array[cont] > k) {
    return cont;
   } //end IF 1
   else if (k <= array[cont]) {
    valF = cont - 1;
   } //end IF 2
   else
    valR = cont + 1;
  } //end WHILE

  return 0;
 } //fin MEJORADO

 public void print(int[] arr) {
  for (int a: arr)
   System.out.print(a + " ");
 }

 public static void main(String[] args) {
  Busqueda b = new Busqueda();
  
  int[] arr = b.randomArray(50);
  
  b.print(arr);
  
  int k = 34;
  
  int foundIn = b.improvedSearch(arr, 40);
  
  //System.out.println("Searching for value: " +k);
                     
  if (foundIn != 0)
   System.out.println("\nthe element was found at position " + (foundIn+1));
  else
   System.out.println("not found");
 }
}