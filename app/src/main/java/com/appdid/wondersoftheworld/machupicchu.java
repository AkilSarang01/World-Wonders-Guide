package com.appdid.wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class machupicchu extends AppCompatActivity {

    TextView machulink1;
    TextView machulink2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machupicchu);

        machulink1 = findViewById(R.id.machulink1);
        machulink1.setMovementMethod(LinkMovementMethod.getInstance());
        machulink2 = findViewById(R.id.machulink2);
        machulink2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void Loc1(View view) {
        String uri = String.format(Locale.ENGLISH,"https://www.google.co.in/maps/place/Machu+Picchu/@-13.163136,-72.5471516,17z/data=!3m1!4b1!4m5!3m4!1s0x916d9a5f89555555:0x3a10370ea4a01a27!8m2!3d-13.1631412!4d-72.5449629?hl=en");
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        startActivity(intent);
    }
}