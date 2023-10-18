package br.com.alura.desafio.principal;

import br.com.alura.desafio.classes.ConsultaCep;
import br.com.alura.desafio.classes.Endereco;
import br.com.alura.desafio.classes.GeradorArquivo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ConsultaCep consultaCEP = new ConsultaCep();
        List<Endereco> enderecos = new ArrayList<>();

        Scanner leitura = new Scanner(System.in);
        var cep = "";

        while (!cep.equalsIgnoreCase("sair")){
            System.out.println("Digite um número de CEP para busca: ");
            cep = leitura.nextLine();

            if (cep.equalsIgnoreCase("sair")){
                break;
            }

            try {
                Endereco novoEndereco = consultaCEP.buscaEndereco(cep);
                enderecos.add(novoEndereco);

            }catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }
        GeradorArquivo gerador = new GeradorArquivo();
        gerador.salvaArquivoJson(enderecos);
        System.out.println(enderecos);
    }
}
