package JN.tacticalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WhatToBuy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_to_buy);
    }

    public void onNeedClick(View view) {
        Intent intent = new Intent(this, NeedToPlay.class);
        startActivity(intent);
    }

    public void onWearClick(View view) {
        Intent intent = new Intent(this, WhatToWear.class);
        startActivity(intent);
    }

    public void onGunClick(View view) {
        Intent intent = new Intent(this, systemsAirsoft.class);
        startActivity(intent);
    }
}