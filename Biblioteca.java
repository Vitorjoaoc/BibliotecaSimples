import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor) {
        livros.add(new Livro(titulo, autor));
    }

    public List<Livro> listarLivros() {
        return new ArrayList<>(livros);
    }
}
