public class Quadrado extends Retangulo {
    
    public Quadrado(double lado) {
        super(lado, lado);
    }

    public double getLado() {
        return super.getAltura();
    }
    
    public String getTipo(){
        return "Quadrado";
    }

    public void setLado(double lado) {
        setAltura(lado);
        setBase(lado);
    }

    public void escalar(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("Fator de escala inválido.");
        }
        setLado(getLado() * fator);
    }

    @Override
    public String[] info() {
        return new String[] { "Lados: " + getLados(), "Lado: " + getLado() };
    }

}
