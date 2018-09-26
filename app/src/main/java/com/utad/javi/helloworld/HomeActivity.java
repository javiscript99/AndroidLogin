package com.utad.javi.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private EditText email;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        email = findViewById(R.id.emaill);
        pass = findViewById(R.id.passw);

        email.setText("javipascual1999@gmial.com");

        String emaill = email.getText().toString();
        String passw = pass.getText().toString();

    }

    public void onLoginAction(View view) {
        Toast.makeText(this,
                        "On login pressed",
                        Toast.LENGTH_SHORT).show();
    }

}
