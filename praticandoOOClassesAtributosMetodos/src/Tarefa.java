public class Tarefa {
    public String descricao;
    public boolean concluida;

    public Tarefa() {
    }

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void mostrarTarefas(){
        String status;
        if (concluida == false)
            status = "Pendente";
        else status = "Concluída";
        System.out.println("Tarefa: " + this.descricao + " - Status: " + status);
    }
}
