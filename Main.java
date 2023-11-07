import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro();
        miLibro.agregarPagina(new Pagina("Contenido de la página 1", 1));
        miLibro.agregarPagina(new Pagina("Contenido de la página 2", 2));
        miLibro.agregarPagina(new Pagina("Contenido de la página 3", 3));

        // Obtener el número de páginas del libro
        int numeroDePaginas = miLibro.getNumeroDePaginas();
        System.out.println("El libro tiene " + numeroDePaginas + " páginas.");

        // Acceder al contenido de una página específica
        List<Pagina> paginas = miLibro.getPaginas();
        for (Pagina pagina : paginas) {
            System.out.println("Página " + pagina.getIndice() + ": " + pagina.getTexto());
        }
    }
}