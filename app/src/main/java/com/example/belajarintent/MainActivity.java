package com.example.belajarintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button explicitintent;
    Button implicitintent;
    Button loginintent;
    Button save1;
    Button save2;
    Button save3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button)findViewById(R.id.explicitintent);
        explicitintent.setOnClickListener(this);
        implicitintent = (Button)findViewById(R.id.implicitintent);
        implicitintent.setOnClickListener(this);
        loginintent = (Button)findViewById(R.id.kekedua);
        loginintent.setOnClickListener(this);

        save1 = (Button)findViewById(R.id.save1);
        save1.setOnClickListener(this);

        save2 = (Button)findViewById(R.id.save2);
        save2.setOnClickListener(this);

        save3 = (Button)findViewById(R.id.save3);
        save3.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.explicitintent:
                Intent explicit = new Intent(MainActivity.this,IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicitintent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http:/www.w3school.com"));
                startActivity(implicit);
                break;
            case R.id.kekedua:
                Intent login = new Intent(MainActivity.this,activity_save.class);
                startActivity(login);
                break;
            case R.id.save1:
                Intent gues = new Intent(MainActivity.this,activity_save1.class);
                startActivity(gues);
                break;
            case R.id.save2:
                Intent save2Intent = new Intent(MainActivity.this,save2.class);
                startActivity(save2Intent);
                break;
            case R.id.save3:
                Intent save3Intent = new Intent(MainActivity.this,save3.class);
                startActivity(save3Intent);
                break;
            default:
                break;
        }
    }
}
