package com.appdid.wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class christ extends AppCompatActivity {

    TextView christlink1;
    TextView christlink2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christ);

        christlink1 = findViewById(R.id.christlink1);
        christlink1.setMovementMethod(LinkMovementMethod.getInstance());
        christlink2 = findViewById(R.id.christlink2);
        christlink2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void Loc1(View view) {
        String uri = String.format(Locale.ENGLISH,"https://www.google.co.in/maps/place/Christ+the+Redeemer/@-22.951911,-43.2126759,17z/data=!3m1!4b1!4m5!3m4!1s0x997fd5984aa13f:0x9dc984d7019502de!8m2!3d-22.951916!4d-43.2104872?hl=en");
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        startActivity(intent);
    }
}
