package banco;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafs
 */
public class Transferencia extends Movimiento{
    
    private Cuenta destino;
    
    public Transferencia(Cuenta destino, String concept, float importe){
        super(concept, importe);
        this.tipo = "transferencia";
        this.destino = destino;
        
    }

    public Cuenta getDestino() {
        return destino;
    }
    
    @Override
    public String toString(){
        //if ()
        return "\nRECARGO "+super.toString();
    }
    
}
