import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông số hình thang 1");
        System.out.print("Nhập vào độ dài cạnh dưới: ");
        double a1 = scanner.nextDouble();
        System.out.print("Nhập vào độ dài cạnh trên: ");
        double b1 = scanner.nextDouble();
        System.out.print("Nhập vào độ dài cạnh bên 1: ");
        double c1 = scanner.nextDouble();
        System.out.print("Nhập vào độ dài cạnh bên 2: ");
        double d1 = scanner.nextDouble();
        System.out.print("Nhập vào độ dài chiều cao: ");
        double h1 = scanner.nextDouble();
        Trapezoid trapezoid1 = new Trapezoid(a1,b1,h1,c1,d1);

        System.out.println("Nhập thông số hình thang 2");
        System.out.print("Nhập vào độ dài cạnh dưới: ");
        double a2 = scanner.nextDouble();
        System.out.print("Nhập vào độ dài cạnh trên: ");
        double b2 = scanner.nextDouble();
        System.out.print("Nhập vào độ dài cạnh bên 1: ");
        double c2 = scanner.nextDouble();
        System.out.print("Nhập vào độ dài cạnh bên 2: ");
        double d2 = scanner.nextDouble();
        System.out.print("Nhập vào độ dài chiều cao: ");
        double h2 = scanner.nextDouble();
        Trapezoid trapezoid2 = new Trapezoid(a2,b2,h2,c2,d2);

        if (trapezoid1.getArea() > trapezoid2.getArea()) {
            System.out.println("Hình thang 1 có diện tích lớn hơn");
        } else if (trapezoid1.getArea() < trapezoid2.getArea()) {
            System.out.println("Hình thang 2 có diên tích lớn hơn");
        } else {
            System.out.println("Hai hình diện tích bằng nhau");
        }

        if (trapezoid1.getPerimeter() > trapezoid2.getPerimeter()) {
            System.out.println("Hình thang 1 có chu vi lớn hơn");
        } else if (trapezoid1.getArea() < trapezoid2.getArea()) {
            System.out.println("Hình thang 2 có chu vi lớn hơn");
        } else {
            System.out.println("Hai hình chu vi bằng nhau");
        }
    }
}