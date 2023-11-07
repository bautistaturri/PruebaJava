import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Pagina {
    private String texto;
    private int indice;

    public Pagina(String texto, int indice) {
        this.texto = texto;
        this.indice = indice;
    }

    public String getTexto() {
        return texto;
    }

    public int getIndice() {
        return indice;
    }
}