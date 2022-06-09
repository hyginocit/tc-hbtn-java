import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private Double preco;
    public Double percentualMarkup = 0.1;

    public Produto(double preco,String nome) {
        this.preco = preco;
        this.nome = nome;
    }
   public Supplier<Double> precoComMarkup = () -> preco*(1+percentualMarkup);
   public Consumer<Double> atualizarMarkup = x -> this.percentualMarkup = (x/100);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPercentualMarkUp() {
        return percentualMarkup;
    }

    public void setPercentualMarkUp(Double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }

}