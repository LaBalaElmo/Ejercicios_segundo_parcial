package singleton;

public class EncargadoPrestamos implements IBanco {
    private  IBanco next;

    @Override
    public void setNext(IBanco handler) {
        this.next=handler;
    }

    @Override
    public IBanco next() {
        return this.next;
    }

    @Override
    public void pagar(int monto) {
          if (monto == 100 ){
              System.out.println("INFO> Pago de la deuda completada al encargado de prestamos");
              System.out.println("INFO> Devolviendo documentos");
          }else {
        	  System.out.println("INFO> Pago completado, no necesita pagar mas");
          }
    }
}
