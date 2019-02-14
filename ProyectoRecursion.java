/*
 *--------------PROYECTO 2---------------*
 *--------------Recursión----------------*
 *--------------Daniel Roa---------------*
 *------------14/Febrero/2019------------*
 *--------------A01021960----------------*
 */

import java.util.*;

public class ProyectoRecursion{
/*
  public String limpiaString(String s){

    int A = s.length();

    if (A == 0) {
      return s;
    }
      else if()


  }
*/
  public int cuentaSubString(String s, String sub){

    int A = s.length();
    int B = sub.length();

    if (A == 0 ||A < B) {
      return 0;
    }

    else if (s.substring(0, B).equals(sub)) {
      return cuentaSubString(s.substring(B - 1), sub) + 1;
    }
    else
      return cuentaSubString(s.substring(B - 1), sub);

  }//fin cuentaSubString

  public int sumaDigitos(int n){

    int total;

    total = n % 10; //modulo del numero insertado por 10

    if (n <= 0) {
      return n;
    }//fin IF
      else{
        return total + sumaDigitos(n / 10);
      }//fin ELSE

  }//fin sumaDigitos


  public boolean anidacionCorrecta(String s){

    boolean prueba = false;

    boolean fin = true;

    int A = s.length();

    char abierto = '(';
    char cerrado = ')';

    if (s.charAt() != abierto || s.charAt() != cerrado) {
      return prueba;
    }
    else{
      return fin;
    }
  }

  public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    Scanner lecturaS = new Scanner(System.in);
    int opcion;

    String resultado;
    int results;
    boolean res;

    ProyectoRecursion obj = new ProyectoRecursion();

    System.out.println("\nBienvenido al sistema");

    System.out.println("\bInserta el String de Parentesis");
    String par = lecturaS.nextLine();

        //System.out.println("\nInserta el numero: ");
        //int num = lecturaS.nextInt();

        //System.out.println(sucio);
        //results = obj.sumaDigitos(num);

        res = obj.anidacionCorrecta(par);

        System.out.println("\n"+res);

        //System.out.println("\n"+results);

  }
}
