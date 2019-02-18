/*
 *--------------PROYECTO 2---------------*
 *--------------Recursión----------------*
 *--------------Daniel Roa---------------*
 *------------14/Febrero/2019------------*
 *--------------A01021960----------------*
 */

import java.util.*;

public class Recursion{

  public String limpiaString(String s){

    if (s.length() <= 1) {
      return s;
    }
      else if (s.charAt(0) == s.charAt(1)) {
        return limpiaString(s.substring(1));
      }
      else
        return s.charAt(0)+limpiaString(s.substring(1));

  }

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
        return total + sumaDigitos(n/10);
      }//fin ELSE

  }//fin sumaDigitos


  public boolean anidacionCorrecta(String s){

    int A = s.length();

    char C = '(';
    char D = ')';

    boolean salida = false;

    int mod = A % 2;
    int split = A/2;

    System.out.println("\nmodulo: "+mod);

    if (mod == 1) {
      return salida;
    }
    else if (mod == 2) {
      return true;
      }
    }//fin operacion booleana
}
