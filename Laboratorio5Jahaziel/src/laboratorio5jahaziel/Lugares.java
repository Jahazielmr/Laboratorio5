package laboratorio5jahaziel;

import java.util.ArrayList;

public class Lugares {
   
    protected String nombre, direccion;
    protected Carreteras entrada, C_salida;
    protected int N_seguridad;

    public Lugares() {
    }

    public Lugares(String nombre, String direccion, int N_seguridad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.N_seguridad = N_seguridad;
    }

    public int getN_seguridad() {
        return N_seguridad;
    }

    public void setN_seguridad(int N_seguridad) {
        this.N_seguridad = N_seguridad;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Carreteras getEntrada() {
        return entrada;
    }

    public void setEntrada(Carreteras entrada) {
        this.entrada = entrada;
    }
    
   
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public Carreteras getC_salida() {
        return C_salida;
    }

    public void setC_salida(Carreteras C_salida) {
        this.C_salida = C_salida;
    }

    @Override
    public String toString() {
        return "Lugares{" + "nombre=" + 
                nombre + ", direccion=" + direccion + ", entrada=" 
                + entrada + ", C_salida=" + C_salida + '}';
    }
    
    
    
    
}
