/*
 *--------------PARCIAL 1----------------*
 *--------------Recursión----------------*
 *--------------Daniel Roa---------------*
 *--------------A01021960----------------*
 *------------14/Febrero/2019------------*
 */

public class Rectangulo{

  private double cX;
  private double cY;
  private double modifica;

  private double cXM;
  private double cYM;

  Rectangulo(double cX, double cY, double modifica){
    this.cX = cX;
    this.cY = cY;
    this.modifica = modifica;
  }

  Rectangulo(double cXM, double cYM, double cX, double cY, double modifica){
    cXM = cX + modifica;
    cYM = cY + modifica;
  }

  public double getCX(){
    return cX;
  }

  public double getCY(){
    return cY;
  }

  public double modifica(){
    return modifica;
  }


  public double getcXM(){
    return cXM;
  }

  public double getcYM(){
    return cYM;
  }

  public void setCX(double cX){
    this.cX = cX;
  }

  public void setCY(double cY){
    this.cY = cY;
  }

  public void modifica(double modifica){
    this.modifica = modifica;
  }

  public void printCoordenadas(){
    System.out.println("Las coordenadas insertadas son: ("+cX+", "+cY+")");
  }


  public void imprimeCoordenadasMod(){
    System.out.println("Las coordenadas modificadas son: ("+cXM+", "+cYM+")");
  }

}
