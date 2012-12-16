/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Date;

/**
 *
 * @author Mafs
 */
public class Ingreso extends Movimiento{
    
    public Ingreso(String concept, float importe) {
        super(concept, importe);
        this.tipo = "ingreso";
    }
    
    @Override
    public String toString(){
        return "\n INGRESO "+super.toString();
    }
}
