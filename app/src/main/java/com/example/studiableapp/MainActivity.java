package com.example.studiableapp;

import android.media.Image;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.content.Context;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button button35Click;
    Button button36Click;
    Button button33Click;
    Button button34Click;
    Button button32Click;
    Button button31Click;
    Button button29Click;
    Button button30Click;
    Button button27Click;
    Button button28Click;
    Button button25Click;
    Button button26Click;
    Button button18Click;
    Button button19Click;
    Button button22Click;
    Button button21Click;
    EditText editText11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        ImageView addFlashCardSet = findViewById(R.id.imageView);
        button35Click = findViewById(R.id.button35);
        button36Click = findViewById(R.id.button36);
        button33Click = findViewById(R.id.button33);
        button34Click = findViewById(R.id.button34);
        button32Click = findViewById(R.id.button32);
        button31Click = findViewById(R.id.button31);
        button29Click = findViewById(R.id.button29);
        button30Click = findViewById(R.id.button30);
        button27Click = findViewById(R.id.button27);
        button28Click = findViewById(R.id.button28);
        button25Click = findViewById(R.id.button25);
        button26Click = findViewById(R.id.button26);
        button18Click = findViewById(R.id.button18);
        button19Click = findViewById(R.id.button19);
        button22Click = findViewById(R.id.button22);
        button21Click = findViewById(R.id.button21);

        editText11 = findViewById(R.id.editText11);

        button35Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText11.setVisibility(View.VISIBLE);
                button35Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText11.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button35Click.setText(editText11.getText());
                        button35Click.setVisibility(View.VISIBLE);
                        editText11.setVisibility(View.INVISIBLE);
                        return true;
                    }
                }

                return false;
            }
        });

        addFlashCardSet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( button35Click.getVisibility() != View.VISIBLE ) {
                    button35Click.setVisibility(View.VISIBLE);
                } else if ( button35Click.getVisibility() == View.VISIBLE ) {
                    if ( button36Click.getVisibility() != View.VISIBLE ) {
                        button36Click.setVisibility(View.VISIBLE);
                    }
                    else if ( button36Click.getVisibility() == View.VISIBLE ) {
                        if ( button33Click.getVisibility() != View.VISIBLE ) {
                            button33Click.setVisibility(View.VISIBLE);
                        } else if (button33Click.getVisibility() == View.VISIBLE) {
                            if (button34Click.getVisibility() != View.VISIBLE) {
                                button34Click.setVisibility(View.VISIBLE);
                            } else if ( button34Click.getVisibility() == View.VISIBLE) {
                                if ( button32Click.getVisibility() != View.VISIBLE ) {
                                    button32Click.setVisibility(View.VISIBLE);
                                }
                                else if ( button32Click.getVisibility() == View.VISIBLE ) {
                                    if ( button31Click.getVisibility() != View.VISIBLE ) {
                                        button31Click.setVisibility(View.VISIBLE);
                                    }
                                    else if ( button31Click.getVisibility() == View.VISIBLE ) {
                                        if ( button29Click.getVisibility() != View.VISIBLE ) {
                                            button29Click.setVisibility(View.VISIBLE);
                                        }
                                        else if ( button29Click.getVisibility() == View.VISIBLE ) {
                                            if ( button30Click.getVisibility() != View.VISIBLE ) {
                                                button30Click.setVisibility(View.VISIBLE);
                                            }
                                            else if ( button30Click.getVisibility() == View.VISIBLE ) {
                                                if ( button27Click.getVisibility() != View.VISIBLE ) {
                                                    button27Click.setVisibility(View.VISIBLE);
                                                }
                                                else if ( button27Click.getVisibility() == View.VISIBLE ) {
                                                    if ( button28Click.getVisibility() != View.VISIBLE ) {
                                                        button28Click.setVisibility(View.VISIBLE);
                                                    }
                                                    else if ( button28Click.getVisibility() == View.VISIBLE ) {
                                                        if ( button25Click.getVisibility() != View.VISIBLE ) {
                                                            button25Click.setVisibility(View.VISIBLE);
                                                        }
                                                        else if ( button25Click.getVisibility() == View.VISIBLE ) {
                                                            if ( button26Click.getVisibility() != View.VISIBLE ) {
                                                                button26Click.setVisibility(View.VISIBLE);
                                                            }
                                                            else if ( button26Click.getVisibility() == View.VISIBLE ) {
                                                                if ( button18Click.getVisibility() != View.VISIBLE ) {
                                                                    button18Click.setVisibility(View.VISIBLE);
                                                                }
                                                                else if ( button18Click.getVisibility() == View.VISIBLE ) {
                                                                    if ( button19Click.getVisibility() != View.VISIBLE ) {
                                                                        button19Click.setVisibility(View.VISIBLE);
                                                                    }
                                                                    else if ( button19Click.getVisibility() == View.VISIBLE ) {
                                                                        if ( button22Click.getVisibility() != View.VISIBLE ) {
                                                                            button22Click.setVisibility(View.VISIBLE);
                                                                        }
                                                                        else if ( button22Click.getVisibility() == View.VISIBLE ) {
                                                                            if ( button21Click.getVisibility() != View.VISIBLE ) {
                                                                                button21Click.setVisibility(View.VISIBLE);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
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
