package com.roha.lungo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Henok G on 17-Aug-16.
 */
public class EventHandler {

    private static final String rohaSoftwaresUrl = "https://www.facebook.com/rohasoftwares";
    private static final String behagerLijUrl = "https://www.facebook.com/behagerlij";
    protected static enum SoundStates {PLAYING, PAUSED, NONE};
    protected static SoundStates fatherSoundState = SoundStates.NONE;
    protected static SoundStates motherSoundState = SoundStates.NONE;
    protected static MediaPlayer fatherSound;
    protected static MediaPlayer motherSound;

    public void rohaSoftwaresUrl(View view) {
        Intent urlIntent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(rohaSoftwaresUrl));
        view.getContext().startActivity(urlIntent);
    }

    public void behagerLijUrl(View view) {
        Intent urlIntent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(behagerLijUrl));
        view.getContext().startActivity(urlIntent);
    }

    public void fatherReader(View view) {
        if(!(fatherSoundState==SoundStates.PLAYING)){
            fatherSound = MediaPlayer.create(view.getContext(), R.raw.prison_break);
            fatherSound.start();
            fatherSoundState = SoundStates.PLAYING;
        }
    }

    public void motherReader(View view) {
        Toast.makeText(view.getContext(), "Not Yet Implemented", Toast.LENGTH_SHORT).show();
    }
}