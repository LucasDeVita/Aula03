package br.usjt.aula03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/**
 * Created by Lucas De Vita on 24/03/2018.
 */

public class MainActivity extends AppCompatActivity {

    Spinner spinnerContinente;
    public static final String CHAVE = "br.usjt.aula03.CONTINENTE";
    String continente = "Todos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerContinente = (Spinner) findViewById(R.id.spinnerContinente);
        spinnerContinente.setOnItemSelectedListener(new PaisSelecionado());

    }
    public void listarPaises(View view){
        Intent intent = new Intent(this, ListarPaisesActivity.class);

        intent.putExtra(CHAVE, continente);
        startActivity(intent);
    }

    private class PaisSelecionado implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            continente = (String) parent.getItemAtPosition(position);
        }


        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

}
