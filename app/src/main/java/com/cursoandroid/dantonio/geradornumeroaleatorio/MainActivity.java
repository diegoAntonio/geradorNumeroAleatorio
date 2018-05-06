package com.cursoandroid.dantonio.geradornumeroaleatorio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button playBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.playBtn = (Button) findViewById(R.id.botaoJogar);


        this.playBtn.setOnClickListener(new View.OnClickListener() {
            private TextView textField;

            @Override
            public void onClick(View v) {
                Random random = new Random();
                int numeroRandomico = random.nextInt(10);
                this.textField = (TextView) findViewById(R.id.resultTextField);
                this.textField.setText("O numero é: " +  numeroRandomico);
            }
        });

    }
}
