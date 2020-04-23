package homework1;

public class homework {
    public static void main(String[] args) {

        Point p1 = new Point(2, 5);
        Point p2 = new Point(5, 4);

        System.out.println("Расстояние между точками " + p1.x + "," + p1.y + " и " + p2.x + "," + p2.y + " = " + p1.distance(p1, p2));
    }
}
