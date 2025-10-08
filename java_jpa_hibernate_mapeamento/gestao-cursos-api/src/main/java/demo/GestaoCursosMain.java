package demo;

import entities.*;
import models.*;

import java.util.Date;

public class GestaoCursosMain {
    public static void main(String[] args) {
        TelefoneModel telefoneModel = new TelefoneModel();
        Telefone telefone = Telefone.builder().numero("99999-9999").ddd("11").build();
        telefoneModel.create(telefone);

        EnderecoModel enderecoModel = new EnderecoModel();
        Endereco endereco = Endereco.builder().logradouro("Rua A").numero("123").bairro("Centro").cidade("São Paulo").estado("SP").cep(12345678).build();
        enderecoModel.create(endereco);

        ProfessorModel professorModel = new ProfessorModel();
        Professor professor = Professor.builder().nomeCompleto("Maria Oliveira").matricula("123").email("maria.oliveira@email.com").build();
        professorModel.create(professor);

        MaterialCursoModel materialCursoModel = new MaterialCursoModel();
        MaterialCurso materialCurso = MaterialCurso.builder().url("http://materialcurso.com/java").build();
        materialCursoModel.create(materialCurso);

        CursoModel cursoModel = new CursoModel();
        Curso curso = Curso.builder().nome("Java para Iniciantes").sigla("SLP").professor(professor).materialCurso(materialCurso).build();
        cursoModel.create(curso);

        AlunoModel alunoModel = new AlunoModel();
        Aluno aluno = Aluno.builder().nomeCompleto("João da Silva").matricula("20231234").nascimento(new Date()).email("joao.silva@email.com").telefone(telefone).endereco(endereco).curso(curso).build();
        alunoModel.create(aluno);


    }
}
