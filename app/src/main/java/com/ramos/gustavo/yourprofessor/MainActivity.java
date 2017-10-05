package com.ramos.gustavo.yourprofessor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    void checkLogin() {
        EditText txtLogin = (EditText)findViewById(R.id.loginField);
        EditText txtPassword = (EditText)findViewById(R.id.passwordField);

        if(txtLogin.getText().length() > 0 && txtPassword.getText().length() > 0) {
            
        }
    }
}
