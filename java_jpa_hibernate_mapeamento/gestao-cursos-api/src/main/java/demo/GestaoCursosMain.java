package demo;

import entities.Aluno;
import entities.Telefone;
import models.AlunoModel;

import java.util.ArrayList;
import java.util.Date;

public class GestaoCursosMain {
    public static void main(String[] args) {
        AlunoModel alunoModel = new AlunoModel();

        // Inserção de um aluno
        Aluno aluno = new Aluno(1l,
                "João da Silva",
                "20231234",
                new Date(), // data atual como exemplo
                "joao.silva@email.com",
                new ArrayList<Telefone>(),
                new ArrayList<>(),
                new ArrayList<>()
        );

        alunoModel.create(aluno);

//            // Inserção de um curso
//            CursoModel curso = new CursoModel("Java Básico");
//            int cursoId = CursoDAO.inserir(conn, curso);
//
//            // Associação do aluno ao curso
//            CursoDAO.adicionarAluno(conn, cursoId, alunoId);

        System.out.println("Banco populado com sucesso!");

    }
}
