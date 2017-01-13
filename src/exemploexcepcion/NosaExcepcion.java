
package exemploexcepcion;

/**
 *
 * @author Brais Núñez
 */
public class NosaExcepcion extends Exception {

    public NosaExcepcion() {
        super(" informamoslle da nosa excepción ");
    }
    public NosaExcepcion(String s){
        super(s);
   }
}
