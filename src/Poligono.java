public abstract class Poligono extends Figura {
    public int lados;

    Poligono(String tipo, int lados) {
        super(tipo);
        setTipo(tipo);
        if (lados < 3) {
            throw new IllegalArgumentException("Polígono deve ter no mínimo 3 lados.");
        }
        setLados(lados);
    }
    
    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String[] info() {
        return new String[] { "Lados: " + lados };
    }

    @Override
    public double area(){
        return 0;
    }

    @Override
    public double perimetro(){
        return 0;
    }

}
