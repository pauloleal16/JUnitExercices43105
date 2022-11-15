import org.example.Calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {

    @Test
    public void testSoma() {
        Calculadora calculo = new Calculadora();
        int soma = calculo.add(2,5);
        //int testSoma = 7;
        int testSoma = 6;
        assertEquals(soma, testSoma, "Erro no calculo da soma!");
    }
}
