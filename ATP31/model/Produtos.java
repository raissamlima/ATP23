package ATP31.model;

public class Produtos extends Base {
    public String produto_vegano;
    public ProdutoArtesanal produtoArtesanal = new ProdutoArtesanal(); 
    
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Produtos){
            Produtos outro = (Produtos)obj;
            if (this.id.equals(outro.id) && this.produto_vegano.equals(outro.produto_vegano) 
            && this.produtoArtesanal.equals(outro.produtoArtesanal)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Produto Vegano: " + produto_vegano;
    }
}
