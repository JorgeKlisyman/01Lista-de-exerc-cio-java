// Arquivo: gerenciamentoFuncionarios.java

class Funcionario {
    private String nome;
    private String departamento;
    private double salario;

    // Construtor
    public Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    // Métodos para obter as informações
    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    // Método para exibir as informações do funcionário
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: R$" + salario);
        System.out.println("--------------------------");
    }
}

public class gerenciamentofuncionarios {
    public static void main(String[] args) {
        // Registrando três funcionários
        Funcionario func1 = new Funcionario("João Silva", "Vendas", 3500.00);
        Funcionario func2 = new Funcionario("Maria Oliveira", "TI", 4500.00);
        Funcionario func3 = new Funcionario("Pedro Costa", "RH", 3000.00);

        // Exibindo informações dos funcionários
        func1.exibirInfo();
        func2.exibirInfo();
        func3.exibirInfo();
    }
}
