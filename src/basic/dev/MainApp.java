package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao ten hoc sinh");
		String nameStudent = sc.nextLine();
		System.out.println(nameStudent);
		
		System.out.println("Nhap vao ma sinh vien");
		String codeStudent = sc.nextLine();
		System.out.println(codeStudent);
		 
		System.out.println("Nhap vao chung minh nhan dan");
		String identityCard = sc.nextLine();
		System.out.println(identityCard);
		
		System.out.println("Nhap vao ten lop");
		String nameClass = sc.nextLine();
		System.out.println(nameClass);
		
		System.out.println("Nhap vao ten truong");
		String nameSchool = sc.nextLine();
		System.out.println(nameSchool);
		
		System.out.println("Nhap vao diem trung binh");
		float mark = sc.nextFloat();
		sc.nextLine();
		System.out.println(mark);
		
		System.out.println("Nhap vao ten cong nhan");
		String nameWorker = sc.nextLine();
		System.out.println(nameWorker);
		
		System.out.println("Nhap vao dia chi");
		String address = sc.nextLine();
		System.out.println(address);
		 
		System.out.println("Nhap vao luong");
		float salary= sc.nextFloat();
		sc.nextLine();
		System.out.println(salary);
		
		System.out.println("Nhap vao ten xe");
		String nameCar = sc.nextLine();
		System.out.println(nameCar);
		
		System.out.println("Nhap vao ten hang");
		String nameCompany = sc.nextLine();
		System.out.println(nameCompany);
		
		System.out.println("Nhap vao gia");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.println(price);

		System.out.println("Nhap vao mau");
		String colorCar = sc.nextLine();
		System.out.println(colorCar);

	}
}
