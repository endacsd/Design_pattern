package adapter_pattern;

public class MediaAdpater implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdpater(String audioType){
        if(audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer =new Mp4Player();
        }

    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}
