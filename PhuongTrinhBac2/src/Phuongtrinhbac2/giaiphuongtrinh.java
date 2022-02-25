package Phuongtrinhbac2;
import java.util.Scanner;
import java.math.*;
public class giaiphuongtrinh {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap a: ");
			float a = input.nextFloat();
			System.out.print("Nhap b: ");
			float b = input.nextFloat();
			System.out.print("Nhap c: ");
			float c = input.nextFloat();			
			double nghiem1,nghiem2,dt;
			if (a == 0) {
				if (b == 0) {
		            if (c == 0) {
		                System.out.println("Phuong trinh nay co vo so nghiem.");
		            } else {
		                System.out.println("Phuong trinh vo nghiem.");
		            }
		        } else {
		            nghiem1 = -c / b;   
		            System.out.println("Phuong trinh co nghiem x = " + nghiem1);
		        }
			} else {
				dt=b*b-4*a*c;
				if (dt < 0) {
					System.out.println("Phuong trinh vo nghiem.");
				} else {
					if (dt == 0) {
						nghiem1=-b/(2*a);
						System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + nghiem1);
					} else {
						nghiem1=(-b+Math.sqrt(dt))/(2*a);
						nghiem2=(-b-Math.sqrt(dt))/(2*a);
						System.out.println("Phuong trinh co 2 nghiem x1 = " + nghiem1 +" x2 = "+nghiem2);
					}
				}
			}
	}catch(Exception e) { 
		System.out.println("Nhap sai du lieu");
	}
	}
}
