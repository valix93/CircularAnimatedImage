package it.valix93.circularanimatedimage;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import it.valix93.circularanimatedimg.CircularAnimatedImg;

public class SplashActivity extends AppCompatActivity {

    private CircularAnimatedImg circularImgSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int progressMills = 3000;
        setContentView(R.layout.activity_splashscreen);
        circularImgSplash = findViewById(R.id.circularImgSplash);
        circularImgSplash.setProgress(100, progressMills, new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }
}
