package BasicJava;

import java.util.Scanner;

public class InputAndOutput {
	// https://gochocit.com/ngon-ngu-lap-trinh/nhap-va-xuat-co-ban-basic-input-and-output-trong-java
//	Phương thức	Mô tả
//	nextByte()	Đọc một số nguyên kiểu byte
//	nextShort()	Đọc một số nguyên kiểu short
//	nextInt()	Đọc một số nguyên kiểu int
//	nextLong()	Đọc một số nguyên kiểu long
//	nextFloat()	Đọc một số kiểu float
//	nextDouble()	Đọc một số kiểu double
//	next()	Đọc một string kết thức trước một ký tự trắng
//	nextLine()	Đọc một line of text (kết thúc bằng phím Enter)

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		short s;
		byte b;
		long l;
		float f;
		double d;
		boolean bl;
		String st;
		char c;
		
		System.out.println("Nhap so nguyen: ");
		i = input.nextInt();
		System.out.println("Nhap string: ");
		st = input.nextLine();
		
	}

}
