package com.example.rodrigobarbosa.rxteste;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import rx.Observer;


public class MainActivity extends AppCompatActivity {

    private Button btTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btTeste = (Button) findViewById(R.id.btTeste);

        btTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Processo p = new Processo(new Observer<Objeto>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Objeto objeto) {
                        Toast.makeText(MainActivity.this, objeto.getNome() + " " + objeto.getEndereco(), Toast.LENGTH_LONG).show();
                    }
                });
                p.executa();

            }
        });
    }
}
