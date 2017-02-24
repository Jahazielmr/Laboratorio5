package laboratorio5jahaziel;

class Carreteras {
   
    private int Numero_U, distancia;
    private Lugares inicio, fin;

    public Carreteras() {
    }

    public Carreteras(int Numero_U, int distancia, Lugares inicio, Lugares fin) {
        this.Numero_U = Numero_U;
        this.distancia = distancia;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getNumero_U() {
        return Numero_U;
    }

    public void setNumero_U(int Numero_U) {
        this.Numero_U = Numero_U;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Lugares getInicio() {
        return inicio;
    }

    public void setInicio(Lugares inicio) {
        this.inicio = inicio;
    }

    public Lugares getFin() {
        return fin;
    }

    public void setFin(Lugares fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return  
                "distancia=" + distancia ;
    }
    
    
    

    
    
}
