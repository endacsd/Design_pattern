package factory_pattern;

public class FactoryPatternDemo {

    public static void main(String []args){
        ShapeFactory shapeFactory =new ShapeFactory();

        Shape shape1 =shapeFactory.getShape("CIRCLE");
    }
}
