public class Main {
    public static void main(String[] args) {
        //Declarando valores a variáveis
        String nome = "Maria";
        int idadeAluno = 25;
        double altura = 1.68;
        boolean estudante = true;

        System.out.println("Nome: " + nome + "\n" + "Idade: " + idadeAluno);
        //System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("É estudante: " + estudante);

        //Conversão de tipos
        double valorDouble = 19.5;
        int valorInt = (int) valorDouble;
        System.out.println("O valor inteiro do produto é: " + valorInt);

        //Primitivos em ação
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;
        double media = (nota1 + nota2 + nota3) /3;

        System.out.println("A média das notas é: " + media);

        //Conversão de temperatura
        int celsius = 20;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        //Cadastro de livros
        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int numeroPaginas = 96;
        double precoLivro = 39.9;
        char categoria = 'F';

        String categoriaDescricao;
        if (categoria == 'F')
            categoriaDescricao = "Ficção";
        else if (categoria == 'N')
            categoriaDescricao = "Não-ficção";
        else if (categoria == 'T')
            categoriaDescricao = "Tecnologia";
        else if (categoria == 'H')
            categoriaDescricao = "História";
        else categoriaDescricao = "Categoria inválida";

        System.out.println("Livro cadastrado: " + titulo + ", de " + autor +
            ". Ele possui " + numeroPaginas + " páginas, custa R$" + precoLivro +
                " e pertence à categoria " + categoriaDescricao + ".");

        //Classificação por categoria
        double preco = 150.00;
        String classificacao;

        if (preco <= 50)
            classificacao = "Econômico";
        else if (preco >= 50.01 && preco <= 200)
            classificacao = "Intermediário";
        else
            classificacao = "Premium";

        System.out.println("Categoria do produto: " + classificacao);

        //par ou impar
        int numero = 7;

        if (numero % 2 == 0)
            System.out.println("O número é par.");
        else
            System.out.println("O número é ímpar.");

        //Conversor de moedas
        double valorReais = 451.5;
        double taxaCambio = 5.25;
        double valorDolar = valorReais / taxaCambio;

        System.out.println("O valor em dólares é: US$ " + valorDolar);

        //Verificação de idade e escopo de variáveis
        int idade = 17;
        String mensagem;

        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);

        //Planejando uma viagem: consumo e autonomia
        double consumoMedio = 12.5;
        double totalTanque = 50;
        double quantidade = 20;
        double distancia = 200;
        double autonomiaMaxima = consumoMedio * totalTanque;
        double autonomiaAtual = consumoMedio * quantidade;

        System.out.println("Autonomia máxima do veículo: " + autonomiaMaxima + " km");
        System.out.println("Autonomia atual: " + autonomiaAtual + " km");

        if (autonomiaAtual >= distancia)
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        else
            System.out.println("Atenção! Você precisará abastecer antes de concluir a viagem.");
    }
}