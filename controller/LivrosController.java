package controller;

import java.util.ArrayList;

import model.Livros;

public class LivrosController {

    private ArrayList<Livros> livros = new ArrayList<Livros>();

    public void salvar(Livros c) {
        livros.add(c);
    }

    public ArrayList<Livros> listar() {
        return livros;
    }

    public void alterar(Livros c) {
        for (Livros cadastroLivros : livros) {
            deletar(cadastroLivros);
            salvar(c);
        }
    }

    public void deletar(Livros c) {
        livros.remove(c);
    }
}
