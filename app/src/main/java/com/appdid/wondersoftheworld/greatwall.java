package com.appdid.wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class greatwall extends AppCompatActivity {

    TextView txt3;
    TextView txt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greatwall);
        txt3 = findViewById(R.id.txt3);
        txt3.setMovementMethod(LinkMovementMethod.getInstance());
        txt7 = findViewById(R.id.txt7);
        txt7.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void Loc1(View view) {
        String uri = String.format(Locale.ENGLISH,"https://www.google.co.in/maps/place/Great+Wall+of+China/@40.4319118,116.5681862,17z/data=!3m1!4b1!4m5!3m4!1s0x35f121d7687f2ccf:0xd040259b950522df!8m2!3d40.4319077!4d116.5703749?hl=en");
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        startActivity(intent);


    }
}