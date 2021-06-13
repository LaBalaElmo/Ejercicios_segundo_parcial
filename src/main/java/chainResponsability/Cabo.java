package chainResponsability;

public class Cabo implements IEjercito {
    private  IEjercito next;

    @Override
    public void setNext(IEjercito handler) {
        this.next=handler;
    }

    @Override
    public IEjercito next() {
        return this.next;
    }

    @Override
    public void darOrden(String orden) {
          if (orden.toLowerCase().equals("limpieza")){
              System.out.println("INFO> El cabo se encarga de esta orden");
          } else {
              System.out.println("Esta tarea no esta delegada a nadie");
          }
    }
}
