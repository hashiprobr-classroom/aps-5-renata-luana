package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa> tarefas;

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public Lista() {
        this.tarefas = new ArrayList<>();
    }

    public void adiciona(Tarefa tarefa){
        boolean jaesta = false;
        for (Tarefa t : tarefas){
            if (tarefa.getId() == t.getId()){
                jaesta = true;
            }
        }
        if (!jaesta){
            tarefas.add(tarefa);
        }
    }
}
