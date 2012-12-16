package banco;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafs
 */
public class Actions {
    
    private static ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
    
    static public Cuenta create (String nCuenta, String nombreCliente, float tipoInteres){
        Cuenta nueva = new Cuenta();
        nueva.setNombre(nombreCliente);
        nueva.setTipoInteres(tipoInteres);
        /*buscar que no hay ninguna igual que esta entonces no la crearemos*/
        nueva.setCuenta(nCuenta);
        cuentas.add(nueva);
        return nueva;
    }
    
    static public ArrayList<Cuenta> search (String termino){
        ArrayList<Cuenta> result = new ArrayList<Cuenta>();
        
        for(Cuenta cuentaActual : cuentas){
            if (cuentaActual.getCuenta().toLowerCase().contains(termino.toLowerCase())){
                result.add(cuentaActual);
                continue;
            }
            
            if(cuentaActual.getNombre().toLowerCase().contains(termino.toLowerCase())){
                result.add(cuentaActual);
            }
                    
        }
        
        return result;
        
    }
    
    static public boolean borrar (Cuenta actual){
       return cuentas.remove(actual);
        
    }
    static public ArrayList<Cuenta> getAll(){
        return cuentas;
    }
    
}
