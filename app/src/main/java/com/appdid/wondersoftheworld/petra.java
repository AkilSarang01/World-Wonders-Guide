package com.appdid.wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class petra extends AppCompatActivity {

    TextView plink1;
    TextView plink2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petra);
        plink1 = findViewById(R.id.plink1);
        plink1.setMovementMethod(LinkMovementMethod.getInstance());
        plink2 = findViewById(R.id.plink2);
        plink2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void Loc1(View view) {
        String uri = String.format(Locale.ENGLISH,"https://www.google.co.in/maps/place/Wadi+Musa,+Jordan/@30.3206627,35.4656454,14z/data=!3m1!4b1!4m5!3m4!1s0x15016930021ab6b1:0xe43a697bc3a3e0b9!8m2!3d30.3216354!4d35.4801251?hl=en");
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        startActivity(intent);
    }
}