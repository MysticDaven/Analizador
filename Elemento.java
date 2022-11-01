public class Elemento {
    String id;
    String categoria;
    String tipo;
    String size;

    public Elemento() {
    }

    public Elemento(String id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public Elemento(String id, String categoria, String tipo, String size) {
        this.id = id;
        this.categoria = categoria;
        this.tipo = tipo;
        this.size = size;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
