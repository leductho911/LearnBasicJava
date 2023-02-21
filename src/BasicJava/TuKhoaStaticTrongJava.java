package BasicJava;
//https://viettuts.vn/java/tu-khoa-static-trong-java
public class TuKhoaStaticTrongJava {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";
 
    static void change() {
        // Thay đổi thuộc tính static (thuộc tính chung của tất cả các đối tượng)
        college = "Đại Học Công Nghệ";
    }
 
    
    // hàm constructor https://niithanoi.edu.vn/tat-tan-tat-ve-constructor-trong-java.html
    TuKhoaStaticTrongJava(int r, String n) { 
        rollno = r;
        name = n;
    }
 
    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }
 
    public static void main(String args[]) {
    	TuKhoaStaticTrongJava.change();
 
        TuKhoaStaticTrongJava s1 = new TuKhoaStaticTrongJava(111, "Thông");
        TuKhoaStaticTrongJava s2 = new TuKhoaStaticTrongJava(222, "Minh");
        TuKhoaStaticTrongJava s3 = new TuKhoaStaticTrongJava(333, "Anh");
 
        s1.display();
        s2.display();
        s3.display();
    }
}