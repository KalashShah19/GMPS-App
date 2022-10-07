package com.example.greenplantationmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Info extends AppCompatActivity {

    private Button btn;
    private Button rec;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        btn = (Button)findViewById(R.id.check);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Info.this, Input.class));
            }
        });

        rec = (Button)findViewById(R.id.records);
        rec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Info.this, Records.class));
            }
        });

        ProgressBar n = (ProgressBar) findViewById(R.id.nitrogenpro);
        n.setProgress(70);

        ProgressBar p = (ProgressBar) findViewById(R.id.phospro);
        p.setProgress(70);

        ProgressBar k = (ProgressBar) findViewById(R.id.potpro);
        k.setProgress(70);

        ProgressBar w = (ProgressBar) findViewById(R.id.waterpro);
        w.setProgress(70);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}