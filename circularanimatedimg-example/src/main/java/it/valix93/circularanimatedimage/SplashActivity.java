package it.valix93.circularanimatedimage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import it.valix93.circularanimatedimg.CircularAnimatedImgSplash;

public class SplashActivity extends AppCompatActivity {

    private CircularAnimatedImgSplash circularImgSplash;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int progressMills = 3000;
        int delayMills = progressMills;
        setContentView(R.layout.activity_splashscreen);
        circularImgSplash = findViewById(R.id.circularImgSplash);
        circularImgSplash.setProgress(100,progressMills);
        /* handler to start the MainActivity
         * and close this Splash-Screen after some seconds.*/
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the MainActivity. */
                Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, delayMills);
    }
}
