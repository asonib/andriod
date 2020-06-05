package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView view = (VideoView)findViewById(R.id.videoView);
        view.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.battle);

        MediaController controller = new MediaController(this);
        controller.setAnchorView(view);
        view.setMediaController(controller);

        view.start();

    }
}
