package AdapterPattern;

//Classe adaptada (Adaptee)
class SensorAtari {

  //Solicita��o Especifica
  public void conectarAtari() {
      System.out.println("Um novo controle foi conectado ao sensor do Atari.");
  }
}