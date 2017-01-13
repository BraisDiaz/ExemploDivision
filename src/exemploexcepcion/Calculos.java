
package exemploexcepcion;

/**
 *
 * @author Brais Núñez
 */
public class Calculos {
    
    public void dividir(int num, int denom){
        System.out.println("Solución = " + num/denom);
        System.out.println("Despois da excepción");
    }
    
    public void dividirConTryCatch (int num, int denom){
        try{
            System.out.println(num/4.6);
            System.out.println("Despois da excepción");
        }
        catch(ArithmeticException ex){
            System.out.println(" erro1 " + ex.toString());
        }
        catch(Exception e){
            System.out.println(" erro2 " + e.getMessage());
        }
        finally{
            System.out.println("Este bloque execútase sempre");
        }
    }
    
    public void dividirLanzarExcep (int nume, int denomin)throws ArithmeticException{
        if (denomin == 0){
            throw new ArithmeticException(" Non dividas entre 0");
        }
        else
        System.out.println("Solución :" + nume/denomin);
    }
    public void dividirNosaExcepcion (int num, int denom)throws NosaExcepcion{
        if (denom == 0){
            throw new NosaExcepcion ();
        }
        else
        System.out.println("Solución :" + num/denom);
    }
    
    public void dividirIntervaloExcepcion (int num, int denom)throws IntervaloExcepcion{
        
        if (denom == 0){
            throw new ArithmeticException(" Non dividas entre 0");
        }
        
        if ((num<60||num>200)||(denom<60||denom>200)){
            throw new IntervaloExcepcion();
        }
        else
            System.out.println("Solución :" + num/denom);
    }    
}

