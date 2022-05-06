public class Gerente extends Empregado{
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    public double calcularBonus(double salarioFixo, double valorMetaAtingida, double valorMeta){

        double diferenca = valorMetaAtingida - valorMeta * 0.01;
        return salarioFixo + salarioFixo * 0.2 + diferenca;
    }
}
