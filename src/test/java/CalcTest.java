/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.mavenproject1.Calc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author crist
 */
public class CalcTest {
    
    public CalcTest() {
    }
    
    @Test
    public void sumaTest(){
        Calc calculator = new Calc(8,4);
        assertEquals(12, calculator.suma());
    }
    @Test
    public void restaTest(){
        Calc calculator = new Calc(6,4);
        assertEquals(2, calculator.resta());
    }
    @Test
    public void multiplicacionTest(){
        Calc calculator = new Calc(5,4);
        assertEquals(20, calculator.multiplicacion());
    }
    @Test
    public void divisionTest(){
        Calc calculator = new Calc(6,2);
        assertEquals(3, calculator.division());
    }
}
