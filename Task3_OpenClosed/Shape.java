class Shape {
    public double calculateArea(String shapeType, double param1, double param2){
        double area = 0.0;
        if(shapeType.equalsIgnoreCase("circle")){
            double redius = param1;
            area = 3.14 * redius * redius;
        } else if (shapeType.equalsIgnoreCase("rectangle")){
            double width = param1;
            double height = param2;
            area = width * height;
        }
            return area;

    }


    //Output
    //12.56
        
        

    public static void  main(String[] args){
        Shape sh = new Shape();
        System.out.println(sh.calculateArea("circle",2.0,3.0));
    }
}
