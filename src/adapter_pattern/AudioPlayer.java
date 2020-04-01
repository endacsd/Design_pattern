package adapter_pattern;

public class AudioPlayer implements MediaPlayer {

    MediaAdpater mediaAdpater;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file.Name: "+ fileName);
        }else if(audioType.equalsIgnoreCase("vlc")
                ||audioType.equalsIgnoreCase("mp4")){
            mediaAdpater = new MediaAdpater(audioType);
            mediaAdpater.play(audioType,fileName);
        }
    }
}
