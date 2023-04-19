package BaiTap2;

public class TestPoint {
    public static void main(String[] args) {
        // tạo điểm mới
        Point p1 = new Point(1, 2);
        System.out.println("p1: " + p1);

        // thay đổi tọa độ của điểm
        p1.setX(3);
        p1.setY(4);
        System.out.println("p1: " + p1);

        // tạo 1 điểm có thể di chuyển
        MoveablePoint p2 = new MoveablePoint(1, 2, 3, 4);
        System.out.println("p2: " + p2);

        // thay đổi tốc độ của điểm
        p2.setXSpeed(5);
        p2.setYSpeed(6);
        System.out.println("p2: " + p2);

        // di chuyển điểm đó, hiển thị vị trí mới
        p2.move();
        System.out.println("p2: " + p2);
    }
}
