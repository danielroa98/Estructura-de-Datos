/*
 *--------------PROYECTO 1---------------*
 *--------Definición de un ADT-----------*
 *--------------Daniel Roa---------------*
 *--------------A01021960----------------*
 */

class Punto {
    private float coordenadaX;
    private float coordenadaY;

    Punto(float coordenadaX, float coordenadaY){
      this.coordenadaX = coordenadaX;
      this.coordenadaY = coordenadaY;
    } //inicializa las coordenadas del punto (x,y)

    public float obtenerCoordenadaX(){
      return coordenadaX;
    } // regresa la coordenada x del punto

    public float obtenerCoordenadaY(){
      return coordenadaY;
    } // regresa la coordenada y del punto
    public void modificaX(float coordenadaX){
      this.coordenadaX = coordenadaX;
    } // cambia el valor de la coordenada x del punto
    public void modificaY(float coordenadaY){
      this.coordenadaY = coordenadaY;
    } // cambia el valor de la coordenada y del punto

    public void imprimeCoordenadas(){

      System.out.println("Las coordenadas son ("+coordenadaX+", "+coordenadaY+")");

    } // imprime las coordenadas del punto
} // sin ; final si es Java
