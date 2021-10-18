package ATP25;

public class Main {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.marca = "Samsung";
        computador1.memoria_ram = 32;
        computador1.processador = "i7";
        computador1.disco_rigido = "4TB";

        Notebook notebook1 = new Notebook();
        notebook1.marca = "Samsung";
        notebook1.memoria_ram = 32;
        notebook1.processador = "i7";
        notebook1.disco_rigido = "4TB";
        notebook1.bateria = "74wh";
        notebook1.velocidade_wifi = "25MB";
        notebook1.versao_bluetooth = "Sim";

        Desktop desktop1 = new Desktop();
        desktop1.marca = "Samsung";
        desktop1.memoria_ram = 32;
        desktop1.processador = "i7";
        desktop1.disco_rigido = "4TB";
        desktop1.tamanho_gabinete = 2323;
        desktop1.monitor = "20 polegadas";
        desktop1.fonte = "Gamer";

        Object obj1 = computador1;
        Object obj2 = notebook1;
        Object obj3 = desktop1;

        Computador computador2 = (Computador) obj1;
        Notebook notebook2 = (Notebook) obj2;
        Desktop desktop2 = (Desktop) obj3;

        imprimir(computador2);
        imprimir(notebook2);
        imprimir(desktop2);
    }

    public static void imprimir(Object obj) {
        System.out.println(obj);
    }
}
