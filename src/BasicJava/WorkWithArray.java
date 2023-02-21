package BasicJava;

import java.util.Iterator;

public class WorkWithArray {

	public static void main(String[] args) {
		
		int[] array1 = new int[5];
		String[] stringArray = new String[10];
		int[] six = new int[6];
		int[] seven = {1,2,3,4,5,6,7};
		int[][] boardOne = {{1,2,3},{4,5,6}};
		String[][] boardTwo = new String[2][9];
		
		var lengthOfSeven = seven.length;
		System.out.println(seven[6] + " " + lengthOfSeven);
		
		
		// https://kungfutech.edu.vn/bai-viet/java/mang-array-trong-java
		// Duyệt các phần tử của mảng trong Java
		for (int i = 0; i<seven.length; i++) {
			System.out.println(seven[i]);
		}
		
		String[] arrayNameCars = { "Honda", "BMW", "Ford", "Mazda" };
		// System.out.println("Sử dụng foreach:"); https://niithanoi.edu.vn/vong-lap-for-each-trong-java.html
        for (String variableCar : arrayNameCars) {
            System.out.println(variableCar);
        }
		
	}

}
