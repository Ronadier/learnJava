package ru.learn.chlek;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("world");
		Sqare s = new Sqare(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
		Point p = new Point(1, 9);
		System.out.println("Расстояние между точками " + p.p1 + " и " + p.p2 + " = " + p.distance());
}
	public static void hello (String somebody) {

		System.out.println("hello " + somebody + "!");
	}
}