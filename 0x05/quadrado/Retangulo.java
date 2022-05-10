public class Retangulo extends FormaGeometrica{
    protected double largura;
    protected double altura;

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) {
        if (this.largura < 0){
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        } else {
        this.largura = largura;
        }
    }

    public void setAltura(double altura) {
        if (this.altura < 0) {
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        } else {
            this.altura = altura;
        }
    }

    @Override
    public double area() {
        return this.largura * this.altura;
    }

    public String toString(){
        return String.format("[Retangulo] %.2f / %.2f", this.largura, this.altura);
    }
}
