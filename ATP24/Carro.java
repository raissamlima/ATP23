package ATP24;

public class Carro {
    public int numero_portas;
    public int capacidade_portamalas;  
    
    @Override
    public String toString(){
        return this.numero_portas + ", " + this.capacidade_portamalas;
    }
}
