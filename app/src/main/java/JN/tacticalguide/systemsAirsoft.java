package JN.tacticalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class systemsAirsoft extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_systems_airsoft);
    }

    public void onAEGClick(View view) {
        Intent intent = new Intent(this, AEG.class);
        startActivity(intent);
    }

    public void onGasClick(View view) {
        Intent intent = new Intent(this, Gas.class);
        startActivity(intent);
    }

    public void onSpringClick(View view) {
        Intent intent = new Intent(this, Spring.class);
        startActivity(intent);
    }

    public void onHPAClick(View view) {
        Intent intent = new Intent(this, HPA.class);
        startActivity(intent);
    }
}