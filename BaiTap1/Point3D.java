package BaiTap1;

public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double distance(Point3D other) {
        double dx = getX() - other.getX();
        double dy = getY() - other.getY();
        double dz = z - other.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}