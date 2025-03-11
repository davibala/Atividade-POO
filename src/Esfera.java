public class Esfera extends Figura3D{
    private double raio;

    public Esfera(double raio) {
        super("Esfera");
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser positivo.");
        }
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser positivo.");
        }
        this.raio = raio;
    }

    public String[] info() {
        return new String[] {"Raio: "+ raio};
    }

    public double volume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(raio, 3);
    }

    public double area() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    public void escalar(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("Fator de escala deve ser positivo.");
        }
        raio *= fator;
    }

    @Override
    public String getTipo() {
        return "Esfera";
    }

    @Override
    public double perimetro() {
        return 0;
    }
}
