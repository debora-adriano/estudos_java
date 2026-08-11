public class Item {
    public String nome;
    public int quantidade;

    public Item() {
    }

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void vender(int quantidadeVendida){
        quantidade -= quantidadeVendida;
        if (quantidade <= 0)
            System.out.println("Estoque insuficiente.");
        else
            System.out.println("Venda realizada. Estoque restante de " + this.nome + ": " + quantidade);
    }
}
