package Abstract_Factory_Pattern;

public class ColorFactory extends AbstractFactory{


    @Override
    public Color getColor(String color) {
        if(color == null) {
            return null;
        }
        if(color.equalsIgnoreCase("Red")) {
            return new Red();
        }else if(color.equalsIgnoreCase("Green")){
            return new Green();
        }else if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        return new Color() {
            @Override
            public void fill() {
                System.out.println("unkown color");
            }
        };
    }

    @Override
    public Shape getShape(String shape) {
        return new Shape() {
            @Override
            public void draw() {
                System.out.println("unkown shape");
            }
        };
    }
}
