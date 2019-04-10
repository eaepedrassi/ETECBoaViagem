package br.com.etechoracio.etec_boaviagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onSelecionarOpoao(View view) {
        Toast aviso1 = Toast.makeText(this, "Em desenvolvimento...", Toast.LENGTH_SHORT);
        switch (view.getId()) {
            case R.id.viewNovaViagem:
                Intent intnovaviagem = new Intent(this, ViagemActivity.class);
                startActivity(intnovaviagem);
            case R.id.viewNovoGasto:
                Intent intnovogasto = new Intent(this, GastoActivity.class);
                startActivity(intnovogasto);
            case R.id.viewConfig:
                aviso1.show();
            case R.id.viewMinhasViagens:
                aviso1.show();
        }
    }
}
