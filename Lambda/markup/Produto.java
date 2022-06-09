

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private Double preco;
    public Double percentualMarkUp = 0.1;

    public Produto(double preco,String nome) {
        this.preco = preco;
        this.nome = nome;
    }
   public Supplier<Double> precoComMarkUp = () -> preco*(1+percentualMarkUp);
   public Consumer<Double> atualizarMarkUp = x -> this.percentualMarkUp = (x/100);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkUp() {
        return percentualMarkUp;
    }

    public void setPercentualMarkUp(Double percentualMarkUp) {
        this.percentualMarkUp = percentualMarkUp;
    }

}