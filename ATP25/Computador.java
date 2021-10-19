package ATP25;

public class Computador {
    public String marca;
    public int memoria_ram;
    public String processador;
    public String disco_rigido; 
    
    // Criando uma sobrescrita do método toString na classe para imprimir todos os dados
    @Override
    public String toString() {

        return this.marca + ", " + this.memoria_ram + ", " + this.processador + ", " + this.disco_rigido;
    }
}
