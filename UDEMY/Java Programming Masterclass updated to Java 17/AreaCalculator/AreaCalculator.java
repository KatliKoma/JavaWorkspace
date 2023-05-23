public class AreaCalculator {
    public static double area(double radius)
    {
        double area= radius*radius * Math.PI;
        if (radius>=0)
            return area;
        else
            return -1;
}
    public static double area(double X, double Y)
    {
        double area= X*Y;
        if (X>=0&&Y>=0)
            return area;
        else
            return -1;
    }
     
}