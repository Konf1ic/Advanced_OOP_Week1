package BaiTap1;

public class Test {
    public static void main(String[] args) {
        // Tạo 1 điểm 2D
        Point2D p1 = new Point2D(0, 0);
        System.out.println("p1(" + p1.getX() + ", " + p1.getY() + ")");

        // Tạo 1 điểm 3D
        Point3D p2 = new Point3D(1, 2, 3);
        System.out.println("p2(" + p2.getX() + ", " + p2.getY() + ", " + p2.getZ() + ")");

        // Tính khoảng cách giữa 2 điểm 2D
        Point2D p3 = new Point2D(3, 4);
        double distance1 = p1.distance(p3);
        System.out.println("Khoảng cách giữa p1 và p3: " + distance1);

        // Tính khoảng cách giữa 2 điểm 3D
        Point3D p4 = new Point3D(4, 5, 6);
        double distance2 = p2.distance(p4);
        System.out.println("Khoảng cách giữa p2 và p4: " + distance2);
    }
}
