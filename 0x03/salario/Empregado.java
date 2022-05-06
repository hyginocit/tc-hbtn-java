public class Empregado {
    private double salarioFixo;

    public double calcularBonus(Departamento departamento){
        if (departamento.getValorAtingidoMeta() >= departamento.getValorMeta()){
         return salarioFixo * 0.1;
        } else {
            return 0;
        }
    }
    public double calcularSalarioTotal(Departamento departamento){
        if (departamento.getValorAtingidoMeta() >= departamento.getValorMeta()){
            return salarioFixo + salarioFixo * 0.1;
        } else {
            return salarioFixo;
        }

    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
