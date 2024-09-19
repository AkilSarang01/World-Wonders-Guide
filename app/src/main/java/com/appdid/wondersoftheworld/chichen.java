package com.appdid.wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class chichen extends AppCompatActivity {

    TextView link1;
    TextView link2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chichen);
        link1 = findViewById(R.id.link1);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        link2 = findViewById(R.id.link2);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void Loc1(View view) {
        String uri = String.format(Locale.ENGLISH,"https://goo.gl/maps/2F6HypM9Q1Vqt8vh9");
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        startActivity(intent);
    }
}