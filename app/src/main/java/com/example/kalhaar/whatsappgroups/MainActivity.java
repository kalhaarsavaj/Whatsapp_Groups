package com.example.kalhaar.whatsappgroups;
import android.content.Intent;
import android.net.Uri;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button1);
        btn3=(Button)findViewById(R.id.button2);
        btn4=(Button)findViewById(R.id.button3);
        btn5=(Button)findViewById(R.id.button4);
        btn6=(Button)findViewById(R.id.button5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent site = new Intent(Intent.ACTION_VIEW);
                site.setData(Uri.parse("https://chat.whatsapp.com/4Ny40FgEuOhEs48DMoVyyG"));
                startActivity(site);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent site = new Intent(Intent.ACTION_VIEW);
                site.setData(Uri.parse("https://chat.whatsapp.com/invite/Bz5syLMSI7FKuAJTdWoQD5"));
                startActivity(site);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent site = new Intent(Intent.ACTION_VIEW);
                site.setData(Uri.parse("https://chat.whatsapp.com/Hv7QcIfrRyH09Q87Gdsx0t"));
                startActivity(site);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent site = new Intent(Intent.ACTION_VIEW);
                site.setData(Uri.parse("https://chat.whatsapp.com/BVudn7J36xG88IWnAqh5oL"));
                startActivity(site);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent site = new Intent(Intent.ACTION_VIEW);
                site.setData(Uri.parse("https://chat.whatsapp.com/7ANbZD0XvOaAlX9WWMUgS4"));
                startActivity(site);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent site = new Intent(Intent.ACTION_VIEW);
                site.setData(Uri.parse("https://chat.whatsapp.com/9GgDIo0CXCL5TnZmJF1MAC"));
                startActivity(site);
            }
        });








    }


}

