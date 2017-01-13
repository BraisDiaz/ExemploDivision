
package exemploexcepcion;

/**
 *
 * @author Brais Núñez
 */
public class ExemploExcepcion {

    public static void main(String[] args) {
        
        
        Calculos calc1 = new Calculos();
        //calc1.dividir(6, 2);
        //calc1.dividirConTryCatch(4, 2);
        //calc1.dividirLanzarExcep(10, 0);
        
        /*try{
        calc1.dividirNosaExcepcion(6, 0);
        }
        catch(NosaExcepcion e){
            System.out.println(e.toString());
        }
            System.out.println("***********");
        */    
        
        try{
        calc1.dividirIntervaloExcepcion(140,0);
        }
        catch(ArithmeticException e1){
            System.out.println(e1.toString());    
        }
        catch(IntervaloExcepcion e){
            System.out.println(e.toString());
        }
     
    }
}
