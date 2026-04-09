package rifa;
import java.util.Scanner;

class Complex{
	int real;
	int imag;
	
	Complex(int r,int i){
		real=r;
		imag=i;
	}
	Complex add(Complex c) {
		return new Complex(real+c.real,imag+c.imag);
	}
	void display() {
		System.out.println(real+"+"+imag+"i");
	}
}

public class ComplexAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first complex number : ");
		System.out.println("enter real part : ");
		int r1=sc.nextInt();
		System.out.println("enter imaginary part : ");
		int i1=sc.nextInt();
		System.out.println("enter second complex number : ");
		System.out.println("enter real part : ");
		int r2=sc.nextInt();
		System.out.println("enter imaginary part : ");
		int i2=sc.nextInt();
		
		Complex c1=new Complex(r1,i1);
		Complex c2=new Complex(r2,i2);
		Complex sum=c1.add(c2);
		
		System.out.print("sum of complex numbers : ");
		sum.display();
		sc.close();
		

	}

}
