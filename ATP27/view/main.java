package ATP27.view;

import ATP27.controller.FController;
import ATP27.controller.SController;
import ATP27.model.Filmes;
import ATP27.model.Series;

public class main {
    public static void main(String[] args) {
        FController fController = new FController();
        SController sController = new SController();
        Filmes f1 = new Filmes();
        Series s1 = new Series();

        // FILMES 
        f1.nome_filme = "Tomates Verdes Fritos";
        f1.atriz_principal = "Jessica Tandy";
        f1.duracao = "2h 10m";

        // SÉRIES
        s1.genero = "Dorgas";
        s1.nome_serie = "Breaking Bad";
        s1.temporadas = 5;

        fController.create(f1);
        System.out.println(f1);
        sController.create(s1);
        System.out.println(s1);

    }
}

