package com.example.taskreminder;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import pl.droidsonroids.gif.GifImageView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ImageButton startButton = findViewById(R.id.startbutton);
        ImageButton creditsButton = findViewById(R.id.creditsbutton);
        final GifImageView checkmark = findViewById(R.id.checkmark);
        final GifImageView checkmark2 = findViewById(R.id.checkmark2);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkmark.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        SelectPage();
                        checkmark.setVisibility(View.INVISIBLE);
                    }
                }, 2000);
            }
        });
        creditsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkmark2.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        CreditsPage();
                        checkmark2.setVisibility(View.INVISIBLE);
                    }
                }, 2000);
            }
        });
    }
    public void SelectPage(){
        Intent intent = new Intent(this, SelectPage.class);
        startActivity(intent);
    }

    public void CreditsPage(){
        Intent intent = new Intent(this, CreditsPage.class);
        startActivity(intent);
    }
}
