package com.example;

public class PausedState implements MediaPlayerState {
    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.play();
        mediaPlayer.setState(new PlayingState());
    }
}
