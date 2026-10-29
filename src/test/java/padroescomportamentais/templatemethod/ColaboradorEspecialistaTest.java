package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColaboradorEspecialistaTest {
    @Test
    void deveSerSatisfatorio() {
        Colaborador c = new ColaboradorEspecialista();
        c.setAvaliacao1(7);
        c.setAvaliacao2(9);
        assertEquals("Satisfatório", c.verificarDesempenho());
    }

    @Test
    void deveSerInsatisfatorio() {
        Colaborador c = new ColaboradorEspecialista();
        c.setAvaliacao1(5);
        c.setAvaliacao2(6);
        assertEquals("Insatisfatório", c.verificarDesempenho());
    }
}
