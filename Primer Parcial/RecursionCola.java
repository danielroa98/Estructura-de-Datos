public class RecursionCola{

  public int[] A = {1,9,3,4,5};

  public int fact(int n, int a){

    if (n == 0) {
      return a;
    }
    else
    return fact(n-1, n*a);

  }

  public int sumaTail(int n, int m, int a){

    if (n == 0) {
      return a;
    }
    else
    return sumaTail(n-1, m, m+a);
  }

  public int maxTail(int n, int pos){

    if (pos == n-1) {
      return A[pos];
    } else
      return maxTail(A[pos], maxTail(n, pos+1));
  }
/*
  public int maximoTail(int n, int pos, int m){

    if (pos == n) {
      return m;
    } else
      //return maximoTail(m, A[pos], maxTail(m,A[pos]));
      if (m > A[pos]) {

      } else
        return q;
  }*/

  public static void main(String[] args) {

    int res = 0;

    RecursionCola obj = new RecursionCola();

    //res = obj.fact(6,1);
    res = obj.sumaTail(9, 4, 0);
    //res = obj.maximoTail(5, 0, obj.A[0]);

    System.out.println(res);
  }
}
