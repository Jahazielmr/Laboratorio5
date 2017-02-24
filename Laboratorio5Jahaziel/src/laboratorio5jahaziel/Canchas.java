package laboratorio5jahaziel;

public class Canchas extends Lugares{
    
     
    private String categoria, estado;
    
    public Canchas() {
        super();   
    }

    public Canchas(String categoria, String estado, String nombre, String direccion, int N_seguridad) {
        super(nombre, direccion, N_seguridad);
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString()+"categoria=" + categoria + ", estado=" + estado;
    }

    
    
    
    
}
