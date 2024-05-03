package JN.tacticalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HowToPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);
    }

    public void onRuleClick(View view) {
        Intent intent = new Intent(this, Rules.class);
        startActivity(intent);
    }

    public void onToDoClick(View view) {
        Intent intent = new Intent(this, ToDo.class);
        startActivity(intent);
    }
}