import java.util.*;

public class ProyectoRecursion{

  public String limpiaString(String s){
    return s;
  }

  /*
  public int cuentaSubString(String s, String sub){

  }

  public int sumaDigitos(int n){

  }

  public boolean anidacionCorrecta(String s){

  }

  */
  public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    Scanner lecturaS = new Scanner(System.in);
    int opcion;

    String resultado;

    int results;

    ProyectoRecursion obj = new ProyectoRecursion();

    System.out.println("\nBienvenido al sistema");

    System.out.println("Que operación le gustaría realizar: \n1)Limpiar un String \n2)Contar un substring \n3)Sumar digitos \n4)Verificar una anidación");
    opcion = lectura.nextInt();

    switch (opcion) {

      case 1:
        System.out.println("\nInserta el String: ");
        String s = lecturaS.nextLine();


        //System.out.println(sucio);
        resultado = obj.limpiaString(s);
    }//fin switch
  }
}
