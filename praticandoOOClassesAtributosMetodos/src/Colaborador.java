public class Colaborador {
    public String nomeColaborador;
    public String cargo;
    public int nivelAcesso;

    public Colaborador() {
    }

    public Colaborador(String nomeColaborador, String cargo, int nivelAcesso) {
        this.nomeColaborador = nomeColaborador;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        this.nomeColaborador = nomeColaborador;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public void atualizaCadastro(String novoCargo, int novoAcesso){
        System.out.println("--- Antes da atualização ---\nNome: " + this.nomeColaborador + "\nCargo: " + this.cargo + "\nNível de acesso: " + this.nivelAcesso);
        this.cargo = novoCargo;
        this.nivelAcesso = novoAcesso;
        System.out.println("--- Depois da atualização ---\nNome: " + this.nomeColaborador + "\nCargo: " + this.cargo + "\nNível de acesso: " + this.nivelAcesso);
    }
}
