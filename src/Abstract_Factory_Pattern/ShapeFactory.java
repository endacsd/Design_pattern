package Abstract_Factory_Pattern;


public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {

        return new Color() {
            @Override
            public void fill() {
                System.out.println("unkown color");
            }
        };
    }

    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shape.equalsIgnoreCase("Square")) {
            return new Square();
        }else if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else{
            return new Shape() {
                @Override
                public void draw() {
                    System.out.println("unkonw Shape");
                }
            };
        }
    }
}
