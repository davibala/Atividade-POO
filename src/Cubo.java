public class Cubo extends Figura3D{
    
    private double aresta;
    
    public Cubo(double aresta) {
        super("Círculo");
        if(aresta <= 0) {
            throw new IllegalArgumentException("Aresta deve ser maior que zero.");
        }
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        if (aresta <= 0) {
            throw new IllegalArgumentException("Aresta deve ser maior que zero.");
        }
        this.aresta = aresta;
    }

    public void escalar(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("Fator de escala deve ser maior que zero.");
        }
        this.aresta *= fator;
    }

    public double volume() {
        return Math.pow(aresta, 3);
    }

    public double area() {
        return 6 * Math.pow(aresta, 2);
    }

    @Override
    public String getTipo() {
        return "Cubo";
    }

    @Override
    public String[] info() {
       return new String[] {"Lado: " + aresta};
    }

    @Override
    public double perimetro() {
        return 12 * aresta;
    }

}
