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
public class Recargo extends Movimiento {

    public Recargo(String concept, float importe) {
        super(concept, importe);
        this.tipo = "recargo";
    }
    @Override
    public String toString(){
        return "\nRECARGO "+super.toString();
    }
}
