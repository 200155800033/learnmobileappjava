package com.example.eduapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;  // Import the Log class
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";  // Add a tag for logging

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView forgotPassword = findViewById(R.id.forgotPassword);
        Button loginButton = findViewById(R.id.logbtn);


        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Forgot Password clicked");
                Intent intent = new Intent(LoginActivity.this, ForgetPasswordActivity.class);
                startActivity(intent);
            }
        });


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Login button clicked");

                try {

                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);

                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                    startActivity(intent);

                    finish();
                } catch (Exception e) {
                    Log.e(TAG, "Error navigating to HomeActivity", e);
                }
            }
        });
    }
}
