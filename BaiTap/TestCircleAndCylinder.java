package BaiTap;

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "red");
        Cylinder cylinder = new Cylinder(3.0, "blue", 10.0);

        System.out.println(circle);
        System.out.println("Diện tích hình tròn (circle): " + circle.getArea());

        System.out.println(cylinder);
        System.out.println("Thể tích hình trụ (cylinder): " + cylinder.getVolume());
    }
}
