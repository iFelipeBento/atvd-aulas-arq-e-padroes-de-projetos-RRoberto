package Adapter;

//Classe adaptador (Adapter)
class AdaptadorNitendoParaAtari extends SensorNitendo {

  private SensorAtari adaptee;

  public AdaptadorNitendoParaAtari(SensorAtari adaptee) {
      this.adaptee = adaptee;
  }

  //Override da solicita��o
  public void conectarNitendo() {
      adaptee.conectarAtari();
      System.out.println("But stadia wins!");
  }
}