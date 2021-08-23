
package ie.com.pr.mundopc;

public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorTeclados;
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton +", "+super.toString()+ '}';
    }
    
    
}
