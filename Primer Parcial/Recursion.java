public class Recursion {

 public int[] A = {1, 9, 3, 4, 5};

 public double factRec(double n) { //operación recursiva para calcular el factorial de un números

  if (n == 0) {
   return 1;
  } else {
   return n * factRec(n - 1);
  }
 }

 public int multRec(int a, int b) { //operación recursiva para calcular la multiplicación de un número

  if (a == 0) {
   return 0;
  } else {
   return b + multRec(a - 1, b);
  }

 }

 public int pot(int a, int b) { //ecuación recursiva para calcular la pot de un número
  if (b == 0) {
   return 1;
  } else {
   //return a * pot(a, b-1);  //ejemplo usando la misma sección
   return multRec(a, pot(a, b - 1)); //ejemplo usando la operacion de multRec y pot
  }
 }

 public int max(int a, int b) {
  if (a > b) {
   return a;
  } else {
   return b;
  }
 }

 public int maximo(int n, int pos) {
  if (pos == n - 1) {
   return A[pos];
  } else {
   return max(A[pos], maximo(n, pos + 1));
  }
 }

 public int vowels(String s) {

  if (s.length() == 0) {
   return 0;
  } else if (s.charAt(0) == 'i') {
   return 1 + vowels(s.substring(1));
  } else if (s.charAt(0) == 'o') {
   return 1 + vowels(s.substring(1));
  } else if (s.charAt(0) == 'u') {
   return 1 + vowels(s.substring(1));
  } else if (s.charAt(0) == 'e') {
   return 1 + vowels(s.substring(1));
  } else if (s.charAt(0) == 'a') {
   return 1 + vowels(s.substring(1));
  } else {
   return 0 + vowels(s.substring(1));
  }
 }

 public int fibonacci(int n) {//modo recursivo

   if (n <= 1) {
     return n;
   }
   else
   return fibonacci(n-1) + fibonacci(n-2);

 }

 public int fibArreglo(int n){ //modo iterativo

   int[] F = new int[n+1];
   F[0] = 0;
   F[1] = 1;

   for (int i = 2; i<=n; i++)
     F[i] = F[i-1] + F[i-2];

     return F[n];

 }

 public static void main(String[] args) {
  int res = 0;
  String s;
  Recursion miObjeto = new Recursion();

  res = miObjeto.fibArreglo(50);
  System.out.println(res);

  /*
  System.out.print("\nEl resultado es: ");
  System.out.print(res + " vocales\n");
    */
 }
}
