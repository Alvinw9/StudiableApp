package com.example.studiableapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity18 extends AppCompatActivity {

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

    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;
    Switch switch5;

    LinearLayout linearLayout1;
    LinearLayout linearLayout2;
    LinearLayout linearLayout3;
    LinearLayout linearLayout4;
    LinearLayout linearLayout5;

    TextView textView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flashcards_content);

        ImageView addFlashCard = findViewById(R.id.imageView3);

        textView = findViewById(R.id.textView);
        textView.setText(MainActivity.button35Click.getText());

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

        switch1 = findViewById(R.id.switch1);
        switch2 = findViewById(R.id.switch2);
        switch3 = findViewById(R.id.switch3);
        switch4 = findViewById(R.id.switch4);
        switch5 = findViewById(R.id.switch5);

        linearLayout1 = findViewById(R.id.LinearLayout1);
        linearLayout2 = findViewById(R.id.LinearLayout2);
        linearLayout3 = findViewById(R.id.LinearLayout3);
        linearLayout4 = findViewById(R.id.LinearLayout4);
        linearLayout5 = findViewById(R.id.LinearLayout5);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) {
                    switch1.setText("Hide");
                    text4Click.setVisibility(View.INVISIBLE);
                } else {
                    switch1.setText("Show");
                    text4Click.setVisibility(View.VISIBLE);
                }
            }
        });

        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) {
                    switch2.setText("Hide");
                    text10Click.setVisibility(View.INVISIBLE);
                } else {
                    switch2.setText("Show");
                    text10Click.setVisibility(View.VISIBLE);
                }
            }
        });

        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) {
                    switch3.setText("Hide");
                    text8Click.setVisibility(View.INVISIBLE);
                } else {
                    switch3.setText("Show");
                    text8Click.setVisibility(View.VISIBLE);
                }
            }
        });

        switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) {
                    switch4.setText("Hide");
                    text6Click.setVisibility(View.INVISIBLE);
                } else {
                    switch4.setText("Show");
                    text6Click.setVisibility(View.VISIBLE);
                }
            }
        });

        switch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) {
                    switch5.setText("Hide");
                    text2Click.setVisibility(View.INVISIBLE);
                } else {
                    switch5.setText("Show");
                    text2Click.setVisibility(View.VISIBLE);
                }
            }
        });

        addFlashCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if ( text3Click.getVisibility() != View.VISIBLE ) {
                    text3Click.setVisibility(View.VISIBLE);
                    text4Click.setVisibility(View.VISIBLE);
                    linearLayout1.setVisibility(View.VISIBLE);
                    switch1.setVisibility(View.VISIBLE);
                } else if ( text3Click.getVisibility() == View.VISIBLE ) {
                    if ( text9Click.getVisibility() != View.VISIBLE ) {
                        text9Click.setVisibility(View.VISIBLE);
                        text10Click.setVisibility(View.VISIBLE);
                        linearLayout2.setVisibility(View.VISIBLE);
                        switch2.setVisibility(View.VISIBLE);
                    } else if ( text9Click.getVisibility() == View.VISIBLE ) {
                        if ( text7Click.getVisibility() != View.VISIBLE ) {
                            text7Click.setVisibility(View.VISIBLE);
                            text8Click.setVisibility(View.VISIBLE);
                            linearLayout3.setVisibility(View.VISIBLE);
                            switch3.setVisibility(View.VISIBLE);
                        } else if ( text7Click.getVisibility() == View.VISIBLE ) {
                            if ( text5Click.getVisibility() != View.VISIBLE ) {
                                text5Click.setVisibility(View.VISIBLE);
                                text6Click.setVisibility(View.VISIBLE);
                                linearLayout4.setVisibility(View.VISIBLE);
                                switch4.setVisibility(View.VISIBLE);
                            } else if ( text5Click.getVisibility() == View.VISIBLE ) {
                                if ( textClick.getVisibility() != View.VISIBLE ) {
                                    textClick.setVisibility(View.VISIBLE);
                                    text2Click.setVisibility(View.VISIBLE);
                                    linearLayout5.setVisibility(View.VISIBLE);
                                    switch5.setVisibility(View.VISIBLE);
                                }
                            }
                        }
                    }
                }
                saveData2();
            }

        });
    }

    private void saveData2() {
        SharedPreferences sp = getSharedPreferences("Flashcards2", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("text3", text3Click.getText().toString());
        editor.putInt("text3b", text3Click.getVisibility());
        editor.putString("text4", text4Click.getText().toString());
        editor.putInt("text4b", text4Click.getVisibility());
        editor.putString("text9", text9Click.getText().toString());
        editor.putInt("text9b", text9Click.getVisibility());
        editor.putString("text10", text10Click.getText().toString());
        editor.putInt("text10b", text10Click.getVisibility());
        editor.putString("text7", text7Click.getText().toString());
        editor.putInt("text7b", text7Click.getVisibility());
        editor.putString("text8", text8Click.getText().toString());
        editor.putInt("text8b", text8Click.getVisibility());
        editor.putString("text5", text5Click.getText().toString());
        editor.putInt("text5b", text5Click.getVisibility());
        editor.putString("text6", text6Click.getText().toString());
        editor.putInt("text6b", text6Click.getVisibility());
        editor.putString("text", textClick.getText().toString());
        editor.putInt("textb", textClick.getVisibility());
        editor.putString("text2", text2Click.getText().toString());
        editor.putInt("text2b", text2Click.getVisibility());
        editor.putInt("Layout2", linearLayout2.getVisibility());
        editor.putInt("Layout3", linearLayout3.getVisibility());
        editor.putInt("Layout4", linearLayout4.getVisibility());
        editor.putInt("Layout5", linearLayout5.getVisibility());
        editor.putInt("switch2", switch2.getVisibility());
        editor.putInt("switch3", switch3.getVisibility());
        editor.putInt("switch4", switch4.getVisibility());
        editor.putInt("switch5", switch5.getVisibility());
        editor.apply();
    }

    private void loadData2() {
        SharedPreferences sp = getSharedPreferences("Flashcards2", Context.MODE_PRIVATE);
        text3Click.setText(sp.getString("text3", text3Click.getText().toString()));
        text3Click.setVisibility(sp.getInt("text3b", text3Click.getVisibility()));
        text4Click.setText(sp.getString("text4", text4Click.getText().toString()));
        text4Click.setVisibility(sp.getInt("text4b", text4Click.getVisibility()));
        text9Click.setText(sp.getString("text9", text9Click.getText().toString()));
        text9Click.setVisibility(sp.getInt("text9b", text9Click.getVisibility()));
        text10Click.setText(sp.getString("text10", text10Click.getText().toString()));
        text10Click.setVisibility(sp.getInt("text10b", text10Click.getVisibility()));
        text7Click.setText(sp.getString("text7", text7Click.getText().toString()));
        text7Click.setVisibility(sp.getInt("text7b", text7Click.getVisibility()));
        text8Click.setText(sp.getString("text8", text8Click.getText().toString()));
        text8Click.setVisibility(sp.getInt("text8b", text8Click.getVisibility()));
        text5Click.setText(sp.getString("text5", text5Click.getText().toString()));
        text5Click.setVisibility(sp.getInt("text5b", text5Click.getVisibility()));
        text6Click.setText(sp.getString("text6", text6Click.getText().toString()));
        text6Click.setVisibility(sp.getInt("text6b", text6Click.getVisibility()));
        textClick.setText(sp.getString("text", textClick.getText().toString()));
        textClick.setVisibility(sp.getInt("textb", textClick.getVisibility()));
        text2Click.setText(sp.getString("text2", text2Click.getText().toString()));
        text2Click.setVisibility(sp.getInt("text2b", text2Click.getVisibility()));
        linearLayout2.setVisibility(sp.getInt("Layout2", linearLayout2.getVisibility()));
        linearLayout3.setVisibility(sp.getInt("Layout3", linearLayout3.getVisibility()));
        linearLayout4.setVisibility(sp.getInt("Layout4", linearLayout4.getVisibility()));
        linearLayout5.setVisibility(sp.getInt("Layout5", linearLayout5.getVisibility()));
        switch2.setVisibility(sp.getInt("switch2", linearLayout2.getVisibility()));
        switch3.setVisibility(sp.getInt("switch3", linearLayout3.getVisibility()));
        switch4.setVisibility(sp.getInt("switch4", linearLayout4.getVisibility()));
        switch5.setVisibility(sp.getInt("switch5", linearLayout5.getVisibility()));
        if(text3Click.getVisibility() == View.VISIBLE) {
            text4Click.setVisibility(View.VISIBLE);
        }
        if(text9Click.getVisibility() == View.VISIBLE) {
            text10Click.setVisibility(View.VISIBLE);
        }
        if(text7Click.getVisibility() == View.VISIBLE) {
            text8Click.setVisibility(View.VISIBLE);
        }
        if(text5Click.getVisibility() == View.VISIBLE) {
            text6Click.setVisibility(View.VISIBLE);
        }
        if(textClick.getVisibility() == View.VISIBLE) {
            text2Click.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        saveData2();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadData2();
    }

}
