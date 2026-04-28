package br.com.semaforo.state;

import br.com.semaforo.context.Semaforo;

public class VerdeState implements SemaforoState {

    @Override
    public void proximo(Semaforo semaforo) {
        semaforo.setEstado(new AmareloState());
    }

    @Override
    public String getNome() {
        return "VERDE";
    }
}
