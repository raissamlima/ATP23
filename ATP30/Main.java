package ATP30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int opcao;
        do {
            opcao = menu(scan);

            switch (opcao) {
            case 1:
                soma(calc, scan);
                break;
            case 2:
                subtracao(calc, scan);
                break;

            case 3:
                multiplicacao(calc, scan);
                break;

            case 4:
                divisao(calc, scan);
                break;

            default:
                break;
            }
        } while (opcao != 0);
    }

    private static int menu(Scanner scan) {
        System.out.print("\n\t***- Escolha uma opção da calculadora -***\n\t1-Somar\n\t2-Subtrair\n\t3-Multiplicar\n\t4-Dividir\n\t0-Sair\n\n\tDigite a opção desejada: ");
        int opcao = Integer.parseInt(scan.nextLine());
        return opcao;
    }

    private static void soma(Calculadora n, Scanner scan) {
        Calculadora calc = new Calculadora();
        System.out.print("Digite o primeiro numero: ");
        int nm1 = calc.n1 = Integer.parseInt(scan.nextLine());
        System.out.print("Digite o segundo numero: ");
        int nm2 = calc.n2 = Integer.parseInt(scan.nextLine());
        int vlr_final = calc.soma(nm1, nm2);
        System.out.printf("\nA soma dos números é igual a: %s ", vlr_final);
    }

    private static void subtracao(Calculadora n, Scanner scan) {
        Calculadora calc = new Calculadora();
        System.out.print("Digite o primeiro numero: ");
        int nm1 = calc.n1 = Integer.parseInt(scan.nextLine());
        System.out.print("Digite o segundo numero: ");
        int nm2 = calc.n2 = Integer.parseInt(scan.nextLine());
        int vlr_final = calc.subtracao(nm1, nm2);
        System.out.printf("\nA subtração dos números é igual a: %s ", vlr_final);
    }

    private static void multiplicacao(Calculadora n, Scanner scan) {
        Calculadora calc = new Calculadora();
        System.out.print("Digite o primeiro numero: ");
        int nm1 = calc.n1 = Integer.parseInt(scan.nextLine());
        System.out.print("Digite o segundo numero: ");
        int nm2 = calc.n2 = Integer.parseInt(scan.nextLine());
        int vlr_final = calc.multiplicacao(nm1, nm2);
        System.out.printf("\nA multiplicação dos números é igual a: %s ", vlr_final);
    }

    private static void divisao(Calculadora n, Scanner scan) {
        Calculadora calc = new Calculadora();
        System.out.print("Digite o primeiro numero: ");
        int nm1 = calc.n1 = Integer.parseInt(scan.nextLine());
        System.out.print("Digite o segundo numero: ");
        int nm2 = calc.n2 = Integer.parseInt(scan.nextLine());
        int vlr_final = calc.divisao(nm1, nm2);
        System.out.printf("\nA soma dos números é igual a: %s ", vlr_final);
    }
}
