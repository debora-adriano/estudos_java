import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Débora";
        String tipoConta = "Corrente";
        double saldo = 5584.68;
        double valorInformado = 0;
        int operacao = 0;
        String menu = """
                ----------------------------------
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair

                Digite a operação desejada:""";

        Scanner leitura = new Scanner(System.in);

        System.out.println("*******************************\n" + "Dados inicias do cliente:\n\n" +
                "Nome: " + nome + "\nTipo conta: " + tipoConta + "\nSaldo Inicial: R$ " + saldo +
                "\n*******************************\n");

        while (operacao != 4) {
            System.out.println(menu);
            operacao = leitura.nextInt();
            switch (operacao) {
                case 1:
                    System.out.println(String.format("O saldo atual é R$ %.2f", saldo));
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    valorInformado = leitura.nextDouble();
                    saldo += valorInformado;
                    System.out.println(String.format("Saldo atualizado R$ %.2f", saldo));
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    valorInformado = leitura.nextDouble();
                    if (valorInformado < saldo) {
                        saldo -= valorInformado;
                        System.out.println(String.format("Saldo atualizado R$ %.2f", saldo));
                    } else {
                        System.out.println("Não ha saldo suficiente para fazer essa transferência.");
                    }
                    break;
                case 4:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Operação inválida!");
            }
        }
    }
}
