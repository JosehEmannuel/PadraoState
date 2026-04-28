package br.com.semaforo;

import br.com.semaforo.context.Semaforo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SemaforoTest {

    @Test
    void deveIniciarNoVerde() {
        Semaforo semaforo = new Semaforo();
        assertEquals("VERDE", semaforo.getEstado());
    }

    @Test
    void deveTransitarVerdeParaAmarelo() {
        Semaforo semaforo = new Semaforo();
        semaforo.proximo();
        assertEquals("AMARELO", semaforo.getEstado());
    }

    @Test
    void deveTransitarAmareloParaVermelho() {
        Semaforo semaforo = new Semaforo();
        semaforo.proximo();
        semaforo.proximo();
        assertEquals("VERMELHO", semaforo.getEstado());
    }

    @Test
    void deveTransitarVermelhoParaVerde() {
        Semaforo semaforo = new Semaforo();
        semaforo.proximo();
        semaforo.proximo();
        semaforo.proximo();
        assertEquals("VERDE", semaforo.getEstado());
    }
}
