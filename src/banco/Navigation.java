package banco;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafs
 */
public class Navigation {
    
    Scanner teclado = new Scanner(System.in);
    private static Cuenta seleccionada;
    
    public boolean mainMenu(){
        String[] opciones = {"Crear", "Listar", "Seleccionar", "Buscar", "Salir"};
        int opcion = this.presentar(opciones);
        
        if (opcion == 0){
            //tiene que 
            
            System.out.println("Ponga el nombre del cliente: ");
            String nombre = teclado.next();
            System.out.println("Ponga el tipo de interes: ");
            int interes = teclado.nextInt();
            Cuenta nueva = Actions.create(Actions.getAll().size()+1+"", nombre, interes);
        }
        
        if (opcion == 1){
            //tiene que 
            System.out.println(Actions.getAll());
        }
        
        if (opcion == 2){
            System.out.println("Introduzca la cuenta a buscar: ");
            String cuenta = teclado.next();
            
            System.out.println("Seleccione una cuenta: ");
            ArrayList<Cuenta> cuentas = Actions.search(cuenta);
            String[] cuentaStr = new String[cuentas.size()];
            int pos = 0;
            for(Cuenta cuentaActual : cuentas){
                cuentaStr[pos++] = cuentaActual.getCuenta() + " --> "+cuentaActual.getNombre();
            }
            
            seleccionada = cuentas.get(this.presentar(cuentaStr));
            
            do{
                
            }while(this.subMenu());
            
        }
        
        if (opcion == 3){
            System.out.println("Introduzca la cuenta a buscar: ");
            String cuenta = teclado.next();
            Actions.search(cuenta);
            System.out.println(Actions.search(cuenta));
        }
        
        return opcion != opciones.length;
    }
    
    public boolean subMenu(){
        String[] opciones = {"Ver Detalles ", "Ingresar", "Retirar dinero", "Transferir", "Borrar Cuenta", "Atrás"};
        int opcion = this.presentar(opciones);
        
        if(opcion == 0){
            System.out.print(seleccionada);
        }
        
        return opcion != opciones.length;
    }
    
    
    private int presentar(String[] opciones){
        System.out.println("Elija una opción");
        int seleccionado;
        for (int i=0;i < opciones.length;i++)
            System.out.println(i+1+". "+opciones[i]);
        
        
        /*esperar numero*/
        do{
           seleccionado = teclado.nextInt();
               
        }while(1 > seleccionado  || opciones.length < seleccionado);
        
        return seleccionado-1;
    }
    
}
