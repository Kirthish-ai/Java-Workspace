Figure (double a, double b)
{
    dim1 = a;
    dim2 = b;
}
double area()
{
    System.out.println("Area for Figure is undefined.");
    return 0;
}

class Rectangle extends Figure
{
    Rectangle(double a, double b)
    {
        super(a,b);
    }
    double area()
    {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure
{
    Triangle(double a, double b)
    {
        super(a,b);
    }
    double area()
    {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
class FindAreeas 
{
    public static void main(String[] args) 
    {
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,9);
    }
}
