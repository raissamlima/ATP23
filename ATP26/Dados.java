package ATP26;

public class Dados {
    private Object[] dados;
    private int posicao = 0;
    private int capacidade;

    // Método Construtor
    public Dados() {
        this.capacidade = 5;
        this.dados = new Object[this.capacidade];
    }

    public void add(Object object) {
        if (this.posicao >= dados.length) {
            capacidade += 5;
            Object[] dadosNovos = new Object[capacidade];
            for (int n = 0; n < this.dados.length; n++) {
                dadosNovos[n] = this.dados[n];
            }
            this.dados = dadosNovos;
        }
        this.dados[posicao] = object;
        this.posicao++;
    }

    public int size() {
        return this.posicao + 1;
    }

    public void remove(Object object) {
        for (int n = 0; n < this.dados.length; n++) {
            if (this.dados[n].equals(object)) {
                reestrut(n);
                this.posicao--;
            }
        }
    }

    public void reestrut(int position) {
        for (int n = position; n < this.dados.length - 1; n++) {
            this.dados[n] = this.dados[n + 1];
        }
    }

    public boolean contain(Object object) {
        for (int n = 0; n < this.posicao; n++) {
            if (this.dados[n].equals(object)) {
                return true;
            }
        }
        return false;
    }
}
