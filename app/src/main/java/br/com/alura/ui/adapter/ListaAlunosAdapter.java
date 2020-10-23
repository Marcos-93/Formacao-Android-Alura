package br.com.alura.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.R;
import br.com.alura.model.Aluno;

public class ListaAlunosAdapter extends BaseAdapter {

    private final List<Aluno> alunos = new ArrayList<>();
    private Context context;

    public ListaAlunosAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return alunos.size();
    }

    @Override
    public Aluno getItem(int position) {
        return alunos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return alunos.get(position).getId();
    }


    public void clear() {
        this.alunos.clear();
    }

    public void addAll(List<Aluno> alunos) {
        this.alunos.addAll(alunos);
    }

    public void remove(Aluno aluno) {
        this.alunos.remove(aluno);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewCriada = LayoutInflater
                .from(context)
                .inflate(R.layout.item_aluno, parent,false);
        Aluno aluno = getItem(position);
        TextView tNome = viewCriada.findViewById(R.id.item_aluno_nome);
        tNome.setText(aluno.getNome());
        TextView tTelefone = viewCriada.findViewById(R.id.item_aluno_telefone);
        tTelefone.setText(aluno.getTelefone());
        return viewCriada;
    }
}
