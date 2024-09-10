// Arquivo: SistemaPerfilUsuario.java

class PerfilUsuario {
    private String nomeUsuario;
    private String bio;
    private int numeroSeguidores;

    // Construtor
    public PerfilUsuario(String nomeUsuario, String bio, int numeroSeguidores) {
        this.nomeUsuario = nomeUsuario;
        this.bio = bio;
        this.numeroSeguidores = numeroSeguidores;
    }

    // Métodos para obter as informações
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getBio() {
        return bio;
    }

    public int getNumeroSeguidores() {
        return numeroSeguidores;
    }

    // Método para exibir as informações do perfil do usuário
    public void exibirInfo() {
        System.out.println("Nome de Usuário: " + nomeUsuario);
        System.out.println("Bio: " + bio);
        System.out.println("Número de Seguidores: " + numeroSeguidores);
        System.out.println("--------------------------");
    }
}

public class SistemaPerfilUsuario {
    public static void main(String[] args) {
        // Criando perfis para três usuários
        PerfilUsuario usuario1 = new PerfilUsuario("joaosilva", "Apaixonado por tecnologia", 150);
        PerfilUsuario usuario2 = new PerfilUsuario("mariaoliveira", "Viajante e fotógrafa", 350);
        PerfilUsuario usuario3 = new PerfilUsuario("pedro_costa", "Desenvolvedor full stack", 500);

        // Exibindo informações dos perfis
        usuario1.exibirInfo();
        usuario2.exibirInfo();
        usuario3.exibirInfo();
    }
}
