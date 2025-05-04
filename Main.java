import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros
        biblioteca.adicionarLivro("1234567890", "O Senhor dos Anéis", "J.R.R. Tolkien");
        biblioteca.adicionarLivro("0987654321", "Dom Casmurro", "Machado de Assis");
        biblioteca.adicionarLivro("1111111111", "O Hobbit", "J.R.R. Tolkien");

        // Listando todos os livros
        System.out.println("Todos os livros:");
        List<Livro> livros = biblioteca.listarLivros();
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " (ISBN: " + livro.getIsbn() + ")");
        }

        // Buscando por autor
        System.out.println("\nLivros de Tolkien:");
        List<Livro> livrosTolkien = biblioteca.buscarPorAutor("j.r.r. tolkien");
        for (Livro livro : livrosTolkien) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor());
        }

        // Buscando por ISBN
        System.out.println("\nBusca por ISBN '0987654321':");
        Livro encontrado = biblioteca.buscarPorIsbn("0987654321");
        if (encontrado != null) {
            System.out.println("Livro encontrado: " + encontrado.getTitulo() + " - " + encontrado.getAutor());
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
