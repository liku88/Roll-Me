package com.example.liku_dice_roller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
 public ImageView imageView;
 public ImageView imageViewdice;
 public Random random = new Random();
 Button button1;
 Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView1);
        imageViewdice = findViewById(R.id.imageView2);
        button1 = findViewById(R.id.player1);
        button2 = findViewById(R.id.player2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumber1 = random.nextInt(6)+1;
                switch(randomNumber1){
                    case 1:
                        imageView.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.dice6);
                        break;

                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumber2 = random.nextInt(6)+1;
                switch(randomNumber2){
                    case 1:
                        imageViewdice.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        imageViewdice.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        imageViewdice.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        imageViewdice.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        imageViewdice.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        imageViewdice.setImageResource(R.drawable.dice6);
                        break;

                }
                
            }
        });

    }


}
