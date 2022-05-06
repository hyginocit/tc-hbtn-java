public class Gerente extends Empregado{
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    public double calcularBonus(double salarioFixo, double valorMetaAtingida, double valorMeta, Departamento departamento){

        if (departamento.getValorAtingidoMeta() >= departamento.getValorMeta()){
            double diferenca = valorMetaAtingida - valorMeta * 0.01;
            return salarioFixo + salarioFixo * 0.2 + diferenca;
        } else {
            return salarioFixo;
        }

    }
}
