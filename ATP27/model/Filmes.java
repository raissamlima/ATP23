package ATP27.model;

public class Filmes {

    public int id;
    public String atriz_principal;
    public String nome_filme;
    public String duracao;
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Filmes){
            Filmes outro = (Filmes)obj;
            if (this.id == outro.id && this.nome_filme.equals(outro.nome_filme) && this.atriz_principal.equals(outro.atriz_principal) && this.duracao.equals(outro.duracao)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String retorno = this.nome_filme + ", " + this.atriz_principal + ", " + this.duracao;
        return retorno;
    }
}
