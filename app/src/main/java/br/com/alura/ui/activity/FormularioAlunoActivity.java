package br.com.alura.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.alura.R;
import br.com.alura.dao.AlunoDAO;
import br.com.alura.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        final AlunoDAO dao = new AlunoDAO();
        final EditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        final EditText campoEmail = findViewById(R.id.activity_formulario_aluno_email);

        Button botoaSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        botoaSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();
                Aluno alunoCriado = new Aluno(nome, telefone, email);
                dao.salvar(alunoCriado);
                startActivity(new Intent(FormularioAlunoActivity.this,
                        ListaAlunosActivity.class)); //De onde estou para onde quero ir
            }
        });
    }
}