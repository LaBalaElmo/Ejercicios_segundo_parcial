package chainResponsability;

public class Teniente implements IEjercito {
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
          if (orden.toLowerCase().equals("disciplina")){
              System.out.println("INFO> El Teniente se encarga de esta orden");
          } else {
              this.next.darOrden(orden);
          }
    }
}
