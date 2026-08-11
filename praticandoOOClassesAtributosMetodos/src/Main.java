import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Mouse Gamer", 159.9, 25);
        System.out.println("- Relatório do produto:");
        System.out.println(produto1);

        Livro livro1 = new Livro("O Guia do Mochileiro das Galáxias", "Douglas Adams", 208);
        System.out.println("---------------\n- Imprimindo o resumo do livro:");
        System.out.println(livro1);

        Conta conta1 = new Conta(1579.42);
        System.out.println("---------------\n- Zerando o saldo:");
        conta1.exibirSaldo();
        conta1.zerarSaldo();
        conta1.exibirSaldo();

        Estufa estufa1 = new Estufa("Setor A", 39.2);
        System.out.println("---------------\n- Controle de temperatura:");
        estufa1.localSensor();

        Aluno aluno1 = new Aluno("João Silva", 6.5, 7.5);
        System.out.println("---------------\n- Calculando as notas:");
        aluno1.calculaMedia();

        Colaborador colaborador1 = new Colaborador("Júlia Oliveira", "Pessoa Desenvolvedora Júnior", 1);
        System.out.println("---------------\n- Corrigindo o cadastro:");
        colaborador1.atualizaCadastro("Pessoa Desenvolvedora Plena", 2);

        Tarefa tarefa1 = new Tarefa("Estudar Java", false);
        Tarefa tarefa2 = new Tarefa("Fazer exercícios", true);
        System.out.println("---------------\n- Controle de tarefas:");
        List<Tarefa> listaTarefa = new ArrayList<>();
        listaTarefa.add(tarefa1);
        listaTarefa.add(tarefa2);
        for (Tarefa t : listaTarefa){
            t.mostrarTarefas();
        }

        Item item1 = new Item("Camiseta", 10);
        System.out.println("---------------\n- Controle de estoque:");
        item1.vender(3);
        item1.vender(8);

        Livraria livraria1 = new Livraria("Dom Casmurro", 3);
        System.out.println("---------------\n- Multa por atraso:");
        livraria1.exibirDetalhes();

        Carrinho carrinho1 = new Carrinho("Teclado", 120, 1);
        Carrinho carrinho2 = new Carrinho("Mouse", 60, 2);
        System.out.println("---------------\n- Carrinho de compras:");
        List<Carrinho> listaCarrinho = new ArrayList<>();
        listaCarrinho.add(carrinho1);
        listaCarrinho.add(carrinho2);
        double totalCompra = 0;
        for (Carrinho c : listaCarrinho){
            totalCompra += c.comprar();
        }
        System.out.printf("Total da compra: R$ %.2f%n", totalCompra);
    }
}