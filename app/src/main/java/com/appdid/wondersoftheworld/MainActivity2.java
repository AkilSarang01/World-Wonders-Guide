package com.appdid.wondersoftheworld;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    ProgressDialog progress;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Card1(View view) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent abc = new Intent(MainActivity2.this, greatwall.class);
                startActivity(abc);
            }
        }, 3000);
        progress = new ProgressDialog(MainActivity2.this);
        progress.show();
        progress.setContentView(R.layout.progress);
        progress.getWindow().setBackgroundDrawableResource(
                android.R.color.transparent
        );


    }

    @Override
    protected void onStop() {
        progress.dismiss();
        super.onStop();
    }

    public void Card2(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent abc = new Intent(MainActivity2.this, chichen.class);
                startActivity(abc);
            }
        }, 3000);
        progress = new ProgressDialog(MainActivity2.this);
        progress.show();
        progress.setContentView(R.layout.progress);
        progress.getWindow().setBackgroundDrawableResource(
                android.R.color.transparent
        );
    }


    public void Card3(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent abc = new Intent(MainActivity2.this, petra.class);
                startActivity(abc);
            }
        }, 3000);
        progress = new ProgressDialog(MainActivity2.this);
        progress.show();
        progress.setContentView(R.layout.progress);
        progress.getWindow().setBackgroundDrawableResource(
                android.R.color.transparent
        );
    }

    public void Card4(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent abc = new Intent(MainActivity2.this, machupicchu.class);
                startActivity(abc);
            }
        }, 3000);
        progress = new ProgressDialog(MainActivity2.this);
        progress.show();
        progress.setContentView(R.layout.progress);
        progress.getWindow().setBackgroundDrawableResource(
                android.R.color.transparent
        );
    }

    public void Card5(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent abc = new Intent(MainActivity2.this, christ.class);
                startActivity(abc);
            }
        }, 3000);
        progress = new ProgressDialog(MainActivity2.this);
        progress.show();
        progress.setContentView(R.layout.progress);
        progress.getWindow().setBackgroundDrawableResource(
                android.R.color.transparent
        );
    }

    public void Card6(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent abc = new Intent(MainActivity2.this, Colosseum.class);
                startActivity(abc);
            }
        }, 3000);
        progress = new ProgressDialog(MainActivity2.this);
        progress.show();
        progress.setContentView(R.layout.progress);
        progress.getWindow().setBackgroundDrawableResource(
                android.R.color.transparent
        );
    }

    public void Card7(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent abc = new Intent(MainActivity2.this, taj.class);
                startActivity(abc);
            }
        }, 3000);
        progress = new ProgressDialog(MainActivity2.this);
        progress.show();
        progress.setContentView(R.layout.progress);
        progress.getWindow().setBackgroundDrawableResource(
                android.R.color.transparent
        );
    }

    public void onBackPressed() {
        {
            final AlertDialog.Builder builder;
            builder = new AlertDialog.Builder(MainActivity2.this);
            builder.setMessage("Are You Want To Close?");
            builder.setCancelable(true);
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
    }
    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {

        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {

        }
    }
}






