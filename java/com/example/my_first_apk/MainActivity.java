package com.example.my_first_apk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView Login, Parol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        Login = (TextView) findViewById(R.id.login);
        Parol = (TextView) findViewById(R.id.parol);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TLogin, TParol;
                TLogin = Login.getText().toString();
                TParol = Parol.getText().toString();
                if(TLogin.equals("login")
                        && TParol.equals("parol")){
                    Intent intent = new Intent(getApplicationContext(), Second.class);
                    startActivity(intent);
                }
                else
                    if(!TLogin.equals("login") && !TParol.equals("parol"))
                        Toast.makeText(getApplicationContext(), "Login va Parol xato!!!", Toast.LENGTH_LONG).show();
                else
                    if(!TLogin.equals("login"))
                        Toast.makeText(getApplicationContext(), "Login xato!!!", Toast.LENGTH_LONG).show();
                else
                    if(!TParol.equals("parol"))
                        Toast.makeText(getApplicationContext(), "Parol xato!!!", Toast.LENGTH_LONG).show();

            }
        });
    }

}
