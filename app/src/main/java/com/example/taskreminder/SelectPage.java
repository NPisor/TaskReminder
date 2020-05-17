package com.example.taskreminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class SelectPage extends AppCompatActivity {

    private Button notifButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_page);
        getSupportActionBar().hide();
        notifButton = findViewById(R.id.reminderbutton);
        notifButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remindPage();
            }
        });
    }


    public void remindPage(){
        Intent intent = new Intent(this, remindPage.class);
        startActivity(intent);
    }

}
