import org.example.Calculadora;
import org.example.Retangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetanguloTest {

    Retangulo retangulo;
    @BeforeEach
    public void setUp() {
        retangulo = new Retangulo();
    }


    @Test
    public void area(){
        int resultado = retangulo.area(3,5);
        assertEquals(15, resultado, "3*5 = 15");
        resultado = retangulo.area(5,8);
        //assertEquals(50, resultado, "5*8 = 40");
        assertEquals(40, resultado, "5*8 = 40");
        resultado = retangulo.area(2,4);
        assertEquals(8, resultado, "2*4 = 8");
    }
    public void perimeter(){
        int resultado = retangulo.perimeter(3,5);
        assertEquals(16, resultado, "3+3+5+5 = 16");
        resultado = retangulo.perimeter(5,8);
        assertEquals(26, resultado, "5+5+8+8 = 26");
        resultado = retangulo.perimeter(2,4);
        //assertEquals(15, resultado, "2+2+4+4 = 12");
        assertEquals(12, resultado, "2+2+4+4 = 12");
    }

}
