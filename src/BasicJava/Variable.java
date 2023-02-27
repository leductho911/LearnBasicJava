package BasicJava;

// https://viettuts.vn/java/bien-trong-java#goto-h2-1

public class Variable {
    
    public void sayHello() {
        int n = 10;                     // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }
    
    public void sayHi() {
        System.out.println("Gia tri cua x la: " + x);
    }
    
    public  int x = 100; // Biến global
    
     
    public static void main(String[] args) {
    	
        Variable varOne = new Variable(); // tạo 1 biến varOne có kiểu dữ liệu là Variable trùng tên class
        Variable varTwo = new Variable(); // tạo 1 biến varTwo có kiểu dữ liệu là Variable trùng tên class, 2 object này chiếm vùng nhớ khác nhau
        
                
        varOne.x++;
        varOne.sayHi();
        varTwo.sayHello();
        
        
        StaticVariable varThree = new StaticVariable();
        System.out.println(varThree.y); //gọi biến y (global) thông qua biến varThree, không thể gọi trực tiếp được
        System.out.println(StaticVariable.ten); // gọi biến static của file khác thông qua tên class StaticVariable
        
       
    }
    
   
}