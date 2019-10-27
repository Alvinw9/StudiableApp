package com.example.studiableapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView text3Click;
    TextView text4Click;
    TextView text9Click;
    TextView text10Click;
    TextView text7Click;
    TextView text8Click;
    TextView text5Click;
    TextView text6Click;
    TextView textClick;
    TextView text2Click;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flashcards_content);

        ImageView addFlashCard = findViewById(R.id.imageView3);

        text3Click = findViewById(R.id.editText3);
        text4Click = findViewById(R.id.editText4);
        text9Click = findViewById(R.id.editText9);
        text10Click = findViewById(R.id.editText10);
        text7Click = findViewById(R.id.editText7);
        text8Click = findViewById(R.id.editText8);
        text5Click = findViewById(R.id.editText5);
        text6Click = findViewById(R.id.editText6);
        textClick = findViewById(R.id.editText);
        text2Click = findViewById(R.id.editText2);

        addFlashCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( text3Click.getVisibility() != View.VISIBLE ) {
                    text3Click.setVisibility(View.VISIBLE);
                    text4Click.setVisibility(View.VISIBLE);
                } else if ( text3Click.getVisibility() == View.VISIBLE ) {
                    if ( text9Click.getVisibility() != View.VISIBLE ) {
                        text9Click.setVisibility(View.VISIBLE);
                        text10Click.setVisibility(View.VISIBLE);
                    } else if ( text9Click.getVisibility() == View.VISIBLE ) {
                        if ( text7Click.getVisibility() != View.VISIBLE ) {
                            text7Click.setVisibility(View.VISIBLE);
                            text8Click.setVisibility(View.VISIBLE);
                        } else if ( text7Click.getVisibility() == View.VISIBLE ) {
                            if ( text5Click.getVisibility() != View.VISIBLE ) {
                                text5Click.setVisibility(View.VISIBLE);
                                text6Click.setVisibility(View.VISIBLE);
                            } else if ( text5Click.getVisibility() == View.VISIBLE ) {
                                if ( textClick.getVisibility() != View.VISIBLE ) {
                                    textClick.setVisibility(View.VISIBLE);
                                    text2Click.setVisibility(View.VISIBLE);
                                }
                            }
                        }
                    }
                }

            }

        });

    }

}
