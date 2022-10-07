package com.example.greenplantationmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Input extends AppCompatActivity {
    private Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        sub = (Button)findViewById(R.id.submit);
        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Input.this, Info.class));
            }
        });

    }
}