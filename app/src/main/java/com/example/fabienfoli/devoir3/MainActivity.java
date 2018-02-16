package com.example.fabienfoli.devoir3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button ;
import android.widget.EditText;
import android.view.View ;
import android.content.Intent ;


public class MainActivity extends AppCompatActivity {
    String log, passw;


    EditText userName = (EditText) findViewById(R.id.editText);

    EditText passWord = (EditText) findViewById(R.id.editText2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Activity2.class);
                log = userName.getText().toString();
                passw = passWord.getText().toString();
                i.putExtra("log", log);
                i.putExtra("passw", passw);
                startActivity(i);
            }
        });
    }
}


