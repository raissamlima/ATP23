package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.LivrosController;
import model.Livros;

public class Main {
    public static void main(String[] args) {
        LivrosController controller = new LivrosController();
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            opcao = menu(sc);
            switch (opcao) {
                case 1:
                    cadastrar(controller, sc);
                    break;
                case 2:
                    listar(controller);
                    break;
                case 3:
                   // alterar(controller, sc);
                    break;
                case 4:
                   // deletar(controller, sc);
                    break;
            }
        } while (opcao != 0);
    }

    private static int menu(Scanner sc) {
        System.out.print("\t1-Cadastrar\n\t2-Listar\n\t3-Alterar\n\t4-Deletar\n\t0-Sair\n\n\tEscolha uma opção: ");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }

    private static void cadastrar(LivrosController controller, Scanner sc) {
        Livros livros1 = new Livros();
        System.out.print("Digite o nome do livro: ");
        livros1.nome_livro = sc.nextLine();
        System.out.print("Digite o nome do autor: ");
        livros1.nome_autor = sc.nextLine();
        System.out.print("Digite o genero do livro: ");
        livros1.genero_livro = sc.nextLine();
        controller.salvar(livros1);
    }

    private static void listar(LivrosController controller) {
        ArrayList<Livros> lista = controller.listar();
        for (Livros cadastroLivros : lista) {
            System.out.printf("\nNome do Autor: %s, Nome do Livro: %s, Genero do Livro: %s\n", cadastroLivros.nome_autor,
                    cadastroLivros.nome_livro, cadastroLivros.genero_livro);
        }
    }
}