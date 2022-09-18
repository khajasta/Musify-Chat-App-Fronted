package com.khajasta.i190468;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView bt1;
    ImageView bt2;
    ImageView bt3;
    ImageView bt4;
    ImageView bt5;
    ImageView bt6;
    ImageView bt7;
    ImageView bt8;
    ImageView bt9;
    ImageView bt10;
    ImageView bt11;
    ImageView bt12;
    ImageView bt13;
    ImageView bt14;
    ImageView bt15;
    ImageView bt16;
    ImageView bt17;
    ImageView bt18;
    ImageView bt19;
    ImageView bt20;
    ImageView bt21;
    ImageView bt22;
    ImageView bt23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,secondscreen.class);
                startActivity(intent);
            }
        });
        bt2=findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,thirdscreen.class);
                startActivity(intent);
            }
        });
        bt3=findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,forthscreen.class);
                startActivity(intent);
            }
        });
        bt4=findViewById(R.id.bt4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,fifthscreen.class);
                startActivity(intent);
            }
        });
        bt5=findViewById(R.id.bt5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,sixthscreen.class);
                startActivity(intent);
            }
        });
        bt6=findViewById(R.id.bt6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,seventhscreen.class);
                startActivity(intent);
            }
        });
        bt7=findViewById(R.id.bt7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,eightscreen.class);
                startActivity(intent);
            }
        });
        bt8=findViewById(R.id.bt8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ninthscreen.class);
                startActivity(intent);
            }
        });
        bt9=findViewById(R.id.bt9);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,tenthscreen.class);
                startActivity(intent);
            }
        });
        bt10=findViewById(R.id.bt10);
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,elevenscreen.class);
                startActivity(intent);
            }
        });
        bt11=findViewById(R.id.bt11);
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,twelvescreen.class);
                startActivity(intent);
            }
        });
        bt12=findViewById(R.id.bt12);
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,thirteenscreen.class);
                startActivity(intent);
            }
        });
        bt13=findViewById(R.id.bt13);
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,forteenscreen.class);
                startActivity(intent);
            }
        });
        bt14=findViewById(R.id.bt14);
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,fifteenscreen.class);
                startActivity(intent);
            }
        });
        bt15=findViewById(R.id.bt15);
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,sixteenscreen.class);
                startActivity(intent);
            }
        });
        bt16=findViewById(R.id.bt16);
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,seventeenscreen.class);
                startActivity(intent);
            }
        });
        bt17=findViewById(R.id.bt17);
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,eighteenscreen.class);
                startActivity(intent);
            }
        });
        bt18=findViewById(R.id.bt18);
        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,nineteenscreen.class);
                startActivity(intent);
            }
        });
        bt19=findViewById(R.id.bt19);
        bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,twentyscreen.class);
                startActivity(intent);
            }
        });
        bt20=findViewById(R.id.bt20);
        bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,twentyonescr.class);
                startActivity(intent);
            }
        });
        bt21=findViewById(R.id.bt21);
        bt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,twentytwo.class);
                startActivity(intent);
            }
        });
        bt22=findViewById(R.id.bt22);
        bt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,twentythree.class);
                startActivity(intent);
            }
        });
        bt23=findViewById(R.id.bt23);
        bt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,twentyfour.class);
                startActivity(intent);
            }
        });
    }
}