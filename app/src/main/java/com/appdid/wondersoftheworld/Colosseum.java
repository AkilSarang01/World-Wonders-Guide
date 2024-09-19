package com.appdid.wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class Colosseum extends AppCompatActivity {

    TextView colosseumlink1;
    TextView colosseumlink2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colosseum);

        colosseumlink1 = findViewById(R.id.colosseumlink1);
        colosseumlink1.setMovementMethod(LinkMovementMethod.getInstance());
        colosseumlink2 = findViewById(R.id.colosseumlink2);
        colosseumlink2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void Loc1(View view) {
        String uri = String.format(Locale.ENGLISH,"https://www.google.co.in/maps/place/Colosseum/@41.8902142,12.4900422,17z/data=!3m1!4b1!4m5!3m4!1s0x132f61b6532013ad:0x28f1c82e908503c4!8m2!3d41.8902102!4d12.4922309?hl=en");
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        startActivity(intent);
    }
}