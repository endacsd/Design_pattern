package adapter_pattern;

public class Mp4Player implements AdvanceMediaPlayer {


    @Override
    public void playVlc(String fileName) {
        //nothing
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file.Name: "+ filename);
    }
}
