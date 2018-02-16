package com.example.fabienfoli.devoir3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent ;
import android.widget.TextView;
import android.content.Context ;
import android.widget.Toast ;
import android.content.DialogInterface ;
import android.support.v7.app.AlertDialog ;

public class Activity2 extends AppCompatActivity {
    TextView welc = (TextView) findViewById(R.id.textView);

    TextView wro = (TextView) findViewById(R.id.textView2);


    String login, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        Intent ii = getIntent();
        login = ii.getStringExtra("log");
        password = ii.getStringExtra("passw");

        if (login.equals("taraf") && password.equals("sky")) {
            wro.setVisibility(TextView.INVISIBLE);
            Context context = getApplicationContext();
            Toast MyToast = new Toast(context);
            MyToast.makeText(context, "password ok",
                    Toast.LENGTH_LONG).show();
        } else {
            welc.setVisibility(TextView.INVISIBLE);
            AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);
            DialogConf.setTitle("Alert");
            DialogConf.setMessage("password not ok");
            DialogConf.setIcon(R.mipmap.ic_launcher);


            DialogConf.setNeutralButton("OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    });
            AlertDialog mydialog = DialogConf.create();
            mydialog.show();
        }


    }

}