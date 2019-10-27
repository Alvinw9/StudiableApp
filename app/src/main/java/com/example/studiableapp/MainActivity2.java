package com.example.studiableapp;

import android.media.Image;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Layout;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.content.Context;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity /*implements OnClickListener*/ {

    /*LinearLayout linLay0Click;
    TextView editText4Click;*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flashcards_content);
        /*addListenerOnButton();
        ImageView addCardText = findViewById(R.id.imageView);

        linLay0Click = findViewById(R.id.LinLay0);

        addCardText.setOnClickListener(new View.OnClickListener()) {
            @Override
            public void onClick (View v){
                if (editText4Click.getVisibility() != View.VISIBLE) {
                    editText4Click.setVisibility(View.VISIBLE);
                } else {
                    editText4Click.setVisibility(View.VISIBLE)
                }
            }
        }*/
    }

    /*public void addListenerOnButton() {
        LinearLayout linLayout0Click = findViewById(R.id.LinLay0);
    }*/
}
