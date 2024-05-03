package JN.tacticalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView scarlet = findViewById(R.id.remilia);
        scarlet.setBackgroundResource(R.drawable.remi_animation);
        AnimationDrawable scarletAnim = (AnimationDrawable) scarlet.getBackground();

        scarletAnim.start();

//        scarlet.setOnClickListener(view -> {
//            if (scarletAnim.isRunning()) {
//                scarletAnim.stop();
//            }
//            else {
//                scarletAnim.start();
//            }
//        });
    }
}