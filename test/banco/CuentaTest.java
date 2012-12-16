/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mafs
 */
public class CuentaTest {
    
    public CuentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of doMovement method, of class Cuenta.
     */
    @Test
    public void testDoMovement() {
        System.out.println("doMovement");
        Movimiento mov = null;
        Cuenta instance = new Cuenta();
        boolean expResult = false;
        boolean result = instance.doMovement(mov);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Cuenta.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cuenta instance = new Cuenta();
        instance.setNombre("Martin");
        String expResult = "Martin";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Cuenta.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cuenta instance = new Cuenta();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuenta method, of class Cuenta.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("getCuenta");
        Cuenta instance = new Cuenta();
        String expResult = "";
        String result = instance.getCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCuenta method, of class Cuenta.
     */
    @Test
    public void testSetCuenta() {
        System.out.println("setCuenta");
        String cuenta = "";
        Cuenta instance = new Cuenta();
        instance.setCuenta(cuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class Cuenta.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Cuenta instance = new Cuenta();
        float expResult = 0.0F;
        float result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoInteres method, of class Cuenta.
     */
    @Test
    public void testGetTipoInteres() {
        System.out.println("getTipoInteres");
        Cuenta instance = new Cuenta();
        float expResult = 0.0F;
        float result = instance.getTipoInteres();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoInteres method, of class Cuenta.
     */
    @Test
    public void testSetTipoInteres() {
        System.out.println("setTipoInteres");
        float tipoInteres = 0.0F;
        Cuenta instance = new Cuenta();
        instance.setTipoInteres(tipoInteres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Cuenta.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cuenta instance = new Cuenta();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovimientos method, of class Cuenta.
     */
    @Test
    public void testGetMovimientos() {
        System.out.println("getMovimientos");
        Cuenta instance = new Cuenta();
        ArrayList expResult = null;
        ArrayList result = instance.getMovimientos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
