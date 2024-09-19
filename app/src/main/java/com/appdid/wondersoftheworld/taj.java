package com.appdid.wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class taj extends AppCompatActivity {

    TextView tajlink1;
    TextView tajlink2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taj);

        tajlink1 = findViewById(R.id.tajlink1);
        tajlink1.setMovementMethod(LinkMovementMethod.getInstance());
        tajlink2 = findViewById(R.id.tajlink2);
        tajlink2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void Loc1(View view) {
        String uri = String.format(Locale.ENGLISH,"https://www.google.com/maps/place/Taj+Mahal/@27.1751448,78.0399535,17z/data=!3m1!4b1!4m5!3m4!1s0x39747121d702ff6d:0xdd2ae4803f767dde!8m2!3d27.1751448!4d78.0421422");
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        startActivity(intent);
    }
}