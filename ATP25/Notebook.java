package ATP25;

public class Notebook extends Computador {
    public String bateria;
    public String velocidade_wifi;
    public String versao_bluetooth;

    // Criando uma sobrescrita do método toString na classe para imprimir todos os
    // dados
    @Override
    public String toString() {

        return this.bateria + ", " + this.velocidade_wifi + ", " + this.versao_bluetooth;
    }
}
