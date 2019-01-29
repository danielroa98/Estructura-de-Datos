public class Ejemplo{
  public int suma(int a, int b){
    return a+b;
  }

  public static void main(String[] args) {
    float res = 0;
    Ejemplo miEjemplo = new Ejemplo();

    res = miEjemplo.suma(5,4);
    System.out.print(res);
  }
}
