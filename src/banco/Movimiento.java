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
public abstract class Movimiento {

    private String concepto;
    private float importe;
    protected String tipo;
    private Date fecha;
    private Cuenta destino;

    public Movimiento(String concept, float importe) {
        this.setConcepto(concept);
        this.setImporte(importe);
        this.setFecha(new Date());
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        String result = "Concepto: " + this.getConcepto() + ", Importe: " + this.getImporte() + ", Fecha:  " + this.getFecha();
        return result;
    }
    
    public Cuenta getDestino(){
        return this.destino;
    }
}
