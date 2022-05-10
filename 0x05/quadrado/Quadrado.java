public class Quadrado extends Retangulo{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (this.lado < 0){
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        } else {
            this.lado = lado;
        }
    }
    @Override
    public String toString() {
        return String.format("[Quadrado] %.2f", lado);
    }
}
