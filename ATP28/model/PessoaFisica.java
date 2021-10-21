package ATP28.model;

public class PessoaFisica extends Base {
    public String nome;
    public String sobrenome;
    public Endereco endereco;
    public String cpf;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PessoaFisica) {
            PessoaFisica outra = (PessoaFisica) obj;
            if (this.nome.equals(outra.nome) && this.sobrenome.equals(outra.sobrenome)
                    && this.endereco.equals(outra.endereco) && this.cpf.equals(outra.cpf)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        String retorno = this.nome + ", " + this.sobrenome + ", " + this.endereco + ", " + this.cpf;
        return retorno;
    }
}
