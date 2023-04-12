package ThucHanh3;

public class People {                     //Khai báo people
    private String name;
    private boolean gender;
    private int age;
    //Khai báo các thuộc tính 'name','gender','age'

    //Khởi tạo 0 tham số
    public People() {
        this.name = "Tên mặc định";
        this.gender = false;
        this.age = 0;
    }

    //Khởi tạo 3 tham số
    public People(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //Getter\Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Đ\N eat để hiển thị
    public void eat() {
        System.out.println("People eating......");
    }

    //Đ\N sleep để hiển thị
    public void sleep(){
        System.out.println("Sleeping.....");
    }

    // toString trả về giá trị
    @Override
    public String toString() {
        return "A people with name: "
                + getName()
                + ", age: "
                + getAge()
                + " and gender: "
                + (isGender() ? "Nam" : "Nữ");
    }
}
