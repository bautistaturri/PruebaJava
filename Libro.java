import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Libro {
    private List<Pagina> paginas;

    public Libro() {
        paginas = new ArrayList<>();
    }

    public void agregarPagina(Pagina pagina) {
        paginas.add(pagina);
    }

    public List<Pagina> getPaginas() {
        return paginas;
    }

    public int getNumeroDePaginas() {
        return paginas.size();
    }
}
