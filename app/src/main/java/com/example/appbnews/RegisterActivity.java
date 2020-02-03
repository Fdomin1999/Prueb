package com.example.appbnews;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class RegisterActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);

            Button botonRegistrar = findViewById(R.id.register);

            botonRegistrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(RegisterActivity.this, MenuActivity.class);
                    startActivity(intent);
//                EditText editTextUserName = findViewById(R.id.user_name);
//                EditText editTextUserEmail = findViewById(R.id.user_email);
//                EditText editTextUserPhone = findViewById(R.id.user_phone);
//                EditText editTextUserPassword = findViewById(R.id.user_password);


                }
            });
        }
    }

