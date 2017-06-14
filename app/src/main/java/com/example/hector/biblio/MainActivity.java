package com.example.hector.biblio;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


//startActivity(new Intent(this, InsertaPlatoActivity.class));


public class MainActivity extends AppCompatActivity {

    private BibliotecaController controlador;
    private Activity main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main=this;
        setContentView(R.layout.activity_main);
        controlador=new BibliotecaController(this);

        Button login= (Button) findViewById(R.id.buttonLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editUser = (EditText) findViewById(R.id.editUser);
                EditText editPass = (EditText) findViewById(R.id.editPass);
                int id = controlador.autentificaUsuario(editUser.toString(), editPass.toString());
                if (id!=0){
                    startActivity(new Intent(main, WellcomeActivity.class));
                }

            }
        });

        TextView signUp=(TextView) findViewById(R.id.textSignUp);
        signUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(main, NewUserActivity.class));
            }

        });
    }
}
