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
public class Cuenta {

    private String nombre;
    private String cuenta;
    private float saldo = 0;
    private float tipoInteres;
    private ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
    private boolean isBloqued = false;

    /**
     * Si se ha podido realizar el ingreso, retorna true
     *
     * @param importe
     * @return
     */
    private boolean Ingreso(float importe) {
        if (importe < 0 ) {
            return false;
        }

        saldo += importe;

        return true;
    }

    /**
     * retorna true cuando el recargo ha sido exsitoso
     *
     * @todo
     * @param importe
     * @return
     */
    private boolean Recargo(float importe) {
        if (importe < 0) {
            return false;
        }
        if (importe > saldo) {
            return false;
        }
        saldo -= importe;

        return true;
    }

    public boolean doMovement(Movimiento mov) {
        /*decida que hay que hacer */
        if(isBloqued){
            return false;
        }
        if (mov.getTipo().equals("recargo")) {
            if (this.Recargo(mov.getImporte())) {
                this.registerMovement(mov);
                return true;
            }
        }

        if (mov.getTipo().equals("ingreso")) {
            if (this.Ingreso(mov.getImporte())) {
                this.registerMovement(mov);
                return true;
            }
        }

        if (mov.getTipo().equals("transferencia")) {
            if (this.Transferencia(mov.getDestino(), mov.getImporte())) {
                this.registerMovement(mov);
                return true;
            }

        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(float tipoInteres) {
        if (tipoInteres > 100
                || tipoInteres < 0) {
            return;
        }
        this.tipoInteres = tipoInteres;
    }

    private boolean Transferencia(Cuenta cuentaReceptora, float importe) {

        if (this.Recargo(importe)) {
            if (cuentaReceptora.Ingreso(importe)) {
                return true;
            }
            this.saldo += importe;
        }

        return false;
    }

    @Override
    public String toString() {
        String result = "\n- Cuenta: " + this.cuenta + ", Cliente: " + this.nombre + ", Saldo: " + this.saldo;
        result += "\n MOVIMIENTOS: \n" + this.movimientos.toString();
        return result;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return this.movimientos;
    }

    private void registerMovement(Movimiento mov) {
        if (mov.getTipo().equals("transferencia")) {
            Ingreso ingre = new Ingreso(mov.getConcepto(), mov.getImporte());
            mov.getDestino().movimientos.add(ingre);
        }

        this.movimientos.add(mov);
    }
}
