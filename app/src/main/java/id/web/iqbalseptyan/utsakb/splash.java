package id.web.iqbalseptyan.utsakb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
    NIM : 10116120
    NAMA : MOCHAMAD IQBAL SEPTYAN
    TGL : 20-05-2019
 */
public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        final Intent intent = new Intent(this, ViewPager.class);
        Thread timer = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}
