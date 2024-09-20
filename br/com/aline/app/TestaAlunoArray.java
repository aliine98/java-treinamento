package br.com.aline.app;

class Aluno {
    int nota;
    String nome;
}

class Turma {
    Aluno[] alunos;

    void mostraNotasAlunos() {
        for (int i =0; i < this.alunos.length; i++) {
            Aluno aluno = this.alunos[i];
            if(aluno == null) continue;
            System.out.println(aluno.nota);
        }
    }
}

public class TestaAlunoArray {
    public static void main(String[] args) {
        Turma t = new Turma();
        t.alunos = new Aluno[10];
        t.alunos[0] = new Aluno();
        t.alunos[0].nome = "Aline";
        t.alunos[0].nota = 10;
        t.mostraNotasAlunos();
    }
}
