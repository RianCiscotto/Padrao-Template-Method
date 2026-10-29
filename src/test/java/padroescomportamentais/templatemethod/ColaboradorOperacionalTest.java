package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColaboradorOperacionalTest {
    @Test
    void deveSerSatisfatorio() {
        Colaborador c = new ColaboradorOperacional();
        c.setAvaliacao1(6);
        c.setAvaliacao2(8);
        assertEquals("Satisfatório", c.verificarDesempenho());
    }

    @Test
    void deveSerInsatisfatorio() {
        Colaborador c = new ColaboradorOperacional();
        c.setAvaliacao1(4);
        c.setAvaliacao2(5);
        assertEquals("Insatisfatório", c.verificarDesempenho());
    }
}
