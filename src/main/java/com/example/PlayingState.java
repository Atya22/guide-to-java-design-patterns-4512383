package com.example;

public class PlayingState implements MediaPlayerState {
    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.pause();
        mediaPlayer.setState(new PausedState());

    }
}
