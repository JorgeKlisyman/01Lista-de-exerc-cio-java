// Arquivo: sistemacontrolealunos.java
class Aluno {
    private String nome;
    private int idade;
    private String serie;

    // Construtor
    public Aluno(String nome, int idade, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
    }

    // Métodos para obter as informações
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSerie() {
        return serie;
    }

    // Método para exibir as informações do aluno
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Série: " + serie);
        System.out.println("--------------------------");
    }
}

public class sistemacontrolealunos {
    public static void main(String[] args) {
        // Criando três alunos diferentes
        Aluno aluno1 = new Aluno("Ana Silva", 14, "8ª série");
        Aluno aluno2 = new Aluno("Carlos Oliveira", 16, "2º ano do ensino médio");
        Aluno aluno3 = new Aluno("Mariana Costa", 12, "6ª série");

        // Exibindo informações dos alunos
        aluno1.exibirInfo();
        aluno2.exibirInfo();
        aluno3.exibirInfo();
    }
}
