package br.com.semaforo.state;

import br.com.semaforo.context.Semaforo;

public class AmareloState implements SemaforoState {

    @Override
    public void proximo(Semaforo semaforo) {
        semaforo.setEstado(new VermelhoState());
    }

    @Override
    public String getNome() {
        return "AMARELO";
    }
}
