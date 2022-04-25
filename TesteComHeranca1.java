public class TesteComHeranca1 {
    public static void main(String[] args) {
        //variável de referência
        AlunoDeGraduacao aluno = new AlunoDeGraduacao();
        aluno.nome = "Pedro";
        aluno.idade = 17;
        System.out.printf("%s %d", aluno.nome, aluno.idade);
    }
}
