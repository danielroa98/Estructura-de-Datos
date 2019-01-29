import java.util.*;

public class MainPunto{
  public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);


    float coordenadaX, coordenadaY;

    coordenadaX = 16.9827;
    coordenadaY = 19.3721;

    

    System.out.println("Inserta el valor x: ");
    coordenadaX = lectura.nextFloat();

    System.out.println("Inserta el valor de y: ");
    coordenadaY = lectura.nextFloat();

    Punto p1 = new Punto(coordenadaX, coordenadaY);

    p1.imprimeCoordenadas();

  }

}
