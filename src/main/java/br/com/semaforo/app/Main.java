package br.com.semaforo.app;

import br.com.semaforo.context.Semaforo;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Semaforo semaforo = new Semaforo();

        while (true) {
            System.out.println("Estado atual: " + semaforo.getEstado());

            // Tempo diferente para cada estado (simulação realista)
            switch (semaforo.getEstado()) {
                case "VERDE":
                    Thread.sleep(3000); // 3 segundos
                    break;
                case "AMARELO":
                    Thread.sleep(1000); // 1 segundo
                    break;
                case "VERMELHO":
                    Thread.sleep(2000); // 2 segundos
                    break;
            }

            semaforo.proximo();
        }
    }
}