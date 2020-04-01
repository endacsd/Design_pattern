package Factory_Pattern;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        //
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }else if(shapeType.equalsIgnoreCase("Rectangle")){
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
