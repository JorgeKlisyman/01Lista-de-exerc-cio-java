// Arquivo: SistemaReservasHotel.java

class Reserva {
    private String nomeHospede;
    private String tipoQuarto;
    private int numeroNoites;

    // Construtor
    public Reserva(String nomeHospede, String tipoQuarto, int numeroNoites) {
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
        this.numeroNoites = numeroNoites;
    }

    // Métodos para obter as informações
    public String getNomeHospede() {
        return nomeHospede;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public int getNumeroNoites() {
        return numeroNoites;
    }

    // Método para exibir as informações da reserva
    public void exibirInfo() {
        System.out.println("Nome do Hóspede: " + nomeHospede);
        System.out.println("Tipo de Quarto: " + tipoQuarto);
        System.out.println("Número de Noites: " + numeroNoites);
        System.out.println("--------------------------");
    }
}

public class SistemaReservasHotel {
    public static void main(String[] args) {
        // Criando três reservas diferentes
        Reserva reserva1 = new Reserva("Carlos Souza", "Simples", 3);
        Reserva reserva2 = new Reserva("Ana Pereira", "Duplo", 5);
        Reserva reserva3 = new Reserva("Mariana Lopes", "Suíte", 7);

        // Exibindo informações das reservas
        reserva1.exibirInfo();
        reserva2.exibirInfo();
        reserva3.exibirInfo();
    }
}
