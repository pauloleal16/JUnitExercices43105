import org.example.NumeroEx6;
import org.example.Retangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroEx6Teste {

    NumeroEx6 numero;
    @BeforeEach
    public void setUp() {
        numero = new NumeroEx6();
    }

    @Test
    public void testeMedia(){
        //int teste = numero.mediaNumeros(12345);
        //assertEquals(3, teste, "(1+2+3+4+5)/5 = 3)");
        assertEquals(4,numero.mediaNumeros(12345),"(1+2+3+4+5)/5 = 3)");
    }
}
