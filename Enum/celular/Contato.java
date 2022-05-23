public class Contato {
    private String nome;
    private TipoNumero tipoNumero;
    private String numeroTelefone;

    public Contato(String nome, String numeroTelefone, TipoNumero tipoNumero) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.tipoNumero = tipoNumero;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }

    public void setTipoNumero(TipoNumero tipoNumero) {
        this.tipoNumero = tipoNumero;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}
