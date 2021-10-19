package ATP26;

public class Aluno extends Pessoa {
    public String matricula;
    public String turma;
    public String curso;

    // Criando uma sobrescrita do método equals na classe para comparar os dados
    // especificos de cada uma.
    @Override
    public boolean equals(Object obj) {
        Aluno outroAluno = (Aluno) obj;
        if (this.matricula.equals(outroAluno.matricula) && this.turma.equals(outroAluno.turma)
                && this.curso.equals(outroAluno.curso)) {
            return true;
        }
        return false;
    }

    // Criando uma sobrescrita do método toString na classe para imprimir todos os
    // dados
    @Override
    public String toString() {
        return super.toString() + matricula + ", " + this.turma + ", " + this.curso;
    }
}
