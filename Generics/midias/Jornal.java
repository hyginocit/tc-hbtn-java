public class Jornal extends Midia{
    private int quantidadedeArtigos;

    public int getQuantidadedeArtigos() {
        return quantidadedeArtigos;
    }

    public Jornal(String nome, int quantidadedeArtigos) {
        this.setNome(nome);
        this.quantidadedeArtigos = quantidadedeArtigos;
    }

    public void setQuantidadedeArtigos(int quantidadedeArtigos) {
        this.quantidadedeArtigos = quantidadedeArtigos;
    }
}
