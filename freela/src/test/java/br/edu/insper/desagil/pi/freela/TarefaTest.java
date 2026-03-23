package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TarefaTest {
    private Tarefa t;

    @BeforeEach
    void setUp() {
        t = new Tarefa(0);
    }
    @Test
    void constroi() {
        assertEquals(0, t.getId());
        assertEquals("", t.getDescricao());
        assertNull(t.getInicio());
        assertNull(t.getFim());
    }

    @Test
    void mudaDescricao() {
        t.setDescricao("oi");
        assertEquals("oi", t.getDescricao());
    }
    @Test
    void momentosValidos() {
        Data i = new Data();
        Data f = new Data();
        i.atualiza(2000, 10, 10);
        f.atualiza(2010, 10, 10);
        t.atualiza(i, f);
        assertEquals(i, t.getInicio());
        assertEquals(f, t.getFim());
    }
    @Test
    void momentosInvalidos() {
        Data i = new Data();
        Data f = new Data();
        f.atualiza(2000, 10, 10);
        i.atualiza(2010, 10, 10);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            t.atualiza(i, f);
        });
        assertEquals("O início deve ser antes do fim!", e.getMessage());

    }

}
