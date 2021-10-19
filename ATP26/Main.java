package ATP26;

public class Main {
    public static void main(String[] args) {
        Dados d1 = new Dados();
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();

        // Pessoa
        p1.nome = "Kurt";
        p1.sobrenome = "Cobain";
        p1.idade = "27";

        // Aluno
        a1.nome = "Amy";
        a1.sobrenome = "Winehouse";
        a1.idade = "27";
        a1.matricula = "1983";
        a1.turma = "Rock";
        a1.curso = "Musical";

        d1.add(p1);
        d1.add(a1);

        System.out.println(d1.contain(p1));
        System.out.println(d1.contain(a1));

        d1.remove(a1);
    }
} 

