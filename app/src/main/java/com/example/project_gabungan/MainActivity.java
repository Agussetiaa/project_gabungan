package com.example.project_gabungan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton buttonFirst;
    private MaterialButton buttonSecond;
    private MaterialButton buttonHallo;
    private MaterialButton buttonFibo;
    private MaterialButton buttonScroll;
    private MaterialButton buttonAlarm;
    private MaterialButton buttonTelpon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSecond = findViewById(R.id.twoactivity);
        buttonFirst = findViewById(R.id.twoactivity);
        buttonHallo = findViewById(R.id.hallo);
        buttonFibo = findViewById(R.id.fibo);
        buttonScroll = findViewById(R.id.scroll);
        buttonAlarm = findViewById(R.id.SetAlarm);
        buttonTelpon = findViewById(R.id.Telpon);

        setToolbar();
        setIntent();
    }
    private void setToolbar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("AGUS SETIAWAN");
            getSupportActionBar().setSubtitle(getResources().getString(R.string.app_name));
        }
    }
    private void setIntent() {

        buttonSecond.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
            finish();
        });

        buttonFirst.setOnClickListener(v -> {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);
        });

        buttonHallo.setOnClickListener(v -> {
            Intent intent = new Intent(this, HalloActivity.class);
            startActivity(intent);
        });

        buttonFibo.setOnClickListener(v -> {
            Intent intent = new Intent(this, Fibonancci.class);
            startActivity(intent);
        });

        buttonScroll.setOnClickListener(view -> {
            Intent intent = new Intent(this, ScrollSianida.class);
            startActivity(intent);
        });

        buttonAlarm.setOnClickListener(view -> {
            Intent intent = new Intent(AlarmClock.ACTION_SHOW_ALARMS);
            startActivity(intent);
        });

        buttonTelpon.setOnClickListener(view -> {
            String numberDeveloper = "083841542026";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + numberDeveloper));
            startActivity(intent);
        });
    }
}