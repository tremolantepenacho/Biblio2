package com.example.hector.biblio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by hector on 15/06/17.
 */

public class NewUserActivity extends AppCompatActivity {

    private BibliotecaController controlador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

       // controlador=(BibliotecaController) getIntent().getExtras().getSerializable("controlador");
    //controlador.mensaje();
/*
        Button enviar= (Button) findViewById(R.id.buttonEnviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editUser = (EditText) findViewById(R.id.editUser);
                EditText editPass = (EditText) findViewById(R.id.editPass);
                int id = controlador.authenticateUser(editUser.toString(), editPass.toString());
                if (id!=0){
                    startActivity(new Intent(main, WellcomeActivity.class));
                }

            }
        });*/
    }
}
