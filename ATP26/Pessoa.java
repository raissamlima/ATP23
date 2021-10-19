package ATP26;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public String idade;

    // Criando uma sobrescrita do método equals na classe para comparar os dados
    // especificos de cada uma.
    @Override
    public boolean equals(Object obj) {
        Pessoa outraPessoa = (Pessoa) obj;
        if (this.nome.equals(outraPessoa.nome) && this.sobrenome.equals(outraPessoa.sobrenome)
                && this.idade.equals(outraPessoa.idade)) {
            return true;
        }
        return false;
    }

    // Criando uma sobrescrita do método toString na classe para imprimir todos os
    // dados
    @Override
    public String toString() {
        return this.nome + ", " + this.sobrenome + ", " + this.idade;
    }
}
