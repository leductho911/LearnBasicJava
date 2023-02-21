package BasicJava;

public class Variable {
    
    public void sayHello() {
        int n = 10;                     // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }
    
    public void sayHi() {
        System.out.println("Gia tri cua x la: " + x);
    }
    
    public int x = 100; // Biến global
    
     
    public static void main(String[] args) {
    	
        Variable varOne = new Variable(); // tạo 1 biến varOne có kiểu dữ liệu là Variable trùng tên class
        Variable varTwo = new Variable(); // tạo 1 biến varTwo có kiểu dữ liệu là Variable trùng tên class
        
        varOne.x++;
        varOne.sayHi();
        varTwo.sayHello();
       
    }
}