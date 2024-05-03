package JN.tacticalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHowToPlayClick(View view) {
        Intent intent = new Intent(this, HowToPlay.class);
        startActivity(intent);
    }

    public void onWhereToPlayClick(View view) {
        Intent intent = new Intent(this, WhereToPlay.class);
        startActivity(intent);
    }

    public void onWhatToWantClick(View view) {
        Intent intent = new Intent(this, WhatToBuy.class);
        startActivity(intent);
    }

    public void onAboutClick(View view) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void onVideoClick(View view) {
        Uri webpage = Uri.parse("https://www.youtube.com/watch?v=_tysmsuA8zI");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}