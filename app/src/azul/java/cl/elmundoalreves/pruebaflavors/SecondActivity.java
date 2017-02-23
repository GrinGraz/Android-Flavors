package cl.elmundoalreves.pruebaflavors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.texto);
        Button button = (Button) findViewById(R.id.button);

        textView.setText("texto para azul dinamico");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ActivityCompartida.class));
            }
        });

        getSupportActionBar().setTitle("Segunda actividad azul");
    }
}
