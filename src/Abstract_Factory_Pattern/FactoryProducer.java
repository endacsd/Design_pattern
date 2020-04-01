package Abstract_Factory_Pattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        //

        if(choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
        return new AbstractFactory() {
            @Override
            public Color getColor(String color) {
                return () -> System.out.println("unkown color");
            }

            @Override
            public Shape getShape(String shape) {
                return () -> System.out.println("unkown shape");
            }
        };
    }
}
