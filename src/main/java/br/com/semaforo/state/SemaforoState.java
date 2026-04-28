package br.com.semaforo.state;

import br.com.semaforo.context.Semaforo;

public interface SemaforoState {
    void proximo(Semaforo semaforo);
    String getNome();
}
