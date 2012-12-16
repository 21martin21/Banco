/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Mafs
 */
public class Banco {

    /**
     * Esta clase se encarga de gestionar la entrada y salida del sistema
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta martin = Actions.create("2321321321", "Martin", 1);
        
        Ingreso ing = new Ingreso("paga navidad", 700);
        martin.doMovement(ing);
        
        
        Cuenta andrea = Actions.create("23213", "Andrea", 1);
        
        
        Cuenta jesus = Actions.create("232132", "Jesus", 1);
        
        
        
        martin.doMovement(new Transferencia(andrea, "Toma dinero", 300));
        Actions.borrar(jesus);
        
        
        System.out.println(Actions.getAll());
    }
}
