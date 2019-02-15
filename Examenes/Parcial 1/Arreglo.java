/*
 *--------------PARCIAL 1----------------*
 *--------------Recursión----------------*
 *--------------Daniel Roa---------------*
 *--------------A01021960----------------*
 *------------14/Febrero/2019------------*
 */

public class Arreglo{

  int[] A = {0,1,2,3,4};

  public int longitud(int posicion){

    if (posicion > A.length){
      return posicion;
    }

    else
      return longitud(A[posicion+1]);
  }

  public int longitudCola(int posicion, int acumulador){

    if (posicion == 0) {
      return 0;
    }
    else
      return longitudCola(A[posicion-1], posicion+acumulador);

  }

    public static void main(String[] args) {
      int pos = 3;
      int acum = 0;
      int res = 0;

      Arreglo obj = new Arreglo();

      res = obj.longitudCola(pos, acum);

      System.out.println(res);
    }
}
