package poo.heranca;

public class ItemBiblioteca {

    private String titulo;
    private String anoPublicado;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, String anoPublicado, boolean disponivel) {
        this.titulo = titulo;
        this.anoPublicado = anoPublicado;
        this.disponivel = disponivel;
    }
    
    // --- MÉTODOS DE AÇÃO FORMATADOS ---

    public void verDetalhes() {
        String status = disponivel ? "Disponível" : "Emprestado";
        System.out.println("\n📚 --- DETALHES DO LIVRO --- 📚");
        System.out.println("   Título: " + titulo);
        System.out.println("   Ano de Publicação: " + anoPublicado);
        System.out.println("   Status Atual: " + status);
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            // CORREÇÃO: String limpa e clara.
            System.out.println("\n✅ SUCESSO: O livro '" + getTitulo() + "' foi emprestado.");
        } else {
            System.out.println("\n❌ ERRO: O livro '" + getTitulo() + "' JÁ ESTÁ emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            // CORREÇÃO: String limpa e clara.
            System.out.println("\n✅ SUCESSO: O livro '" + getTitulo() + "' foi devolvido.");
        } else {
            System.out.println("\n❌ ERRO: O livro '" + getTitulo() + "' já estava na biblioteca.");
        }
    }
    
    // --- GETTERS (OBRIGATÓRIOS) ---

    public String getTitulo() {
        return titulo;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }
}