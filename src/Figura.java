public abstract class Figura {
    public String tipo;

    public Figura(String tipo) {
        if(tipo != null && !tipo.isEmpty()){
            setTipo(tipo);
        }else {
            throw new IllegalArgumentException("Tipo não pode ser nulo ou vazio.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String[] info(){
        return new String[]{tipo};
    }

    public void escalar(double fator){
        if(fator <= 0){
            throw new IllegalArgumentException("Fator de escala deve ser maior que zero.");
        }
    }

    public abstract double area();
    
    public abstract double perimetro();

}
