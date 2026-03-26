import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "João";
        double salario = 2890.0;
        int numeroDependentes = 2;
        boolean isento = true;

        if (salario > 2259.20 && !isento){   //
            double irrf = salario / 100 * 7.5;
            System.out.println("Valor de IRRF: " + irrf);
        } else if (isento) {   //  isento == true
            System.out.println("Contribuinte isento de IRRF.");
        } else {
            System.out.println("Não há valores de IRRF.");
        }

        // Verificando se um número é par ou ímpar

        int numero = 7;
        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é ímpar");
        }

        // Verificando aprovação em uma disciplina

        double media = 5.0;
        if (media >= 7.0){
            System.out.println("O estudante teve média " + media + " e foi aprovado.");
        } else if (media >= 5.0){
            System.out.println("O estudante teve média " + media + " e está de recuperação.");
        } else {
            System.out.println("O estudante teve média " + media + " e foi reprovado.");
        }

        // Validação de senha

        String senhaCorreta = "123456";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        if (senha.equalsIgnoreCase(senhaCorreta)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        // Comparando dois números

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O maior número é " + primeiroNumero + ".");
        } else if (primeiroNumero < segundoNumero) {
            System.out.println("O maior número é " + segundoNumero + ".");
        } else {
            System.out.println("Os números são iguais.");
        }

        // Verificação de desconto em compras

        System.out.println("Digite o valor da compra: ");
        double compra = scanner.nextDouble();

        if (compra >= 100.00) {
            double compraComDesconto = compra - (compra / 10);
            System.out.println("Desconto de 10% aplicado.\nNovo valor: R$ " + compraComDesconto); }
        else { System.out.println("Nenhum desconto aplicado.\nValor total: R$ " + compra); }

        // Verificação de dia útil
        scanner.nextLine();
        System.out.println("Digite o dia da semana: ");
        String diaSemana = scanner.nextLine();

        if (diaSemana.equalsIgnoreCase("sábado") || diaSemana.equalsIgnoreCase("domingo") )
            System.out.println(diaSemana + " não é um dia útil.");
        else if (diaSemana.equalsIgnoreCase("segunda") || diaSemana.equalsIgnoreCase("terça") ||
                diaSemana.equalsIgnoreCase("quarta") || diaSemana.equalsIgnoreCase("quinta") ||
                        diaSemana.equalsIgnoreCase("sexta"))
            System.out.println(diaSemana + " é um dia útil.");
        else
            System.out.println("Dia inválido.");

        // Verificando se um número está em um intervalo

        System.out.println("Digite o valor do empréstimo: ");
        int emprestimo = scanner.nextInt();

        if (emprestimo >= 1000 && emprestimo <= 5000)
            System.out.println("O valor " + emprestimo + ", está dentro do intervalo permitido para empréstimo.");
        else
            System.out.println("O valor " + emprestimo + ", não está dentro do intervalo permitido para empréstimo.");

        // Verificação de triângulo

        System.out.println("Digite o primeiro lado: ");
        int primeiroLado = scanner.nextInt();
        System.out.println("Digite o segundo lado: ");
        int segundoLado = scanner.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int terceiroLado = scanner.nextInt();

        if (primeiroLado + segundoLado > terceiroLado && segundoLado + terceiroLado > primeiroLado && primeiroLado + terceiroLado > segundoLado)
            System.out.println("Os lados podem formar um triângulo.");
        else
            System.out.println("Os lados não podem formar um triângulo.");

        // Verificação de compatibilidade de doação de sangue

        System.out.println("Digite a idade do doador: ");
        int idadeDoador = scanner.nextInt();
        System.out.println("Digite o peso do doador (em kg): ");
        int pesoDoador = scanner.nextInt();

        if (idadeDoador <= 18 && idadeDoador >= 65 && pesoDoador < 50)
            System.out.println("O doador não é compatível.\nMotivo: Deve ter entre 18 e 65 anos e pesar mais de 50 kg.");
        else if (idadeDoador <= 18 || idadeDoador >= 65)
            System.out.println("O doador não é compatível.\nMotivo: Deve ter entre 18 e 65 anos.");
        else if (pesoDoador < 50)
            System.out.println("O doador não é compatível.\nMotivo: Deve pesar mais de 50 kg.");
        else if (idadeDoador >= 18 && idadeDoador <= 65 && pesoDoador > 50)
            System.out.println("O doador é compatível para doação de sangue.");
        else
            System.out.println("Dados inválidos.");

        // Verificação de código de acesso e nível de permissão

        System.out.println("Digite o código de acesso: ");
        int codigoAcesso = scanner.nextInt();
        System.out.println("Digite o nível de permissão: ");
        int permissao = scanner.nextInt();

        if (codigoAcesso != 2023 && permissao != 1 && permissao != 2 && permissao != 3)
            System.out.println("Acesso negado. Motivo: Código de acesso inválido e nível de permissão inválido.");
        else if (codigoAcesso == 2023 && (permissao == 1 || permissao == 2 || permissao == 3))
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        else if (codigoAcesso != 2023)
            System.out.println("Acesso negado. Motivo: Código de acesso inválido.");
        else if ((permissao != 1 || permissao != 2 || permissao != 3))
            System.out.println("Acesso negado. Motivo: Nível de permissão inválido.");
        else
            System.out.println("Acesso negado. Dados inválidos.");

        scanner.close();

    }
}