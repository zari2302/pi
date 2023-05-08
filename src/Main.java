public class Main {
    public static void main(String[] args) {
        double radius = 7.0;
        double area = Circle.area(radius);
        double circumference = Circle.circumference(radius);

        System.out.println("Радиус: " + radius + "\n" + "Площадь: " + area + "\n" + "Длина окружности: " +
                circumference);


    }
}