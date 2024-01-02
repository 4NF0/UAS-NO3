/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapemain;
import java.util.Scanner;
/**
 *
 * @author nm
 */
public class ShapeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("Perhitungan Luas Lingkaran");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan warna lingkaran: ");
        String colorCircle = scanner.nextLine();

        System.out.print("Masukkan radius lingkaran: ");
        double radius = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character in the buffer

        Circle circle = new Circle(colorCircle, radius);

        System.out.println("Luas Lingkaran: " + circle.getArea());

        System.out.println("");

        System.out.println("Perhitungan Luas Persegi Panjang");
        System.out.println("");

        System.out.print("Masukkan warna persegi panjang: ");
        String colorRectangle = scanner.nextLine();

        System.out.print("Masukkan panjang persegi panjang: ");
        double length = scanner.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(colorRectangle, length, width);

        System.out.println("Luas Persegi Panjang: " + rectangle.getArea());

        scanner.close();
    }
    
}
