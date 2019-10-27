package com.example.studiableapp;

import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.KeyEvent;
import android.text.Layout;
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
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements OnClickListener{

    public static Button button35Click;
    Button button36Click;
    Button button33Click;
    Button button34Click;
    Button button32Click;
    public static Button button31Click;
    Button button29Click;
    Button button30Click;
    Button button27Click;
    Button button28Click;
    Button button25Click;
    Button button26Click;
    public static Button button18Click;
    Button button19Click;
    Button button22Click;
    Button button21Click;
    EditText editText11;
    EditText editText14;
    EditText editText15;
    EditText editText16;
    EditText editText27;
    EditText editText28;
    EditText editText17;
    EditText editText18;
    EditText editText19;
    EditText editText20;
    EditText editText21;
    EditText editText22;
    EditText editText23;
    EditText editText24;
    EditText editText25;
    EditText editText26;

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
        editText14 = findViewById(R.id.editText14);
        editText15 = findViewById(R.id.editText15);
        editText16 = findViewById(R.id.editText16);
        editText27 = findViewById(R.id.editText27);
        editText28 = findViewById(R.id.editText28);
        editText17 = findViewById(R.id.editText17);
        editText18 = findViewById(R.id.editText18);
        editText19 = findViewById(R.id.editText19);
        editText20 = findViewById(R.id.editText20);
        editText21 = findViewById(R.id.editText21);
        editText22 = findViewById(R.id.editText22);
        editText23 = findViewById(R.id.editText23);
        editText24 = findViewById(R.id.editText24);
        editText25 = findViewById(R.id.editText25);
        editText26 = findViewById(R.id.editText26);

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
                        button35Click.setText(editText11.getText() + " ");
                        button35Click.setVisibility(View.VISIBLE);
                        editText11.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button36Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText14.setVisibility(View.VISIBLE);
                button36Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText14.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button36Click.setText(editText14.getText() + " ");
                        button36Click.setVisibility(View.VISIBLE);
                        editText14.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button33Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText15.setVisibility(View.VISIBLE);
                button33Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText15.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button33Click.setText(editText15.getText() + " ");
                        button33Click.setVisibility(View.VISIBLE);
                        editText15.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button34Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText16.setVisibility(View.VISIBLE);
                button34Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText16.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button34Click.setText(editText16.getText() + " ");
                        button34Click.setVisibility(View.VISIBLE);
                        editText16.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button32Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText27.setVisibility(View.VISIBLE);
                button32Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText27.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button32Click.setText(editText27.getText() + " ");
                        button32Click.setVisibility(View.VISIBLE);
                        editText27.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button31Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText28.setVisibility(View.VISIBLE);
                button31Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText28.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button31Click.setText(editText28.getText() + " ");
                        button31Click.setVisibility(View.VISIBLE);
                        editText28.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button29Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText17.setVisibility(View.VISIBLE);
                button29Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText17.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button29Click.setText(editText17.getText() + " ");
                        button29Click.setVisibility(View.VISIBLE);
                        editText17.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button30Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText18.setVisibility(View.VISIBLE);
                button30Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText18.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button30Click.setText(editText18.getText() + " ");
                        button30Click.setVisibility(View.VISIBLE);
                        editText18.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button27Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText19.setVisibility(View.VISIBLE);
                button27Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText19.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button27Click.setText(editText19.getText() + " ");
                        button27Click.setVisibility(View.VISIBLE);
                        editText19.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button28Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText20.setVisibility(View.VISIBLE);
                button28Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText20.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button28Click.setText(editText20.getText() + " ");
                        button28Click.setVisibility(View.VISIBLE);
                        editText20.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button25Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText21.setVisibility(View.VISIBLE);
                button25Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText21.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button25Click.setText(editText21.getText() + " ");
                        button25Click.setVisibility(View.VISIBLE);
                        editText21.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button26Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText22.setVisibility(View.VISIBLE);
                button26Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText22.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button26Click.setText(editText22.getText() + " ");
                        button26Click.setVisibility(View.VISIBLE);
                        editText22.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button18Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText23.setVisibility(View.VISIBLE);
                button18Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText23.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button18Click.setText(editText23.getText() + " ");
                        button18Click.setVisibility(View.VISIBLE);
                        editText23.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button19Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText24.setVisibility(View.VISIBLE);
                button19Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText24.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button19Click.setText(editText24.getText() + " ");
                        button19Click.setVisibility(View.VISIBLE);
                        editText24.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button22Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText25.setVisibility(View.VISIBLE);
                button22Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText25.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button22Click.setText(editText25.getText() + " ");
                        button22Click.setVisibility(View.VISIBLE);
                        editText25.setVisibility(View.INVISIBLE);
                        saveData();
                        return true;
                    }
                }

                return false;
            }
        });

        button21Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editText26.setVisibility(View.VISIBLE);
                button21Click.setVisibility(View.INVISIBLE);
                Toast.makeText(getBaseContext(), "Edit Mode", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        editText26.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ( event.getAction() == KeyEvent.ACTION_DOWN ) {
                    if ( (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) || (keyCode == KeyEvent.KEYCODE_ENTER) ) {
                        button21Click.setText(editText26.getText() + " ");
                        button21Click.setVisibility(View.VISIBLE);
                        editText26.setVisibility(View.INVISIBLE);
                        saveData();
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
                    saveData();
                } else if ( button35Click.getVisibility() == View.VISIBLE ) {
                    if ( button36Click.getVisibility() != View.VISIBLE ) {
                        button36Click.setVisibility(View.VISIBLE);
                        saveData();
                    }
                    else if ( button36Click.getVisibility() == View.VISIBLE ) {
                        if ( button33Click.getVisibility() != View.VISIBLE ) {
                            button33Click.setVisibility(View.VISIBLE);
                            saveData();
                        } else if (button33Click.getVisibility() == View.VISIBLE) {
                            if (button34Click.getVisibility() != View.VISIBLE) {
                                button34Click.setVisibility(View.VISIBLE);
                                saveData();
                            } else if ( button34Click.getVisibility() == View.VISIBLE) {
                                if ( button32Click.getVisibility() != View.VISIBLE ) {
                                    button32Click.setVisibility(View.VISIBLE);
                                    saveData();
                                }
                                else if ( button32Click.getVisibility() == View.VISIBLE ) {
                                    if ( button31Click.getVisibility() != View.VISIBLE ) {
                                        button31Click.setVisibility(View.VISIBLE);
                                        saveData();
                                    }
                                    else if ( button31Click.getVisibility() == View.VISIBLE ) {
                                        if ( button29Click.getVisibility() != View.VISIBLE ) {
                                            button29Click.setVisibility(View.VISIBLE);
                                            saveData();
                                        }
                                        else if ( button29Click.getVisibility() == View.VISIBLE ) {
                                            if ( button30Click.getVisibility() != View.VISIBLE ) {
                                                button30Click.setVisibility(View.VISIBLE);
                                                saveData();
                                            }
                                            else if ( button30Click.getVisibility() == View.VISIBLE ) {
                                                if ( button27Click.getVisibility() != View.VISIBLE ) {
                                                    button27Click.setVisibility(View.VISIBLE);
                                                    saveData();
                                                }
                                                else if ( button27Click.getVisibility() == View.VISIBLE ) {
                                                    if ( button28Click.getVisibility() != View.VISIBLE ) {
                                                        button28Click.setVisibility(View.VISIBLE);
                                                        saveData();
                                                    }
                                                    else if ( button28Click.getVisibility() == View.VISIBLE ) {
                                                        if ( button25Click.getVisibility() != View.VISIBLE ) {
                                                            button25Click.setVisibility(View.VISIBLE);
                                                            saveData();
                                                        }
                                                        else if ( button25Click.getVisibility() == View.VISIBLE ) {
                                                            if ( button26Click.getVisibility() != View.VISIBLE ) {
                                                                button26Click.setVisibility(View.VISIBLE);
                                                                saveData();
                                                            }
                                                            else if ( button26Click.getVisibility() == View.VISIBLE ) {
                                                                if ( button18Click.getVisibility() != View.VISIBLE ) {
                                                                    button18Click.setVisibility(View.VISIBLE);
                                                                    saveData();
                                                                }
                                                                else if ( button18Click.getVisibility() == View.VISIBLE ) {
                                                                    if ( button19Click.getVisibility() != View.VISIBLE ) {
                                                                        button19Click.setVisibility(View.VISIBLE);
                                                                        saveData();
                                                                    }
                                                                    else if ( button19Click.getVisibility() == View.VISIBLE ) {
                                                                        if ( button22Click.getVisibility() != View.VISIBLE ) {
                                                                            button22Click.setVisibility(View.VISIBLE);
                                                                            saveData();
                                                                        }
                                                                        else if ( button22Click.getVisibility() == View.VISIBLE ) {
                                                                            if ( button21Click.getVisibility() != View.VISIBLE ) {
                                                                                button21Click.setVisibility(View.VISIBLE);
                                                                                saveData();
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

    private void saveData() {
        SharedPreferences sp = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        editor.putString("button35text", button35Click.getText().toString());
        editor.putString("button36text", button36Click.getText().toString());
        editor.putString("button33text", button33Click.getText().toString());
        editor.putString("button34text", button34Click.getText().toString());
        editor.putString("button32text", button32Click.getText().toString());
        editor.putString("button31text", button31Click.getText().toString());
        editor.putString("button29text", button29Click.getText().toString());
        editor.putString("button30text", button30Click.getText().toString());
        editor.putString("button27text", button27Click.getText().toString());
        editor.putString("button28text", button28Click.getText().toString());
        editor.putString("button25text", button25Click.getText().toString());
        editor.putString("button26text", button26Click.getText().toString());
        editor.putString("button18text", button18Click.getText().toString());
        editor.putString("button19text", button19Click.getText().toString());
        editor.putString("button22text", button22Click.getText().toString());
        editor.putString("button21text", button21Click.getText().toString());

        editor.putInt("button35Vis", button35Click.getVisibility());
        editor.putInt("button36Vis", button36Click.getVisibility());
        editor.putInt("button33Vis", button33Click.getVisibility());
        editor.putInt("button34Vis", button34Click.getVisibility());
        editor.putInt("button32Vis", button32Click.getVisibility());
        editor.putInt("button31Vis", button31Click.getVisibility());
        editor.putInt("button29Vis", button29Click.getVisibility());
        editor.putInt("button30Vis", button30Click.getVisibility());
        editor.putInt("button27Vis", button27Click.getVisibility());
        editor.putInt("button28Vis", button28Click.getVisibility());
        editor.putInt("button25Vis", button25Click.getVisibility());
        editor.putInt("button26Vis", button26Click.getVisibility());
        editor.putInt("button18Vis", button18Click.getVisibility());
        editor.putInt("button19Vis", button19Click.getVisibility());
        editor.putInt("button22Vis", button22Click.getVisibility());
        editor.putInt("button21Vis", button21Click.getVisibility());
        editor.apply();
    }

    private void loadData() {
        SharedPreferences sp = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        button35Click.setText(sp.getString("button35text",button35Click.getText().toString()));
        button36Click.setText(sp.getString("button36text",button36Click.getText().toString()));
        button33Click.setText(sp.getString("button33text",button33Click.getText().toString()));
        button34Click.setText(sp.getString("button34text",button34Click.getText().toString()));
        button32Click.setText(sp.getString("button32text",button32Click.getText().toString()));
        button31Click.setText(sp.getString("button31text",button31Click.getText().toString()));
        button29Click.setText(sp.getString("button29text",button29Click.getText().toString()));
        button30Click.setText(sp.getString("button30text",button30Click.getText().toString()));
        button27Click.setText(sp.getString("button27text",button27Click.getText().toString()));
        button28Click.setText(sp.getString("button28text",button28Click.getText().toString()));
        button25Click.setText(sp.getString("button25text",button25Click.getText().toString()));
        button26Click.setText(sp.getString("button26text",button26Click.getText().toString()));
        button18Click.setText(sp.getString("button18text",button18Click.getText().toString()));
        button19Click.setText(sp.getString("button19text",button19Click.getText().toString()));
        button22Click.setText(sp.getString("button22text",button22Click.getText().toString()));
        button21Click.setText(sp.getString("button21text",button21Click.getText().toString()));

        button35Click.setVisibility(sp.getInt("button35Vis",button35Click.getVisibility()));
        button36Click.setVisibility(sp.getInt("button36Vis",button36Click.getVisibility()));
        button33Click.setVisibility(sp.getInt("button33Vis",button33Click.getVisibility()));
        button34Click.setVisibility(sp.getInt("button34Vis",button34Click.getVisibility()));
        button32Click.setVisibility(sp.getInt("button32Vis",button32Click.getVisibility()));
        button31Click.setVisibility(sp.getInt("button31Vis",button31Click.getVisibility()));
        button29Click.setVisibility(sp.getInt("button29Vis",button29Click.getVisibility()));
        button30Click.setVisibility(sp.getInt("button30Vis",button30Click.getVisibility()));
        button27Click.setVisibility(sp.getInt("button27Vis",button27Click.getVisibility()));
        button28Click.setVisibility(sp.getInt("button28Vis",button28Click.getVisibility()));
        button25Click.setVisibility(sp.getInt("button25Vis",button25Click.getVisibility()));
        button26Click.setVisibility(sp.getInt("button26Vis",button26Click.getVisibility()));
        button18Click.setVisibility(sp.getInt("button18Vis",button18Click.getVisibility()));
        button19Click.setVisibility(sp.getInt("button19Vis",button19Click.getVisibility()));
        button22Click.setVisibility(sp.getInt("button22Vis",button22Click.getVisibility()));
        button21Click.setVisibility(sp.getInt("button21Vis",button21Click.getVisibility()));

    }

    @Override
    protected void onStop() {
        super.onStop();
        saveData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadData();
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
