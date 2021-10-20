package ATP27.model;

public class Series {

    public String genero;
    public String nome_serie;
    public int temporadas;
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Series){
            Series outra = (Series)obj;
            if(this.genero.equals(outra.genero) && this.nome_serie.equals(outra.nome_serie) && this.temporadas == outra.temporadas){
                return true;
            }
    }
    return false;
    }  
    @Override
    public String toString(){
        String retorno = this.genero + ", " + this.nome_serie + ", "+ this.temporadas + " temporadas";
        return retorno;
    }
}

