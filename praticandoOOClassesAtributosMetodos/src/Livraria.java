public class Livraria {
    public String nome;
    public int diasAtraso;

    public Livraria() {
    }

    public Livraria(String nome, int diasAtraso) {
        this.nome = nome;
        this.diasAtraso = diasAtraso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public void exibirDetalhes(){
        double multa = diasAtraso * 2.5;
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n", this.nome, this.diasAtraso, multa);
    }
}
