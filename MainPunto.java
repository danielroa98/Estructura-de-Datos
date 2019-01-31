import java.util.*;

public class MainPunto{
  public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);


    float coordenadaX, coordenadaY;

    coordenadaX = 169827;
    coordenadaY = 193721;

    Punto p0 = new Punto(coordenadaX, coordenadaY);

    p0.imprimeCoordenadas();

    System.out.println("Desea cambiar el punto?");
    String opc = lectura.nextLine();

    if (opc.equalsIgnoreCase("si")) {

      System.out.println("Inserta el valor x: ");
      coordenadaX = lectura.nextFloat();

      System.out.println("Inserta el valor de y: ");
      coordenadaY = lectura.nextFloat();

      Punto p1 = new Punto(coordenadaX, coordenadaY);

      p1.imprimeCoordenadas();
    }else

    System.out.println("FIN");

  }

}
