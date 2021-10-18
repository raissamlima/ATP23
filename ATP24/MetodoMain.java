package ATP24;

public class MetodoMain {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        carro1.capacidade_portamalas = 300;
        carro1.numero_portas = 4;

        Veiculo veiculo1 = new Veiculo();
        veiculo1.marca = "Hyundai";
        veiculo1.modelo = "Hb20";
        veiculo1.placa = "PRC3442"; 
 
        Object obj1 = veiculo1;
        Object obj2 = carro1;
        
        Veiculo veiculo2 = (Veiculo)obj1;
        Carro carro2 = (Carro)obj2;

        imprimir(veiculo2);
        imprimir(carro2);
    }
    public static void imprimir(Object obj){
        System.out.println(obj);
    }  
}
