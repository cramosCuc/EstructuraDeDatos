/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import edatos.Pila;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cramos
 */
public class PilaTest {
    
    public PilaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testPushEnPilaVacia(){
        Pila<String> pila = new Pila();
        pila.push("Prueba");
        assertEquals("Top NO es igual al nodo creado",pila.getTop(), pila.peek());
        assertEquals("Tamaño inicial NO es 1",pila.getSize(), 1);
        assertEquals("EL link NO es nulo",pila.getTop().getLink(), null);
        
    }
    
    @After
    public void tearDown() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
