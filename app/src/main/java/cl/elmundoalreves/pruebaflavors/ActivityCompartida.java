package cl.elmundoalreves.pruebaflavors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityCompartida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartida);

        TextView texto = (TextView) findViewById(R.id.texto);

        if (BuildConfig.FLAVOR.equals("rojo")){
            texto.setText(getString(R.string.URL));
        }

        if (BuildConfig.LOG){
            System.out.println("texto = " + texto);
        }
    }
}
