package ATP25;

public class Desktop extends Computador {
    public int tamanho_gabinete;
    public String monitor;
    public String fonte;

    // Criando uma sobrescrita do método toString na classe para imprimir todos os
    // dados
    @Override
    public String toString() {

        return this.tamanho_gabinete + ", " + this.monitor + ", " + this.fonte;
    }
}
