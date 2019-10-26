package com.example.studiableapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.content.Context;






public class MainActivity extends AppCompatActivity implements OnClickListener{

    //Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


        /*button = (Button)findViewById(R.id.button35);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                *//*
                 * Intent is just like glue which helps to navigate one activity
                 * to another.
                 *//*Intent intent = new Intent(MainActivity.this,
                        MainActivity2.class);
                startActivity(intent); // startActivity allow you to move
            }
        });*/
    }

    public void addListenerOnButton() {



        Button button35 = findViewById(R.id.button35);
        Button button36 = findViewById(R.id.button31);
        Button button18 = findViewById(R.id.button18);



        button35.setOnClickListener(this);
        button36.setOnClickListener(this);
        button18.setOnClickListener(this); /*{
/*{

/*{

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, MainActivity2.class);
                startActivity(intent);

            }

        });*/

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
