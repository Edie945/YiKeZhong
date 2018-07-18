package com.yd.hp.yikezhong.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yd.hp.yikezhong.R;

public class FlashActivity extends AppCompatActivity {
    int y = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        new Thread(){
            @Override
            public void run() {
                super.run();
                for(int i=0;i<y;i++){
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Intent intent = new Intent(FlashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }
}
