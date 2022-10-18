package programme;

public class Wall {
    double width, height;
    public Wall() //no-arg constructor
    {

    }
    public Wall(double width, double height)  // parameterised constructor
    {
        this.width=width;
        this.height=height;
        if(width<0 && height<0)
        {
            width=0;
            height=0;
        }
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public void setWidth(double width)
    {
        this.width=width;
        if(width<0)
        {
            width=0;
        }
    }
    public void setHeight(double height)
    {
        this.height=height;
        if(height<0)
        {
            this.height=0;
        }
    }
    public double getArea()
    {
        double area=width*height;
        return area;
    }

    public static void main(String[] args)
    {
        Wall wall = new Wall(5, 4); //constructor invoked
        System.out.println("area="+wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width="+wall.getWidth());
        System.out.println("height="+wall.getHeight());
        System.out.println("area="+wall.getArea());

    }
}


