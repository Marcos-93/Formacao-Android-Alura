package br.com.alura.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.model.Aluno;

public class AlunoDAO {
    private final static List<Aluno> alunos = new ArrayList<>();

    public void salvar(Aluno aluno) {
        alunos.add(aluno);
    }
    public List<Aluno> todos(){
        return Collections.unmodifiableList(alunos);
//        return new ArrayList<>(alunos);
    }
}
