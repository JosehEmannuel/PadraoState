package br.com.semaforo.context;

import br.com.semaforo.state.SemaforoState;
import br.com.semaforo.state.VerdeState;

public class Semaforo {

    private SemaforoState estado;

    public Semaforo() {
        this.estado = new VerdeState();
    }

    public void proximo() {
        estado.proximo(this);
    }

    public String getEstado() {
        return estado.getNome();
    }

    public void setEstado(SemaforoState estado) {
        this.estado = estado;
    }
}
