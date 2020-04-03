package proxy_pattern;

public class RealImage implements Image {


    private String fileName;

    public RealImage(String fileName){
        this.fileName=fileName;
        loadFromDist(fileName);
    }

    private void loadFromDist(String fileName){
        System.out.println("Displaying "+fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying "+fileName);
    }
}
