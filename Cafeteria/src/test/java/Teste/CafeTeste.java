/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teste;

import cafeteria.aplication.Cafeteria;
import cafeteria.util.FabricaReceitas;
import cafeteria.util.cafes.FabricaCafe;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author IzabelyFurtado
 */
public class CafeTeste {
    
    public CafeTeste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Test
    public void escolhaCafeExpresso(){
        int val1 = 1;
        String resultado = FabricaReceitas.receitaCafeExpresso();
        assertEquals(resultado, Cafeteria.escolhaCafe(val1));
    }
    
    @Test
    public void escolhaCafeSemCafeina(){
        int val1 = 2;
        String resultado = FabricaReceitas.receitaCafeSemCafeina();
        assertEquals(resultado, Cafeteria.escolhaCafe(val1));
    }
    
    @Test
    public void escolhaCafeCappuccino(){
        int val1 = 3;
        String resultado = FabricaReceitas.receitaCafeCappuccino();
        assertEquals(resultado, Cafeteria.escolhaCafe(val1));
    }
    
    @Test
    public void escolhaCafeErrado(){
        int val1 = 13;
        String resultado = "";
        assertEquals(resultado, Cafeteria.escolhaCafe(val1));
    }
    
    @Test
    public void escolhaReceita(){
        int val1 = 1;
        String resultado = "escolhe a Receita";
        assertEquals(resultado, Cafeteria.escolhaOpcoes(val1));
    }
    
    @Test
    public void escolhaSair() {
        int val1 = 2;
        String resultado = " :D Hasta la Vista Baby";
        assertEquals(resultado, Cafeteria.escolhaOpcoes(val1));
    }
    
    @Test
    public void escolhaEscolherErrado() {
        int val1 = 13;
        String resultado = "";
        assertEquals(resultado, Cafeteria.escolhaOpcoes(val1));
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
