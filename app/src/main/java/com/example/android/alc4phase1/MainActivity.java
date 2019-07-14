package com.example.android.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn, btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initListeners();
    }

    private void initListeners() {

        btn.setOnClickListener(this);
        btn_1.setOnClickListener(this);
    }

    private void init() {

        btn = findViewById(R.id.about);
        btn_1 = findViewById(R.id.profile);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.about:
                loadWebPage();
                break;

            case R.id.profile:
                loadProfilePage();
        }
    }

    public void loadProfilePage() {

        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void loadWebPage() {

        Intent intent = new Intent(this, WebActivity.class);
        startActivity(intent);
    }
}
