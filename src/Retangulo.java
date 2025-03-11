public class Retangulo extends Poligono {
    public double base;
    public double altura;

    public Retangulo(double base, double altura) {
        super("Retângulo", 4);
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser maiores que zero.");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public int getLados() {
        return super.getLados();
    }

    public double getAltura(){
        return altura;
    }

    public void setBase(double base){
        if (base <= 0) {
            throw new IllegalArgumentException("Base deve ser maior que zero.");
        }
        this.base = base;
    }

    public void setAltura(double altura){
        if (altura <= 0) {
            throw new IllegalArgumentException("Base deve ser maior que zero.");
        }
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public String[] info() {
        return new String[] { "Lados: " + getLados(), "Base: " + base, "Altura: " + altura };
    }

    @Override
    public void escalar(double fator){
        if(fator <= 0){
            throw new IllegalArgumentException("Fator de escala deve ser maior que zero.");
        }
        base *= fator;
        altura *= fator;
    }


}
