public class Empregado {
    private double salarioFixo;

    public double calcularBonus(Departamento departamento){
         return salarioFixo * 0.1;
    }
    public double calcularSalarioTotal(Departamento departamento){
        return salarioFixo + salarioFixo * 0.1;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
