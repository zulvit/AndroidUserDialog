package com.example.userdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     * Пример
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showSimpleDialogBtn = findViewById(R.id.simple_dialog_btn);
        Button showStandardDialogBtn = findViewById(R.id.standard_dialog_btn);
        Button showListDialogBtn = findViewById(R.id.list_dialog_btn);
        Button showCustomDialogBtn = findViewById(R.id.custom_dialog_btn);
        showSimpleDialogBtn.setOnClickListener(this);
        showStandardDialogBtn.setOnClickListener(this);
        showListDialogBtn.setOnClickListener(this);
        showCustomDialogBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.simple_dialog_btn:
                new SimpleDialog().show(getSupportFragmentManager(), "Custom");
                break;
            case R.id.standard_dialog_btn:
                new StandardDialog().show(getSupportFragmentManager(), "Custom1");
                break;
            case R.id.list_dialog_btn:
                new ListDialog().show(getSupportFragmentManager(), "Custom2");
                break;
            case R.id.custom_dialog_btn:
                new CustomDialog().show(getSupportFragmentManager(), "Custom3");
                break;
        }
    }
}