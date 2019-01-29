public class Recursion{
  public double factRec(double n){

    if (n == 0){
      return 1;
    }
    else {
      return n * factRec(n-1);
    }
  }

  public int multRec(int a, int b){

    if (a == 0) {
      return 0;
    }
    else{
      return b + multRec(a-1, b);
    }

  }

public int potRec(int x, int n){
  if (n == 0) {
    return 1;
  }

  else{
    return x;
  }
}

  public static void main(String[] args) {
    int res = 0;

    Recursion miObjeto = new Recursion();

    res = miObjeto.multRec(10, 5);

    System.out.print("\nEl resultado es: ");
    System.out.print(res+"\n");
  }
}
