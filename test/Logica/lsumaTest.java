/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 19
 */
public class lsumaTest {
    
    public lsumaTest() {
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
     * Test of Sumar method, of class lsuma.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        int valor1 = 4;
        int valor2 = 5;
        lsuma instance = new lsuma();
        int expResult = 9;
        int result = instance.Sumar(valor1, valor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //pruebas unitarias para las clases
    }
    
    @Test
    public void testRestar() {
        System.out.println("Restar");
        int valor1 = 5;
        int valor2 = 4;
        lsuma instance = new lsuma();
        int expResult = 1;
        int result = instance.Restar(valor1, valor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //pruebas unitarias para las clases
    }
    
}
