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


public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button button35Click;
    Button button36Click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        ImageView addFlashCardSet = findViewById(R.id.imageView);
        button35Click = findViewById(R.id.button35);
        button36Click = findViewById(R.id.button36);


        addFlashCardSet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                //Hiding sample button.
                //button35Click.setVisibility(View.VISIBLE);

                if ( button35Click.getVisibility() != View.VISIBLE ) {
                    button35Click.setVisibility(View.VISIBLE);
                } else if ( button35Click.getVisibility() == View.VISIBLE ) {
                    button36Click.setVisibility(View.VISIBLE);
                }

            }

        });
    }

    public void addListenerOnButton() {
        Button button35 = findViewById(R.id.button35);
        Button button36 = findViewById(R.id.button31);
        Button button18 = findViewById(R.id.button18);
        button35.setOnClickListener(this);
        button36.setOnClickListener(this);
        button18.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        //final Context context = this;
        switch(v.getId()) {
            //case R.id.imageView:
              //  button35.setVisibility(View.VISIBLE);
                //break;
            case R.id.button35:
                Intent intent35 = new Intent(this, MainActivity2.class);
                startActivity(intent35);
                break;
            case R.id.button31:
                Intent intent31 = new Intent(this, MainActivity31.class);
                startActivity(intent31);
                break;
            case R.id.button18:
                Intent intent18 = new Intent(this, MainActivity18.class);
                startActivity(intent18);
                break;
        }
    }
}
