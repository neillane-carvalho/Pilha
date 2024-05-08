public class Livro {
    private String titulo;
    private String autor;

    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
