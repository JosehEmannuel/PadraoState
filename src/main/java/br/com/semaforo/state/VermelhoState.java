package br.com.semaforo.state;

import br.com.semaforo.context.Semaforo;

public class VermelhoState implements SemaforoState {

    @Override
    public void proximo(Semaforo semaforo) {
        semaforo.setEstado(new VerdeState());
    }

    @Override
    public String getNome() {
        return "VERMELHO";
    }
}
