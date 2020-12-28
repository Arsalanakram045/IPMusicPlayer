package org.InnovativeProducts.ipmusicplayer;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ipmusicplayer.R;


public class MainActivity extends AppCompatActivity {

    private static int WELCOME_TIMOUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(MainActivity.this, HomeActivity.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(home);
                finish();
            }
        },WELCOME_TIMOUT);
    }
}
