public class Cilindro extends Figura {
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        super("Cilindro");
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser positivo.");
        }
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser positiva.");
        }
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public double getAltura() {
        return altura;
    }

    public String getTipo() {
        return "Cilindro";
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser positiva.");
        }
        this.altura = altura;
    }

    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser positivo.");
        }
        this.raio = raio;
    }

    public String[] info() {
        return new String[] {
            "Raio: " + raio,
            "Altura: " + altura
        };
    }

    public double volume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public double area() {
        return 2 * Math.PI * 36 + 2 * Math.PI * 36;
    }
    
    @Override
    public double perimetro() {
        return 0;
    }

    public void escalar(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("Fator de escala deve ser positivo.");
        }
        raio *= fator;
        altura *= fator;
    }
}
