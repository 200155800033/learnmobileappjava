package com.example.eduapp;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EbooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebooks);


        View mainView = findViewById(R.id.main);

        if (mainView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(mainView, (view, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());

                view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        } else {
            throw new NullPointerException("Main view not found in layout. Make sure the ID is correct.");
        }
    }
}
