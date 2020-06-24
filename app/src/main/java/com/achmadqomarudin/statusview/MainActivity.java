package com.achmadqomarudin.statusview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import iammert.com.library.Status;
import iammert.com.library.StatusView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button complete, error, loading, idle;
    StatusView statusView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setView();
        setOnClick();
    }

    private void setView() {
        statusView  = findViewById(R.id.status);
        complete    = findViewById(R.id.complete);
        error       = findViewById(R.id.error);
        loading     = findViewById(R.id.loading);
        idle        = findViewById(R.id.idle);
    }

    private void setOnClick() {
        complete.setOnClickListener(this);
        error.setOnClickListener(this);
        loading.setOnClickListener(this);
        idle.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.complete:
                statusView.setStatus(Status.COMPLETE);
                break;
            case R.id.error:
                statusView.setStatus(Status.ERROR);
                break;
            case R.id.loading:
                statusView.setStatus(Status.LOADING);
                break;
            case R.id.idle:
                statusView.setStatus(Status.IDLE);
                break;
        }
    }
}
