package com.seniluz.aulaexpositiva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Agenda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
    }

    public void btnVoltar(View v){

        this.finish();
    }

    public void abrirTelaConsultaAgenda(View v){
        Intent telaConsultaAgenda = new Intent(this, ConsultaAgenda.class);
        startActivity(telaConsultaAgenda);
    }
}