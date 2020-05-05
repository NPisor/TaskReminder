package com.example.taskreminder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class SelectPage extends AppCompatActivity {

    final TextView[] addedItems = new TextView[10];
    private Button submitbutton;
    TextInputEditText task;
    Button delete;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_page);
        getSupportActionBar().hide();
        submitbutton = findViewById(R.id.submitbutton);
        delete = findViewById(R.id.button);
        task = findViewById(R.id.addTask);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i != 10) {
                    addedItems[i].setText(task.getText());
                    task.setText("");
                    i++;
                }
                else{
                    Toast.makeText(SelectPage.this, "Only 10 tasks can fit, select a task to overwrite", Toast.LENGTH_LONG).show();
                    i = 10;
                }

            }
        });


        addedItems[0] = findViewById(R.id.addedItem1);
        addedItems[1] = findViewById(R.id.addedItem2);
        addedItems[2] = findViewById(R.id.addedItem3);
        addedItems[3] = findViewById(R.id.addedItem4);
        addedItems[4] = findViewById(R.id.addedItem5);
        addedItems[5] = findViewById(R.id.addedItem6);
        addedItems[6] = findViewById(R.id.addedItem7);
        addedItems[7] = findViewById(R.id.addedItem8);
        addedItems[8] = findViewById(R.id.addedItem9);
        addedItems[9] = findViewById(R.id.addedItem10);

        for(int y = 0; y <= 9; y++){
            final int finalY = y;
            addedItems[y].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i = finalY;
                }
            });
        }
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addedItems[i].setText("");
            }
        });
    }


}
