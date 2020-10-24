package br.com.alura;

import android.app.Application;

import br.com.alura.dao.AlunoDAO;
import br.com.alura.model.Aluno;

public class AgendaApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salvar(new Aluno("Marcos","123","marcos@ufv.br"));
        dao.salvar(new Aluno("Juliana","321","juliana@ufv.br"));
    }
}
