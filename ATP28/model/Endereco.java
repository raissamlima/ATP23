package ATP28.model;

public class Endereco extends Base {

    public String logradouro;
    public String numero;
    public String complemento;
    public String cep;
    public String cidade;
    public String estado;

    @Override
    public String toString(){
        String retorno = this.logradouro + ", " + this.numero + ", " + this.complemento + ", " + this.cep
        + ", " + this.cidade + ", " + this.estado;
        return retorno;
    }
}
