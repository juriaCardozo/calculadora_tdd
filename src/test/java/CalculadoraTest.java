import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {
    @Test
    void deveSomarDoisNumeros() {
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(2, 3);
        assertEquals(5, resultado);
    }
}
