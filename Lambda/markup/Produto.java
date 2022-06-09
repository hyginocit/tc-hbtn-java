
public class Produto {
    private String nome;
    private double preco;
    public double percentualMarkUp = 0.1;

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

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkUp() {
        return percentualMarkUp;
    }

    public void setPercentualMarkUp(double percentualMarkUp) {
        this.percentualMarkUp = percentualMarkUp;
    }

}