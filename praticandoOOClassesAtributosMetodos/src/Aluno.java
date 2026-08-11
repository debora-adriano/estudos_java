public class Aluno {
    public String nomeAluno;
    public double nota1;
    public double nota2;

    public Aluno() {
    }

    public Aluno(String nomeAluno, double nota1, double nota2) {
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void calculaMedia(){
        System.out.println("Aluno: " + this.nomeAluno + "\nNota 1: " + this.nota1 + "\nNota 2: " + this.nota2);

        double media = (nota1 + nota2) / 2;

        System.out.printf("Média: %.1f%n", media);

        if (media >= 7)
            System.out.println("Situação: Aprovado");
        else System.out.println("Situação: Reprovado");
    }
}
