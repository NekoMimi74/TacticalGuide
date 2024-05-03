package JN.tacticalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class WhereToPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where_to_play);
    }

    public void onGEClick(View view) {
        Uri webpage = Uri.parse("https://airsoftge.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void onPOClick(View view) {
        Uri webpage = Uri.parse("https://www.poweropsairsoft.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void onTAClick(View view) {
        Uri webpage = Uri.parse("https://www.teamairsoft.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void onGAClick(View view) {
        Uri webpage = Uri.parse("http://georgiaairsoft.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}