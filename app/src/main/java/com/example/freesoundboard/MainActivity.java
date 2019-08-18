package com.example.freesoundboard;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySound1;
    MediaPlayer mySound2;
    MediaPlayer mySound3;
    MediaPlayer mySound4;
    MediaPlayer mySound5;
    MediaPlayer mySound6;
    MediaPlayer mySound7;
    MediaPlayer mySound8;
    MediaPlayer mySound9;
    MediaPlayer mySound10;
    MediaPlayer mySound11;
    MediaPlayer mySound12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySound1 = MediaPlayer.create(this, R.raw.wow);
        mySound2 = MediaPlayer.create(this, R.raw.erro);
        mySound3 = MediaPlayer.create(this, R.raw.yeah_boy);
        mySound4 = MediaPlayer.create(this, R.raw.ayaya);
        mySound5 = MediaPlayer.create(this, R.raw.lemons);
        mySound6 = MediaPlayer.create(this, R.raw.hadouken);
        mySound7 = MediaPlayer.create(this, R.raw.hey_listen);
        mySound8 = MediaPlayer.create(this, R.raw.mgs_alert);
        mySound9 = MediaPlayer.create(this, R.raw.magic_immune);
        mySound10 = MediaPlayer.create(this, R.raw.way);
        mySound11 = MediaPlayer.create(this, R.raw.this_dude);
        mySound12 = MediaPlayer.create(this, R.raw.coffee1);

    }

    public void mySound1(View view) {
        if (mySound1.isPlaying()){
            mySound1.stop();
            mySound1.prepareAsync();
        } else {
            mySound1.start();
        }
    }


    public void mySound2(View view) {
        if (mySound2.isPlaying()){
            mySound2.stop();
            mySound2.prepareAsync();
        } else {
            mySound2.start();
        }
    }


    public void mySound3(View view) {
        if (mySound3.isPlaying()){
            mySound3.stop();
            mySound3.prepareAsync();
        } else {
            mySound3.start();
        }
    }


    public void mySound4(View view) {
        if (mySound4.isPlaying()){
            mySound4.stop();
            mySound4.prepareAsync();
        } else {
            mySound4.start();
        }
    }


    public void mySound5(View view) {
        if (mySound5.isPlaying()){
            mySound5.stop();
            mySound5.prepareAsync();
        } else {
            mySound5.start();
        }
    }


    public void mySound6(View view) {
        if (mySound6.isPlaying()){
            mySound6.stop();
            mySound6.prepareAsync();
        } else {
            mySound6.start();
        }
    }


    public void mySound7(View view) {
        if (mySound7.isPlaying()){
            mySound7.stop();
            mySound7.prepareAsync();
        } else {
            mySound7.start();
        }
    }


    public void mySound8(View view) {
        if (mySound8.isPlaying()){
            mySound8.stop();
            mySound8.prepareAsync();
        } else {
            mySound8.start();
        }
    }


    public void mySound9(View view) {
        if (mySound9.isPlaying()){
            mySound9.stop();
            mySound9.prepareAsync();
        } else {
            mySound9.start();
        }
    }


    public void mySound10(View view) {
        if (mySound10.isPlaying()){
            mySound10.stop();
            mySound10.prepareAsync();
        } else {
            mySound10.start();
        }
    }


    public void mySound11(View view) {
        if (mySound11.isPlaying()){
            mySound11.stop();
            mySound11.prepareAsync();
        } else {
            mySound11.start();
        }
    }


    public void mySound12(View view) {
        if (mySound12.isPlaying()){
            mySound12.stop();
            mySound12.prepareAsync();
        } else {
            mySound12.start();
        }
    }
}
