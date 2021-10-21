package ATP28.model;

public class PessoaJuridica extends Base {
    public String nome;
    public String sobrenome;
    public String nome_empresa;
    public Endereco endereco;
    public String cnpj;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PessoaJuridica) {
            PessoaJuridica outra = (PessoaJuridica) obj;
            if (this.nome.equals(outra.nome) && this.sobrenome.equals(outra.sobrenome)
                    && this.nome_empresa.equals(outra.nome_empresa) && this.endereco.equals(outra.endereco)
                    && this.cnpj.equals(outra.cnpj)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String retorno = this.nome + ", " + this.sobrenome + ", " + this.nome_empresa + ", " + this.endereco + ", "
                + this.cnpj;
        return retorno;
    }
}
