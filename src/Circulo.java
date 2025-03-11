public class Circulo extends Figura {
    public double raio;

    public Circulo (double raio){

        super("Círculo");
        if(raio > 0){
            this.raio = raio;
        }else {
            throw new IllegalArgumentException("Raio deve ser maior que zero.");
        }
    }

    public double getRaio(){
        return this.raio;
    }

    public void setRaio(int raio){
        if(raio > 0){
            this.raio = raio;
        }else {
            throw new IllegalArgumentException("Raio deve ser maior que zero.");
        }
    }

    @Override
    public String[] info(){
        return new String[] { "Raio: " + raio };
    }

    @Override
    public double area(){
        return Math.PI * raio * raio;
    }

    @Override
    public double perimetro(){
        return 2 * Math.PI * raio;
    }   

    @Override 
    public void escalar(double fator){
        if(fator <= 0){
            throw new IllegalArgumentException("Fator deve ser maior que zero.");
        }
        this.raio *= fator;
    }
}
