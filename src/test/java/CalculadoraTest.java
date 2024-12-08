import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void deveSomarDoisNumeros() {
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void deveSubtrairDoisNumeros() {
        Calculadora calc = new Calculadora();
        int resultado = calc.subtrai(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    void deveMultiplicarDoisNumeros() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplica(3, 4);
        assertEquals(12, resultado);
    }

    @Test
    void deveDividirDoisNumeros() {
        Calculadora calc = new Calculadora();
        double resultado = calc.divide(10, 2);
        assertEquals(5.0, resultado, 0.0001);
    }

    @Test
    void deveLancarExcecaoQuandoDividirPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
