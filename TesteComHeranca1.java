public class TesteComHeranca1 {
    public static void main(String[] args) {
        //variável de referência
        AlunoDeGraduacao aluno = new AlunoDeGraduacao();
        aluno.nome = "Pedro";
        aluno.idade = 17;
        System.out.printf("%s %d\n", aluno.nome, aluno.idade);
        System.out.println(aluno.nome + " " + aluno.idade);

        ProfessorPesquisador pesquisador;
        pesquisador = new ProfessorPesquisador();
        pesquisador.nome = "João";
        pesquisador.pesquisar();
    }
}
