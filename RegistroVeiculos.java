// Arquivo: RegistroVeiculos.java

class Veiculo {
    private String placa;
    private String marca;
    private int ano;

    // Construtor
    public Veiculo(String placa, String marca, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
    }

    // Métodos para obter as informações
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    // Método para exibir as informações do veículo
    public void exibirInfo() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("--------------------------");
    }
}

public class RegistroVeiculos {
    public static void main(String[] args) {
        // Registrando três veículos
        Veiculo veiculo1 = new Veiculo("ABC-1234", "Toyota", 2015);
        Veiculo veiculo2 = new Veiculo("XYZ-5678", "Honda", 2020);
        Veiculo veiculo3 = new Veiculo("DEF-9012", "Ford", 2018);

        // Exibindo informações dos veículos
        veiculo1.exibirInfo();
        veiculo2.exibirInfo();
        veiculo3.exibirInfo();
    }
}
