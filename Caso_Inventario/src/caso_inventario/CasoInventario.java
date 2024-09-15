/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso_inventario;

import java.util.Scanner;

/**
 *
 * @author Grey Cedillo
 */
public class CasoInventario {

    
     public static double calcularDescuento(int cantidadProducto) {
        double descuento = 0;

        if (cantidadProducto > 50) {
            descuento = 10;
        } else if (cantidadProducto > 100) {
            descuento = 20;
        } else if (cantidadProducto <= 50) {
            descuento = 0;
        }
        return descuento;
    }

    public static double valorTotalConDescuento(int cantidadProducto, double precioProducto, double descuento) {
        double valorTotalSinDescuento = cantidadProducto * precioProducto;
        return valorTotalSinDescuento - (valorTotalSinDescuento * (descuento / 100));
    }

    public static void resumenProducto(String nombreProducto, int cantidadProducto, double precioProducto, int categoriaProducto) {

        System.out.printf("\nProducto:  %s", nombreProducto);
        System.out.printf("\nCantidad: %d", cantidadProducto);
        System.out.printf("\nPrecio unitario: %.2f%n", precioProducto);
        System.out.printf("Valor total antes de descuentos: %.2f%n", cantidadProducto * precioProducto);
        System.out.printf("Descuento aplicado: %.0f%n", calcularDescuento(cantidadProducto));
        System.out.printf("Valor total despues de descuentos: %.2f%n", valorTotalConDescuento(cantidadProducto, precioProducto, calcularDescuento(cantidadProducto)));

        String mensaje = switch (categoriaProducto) {
            case 1 ->
                "Producto electronico. Revisar garantia.";
            case 2 ->
                "Producto alimenticio. Revisar fecha de caducidad.";
            case 3 ->
                "Producto de ropa. Revisar tallas disponibles.";
            default ->
                "Opcion no valida.";
        };

        System.out.printf(mensaje);
    }
    
    public static void main(String[] args) {
        double totalMontoInventario;
        
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto #1:");
        String nombreProducto1 = lector.nextLine();

        System.out.println("Ingrese la cantidad en inventario del producto #1:");
        int cantidadProducto1 = lector.nextInt();

        System.out.println("Ingrese el precio unitario del producto #1:");
        double precioProducto1 = lector.nextDouble();

        System.out.println("Ingrese la categoria del producto #1 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        int categoriaProducto1 = lector.nextInt();

        resumenProducto(nombreProducto1, cantidadProducto1, precioProducto1, categoriaProducto1);
        lector.nextLine();

        System.out.println("\n\nIngrese el nombre del producto #2:");
        String nombreProducto2 = lector.nextLine();

        System.out.println("Ingrese la cantidad en inventario del producto #2:");
        int cantidadProducto2 = lector.nextInt();

        System.out.println("Ingrese el precio unitario del producto #2:");
        double precioProducto2 = lector.nextDouble();

        System.out.println("Ingrese la categoria del producto #2 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        int categoriaProducto2 = lector.nextInt();

        resumenProducto(nombreProducto2, cantidadProducto2, precioProducto2, categoriaProducto2);
        lector.nextLine();

        System.out.println("\n\nIngrese el nombre del producto #3:");
        String nombreProducto3 = lector.nextLine();

        System.out.println("Ingrese la cantidad en inventario del producto #3:");
        int cantidadProducto3 = lector.nextInt();

        System.out.println("Ingrese el precio unitario del producto #3:");
        double precioProducto3 = lector.nextDouble();

        System.out.println("Ingrese la categoria del producto #3 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        int categoriaProducto3 = lector.nextInt();

        resumenProducto(nombreProducto3, cantidadProducto3, precioProducto3, categoriaProducto3);
        lector.nextLine();

        System.out.println("\n\nIngrese el nombre del producto #4:");
        String nombreProducto4 = lector.nextLine();

        System.out.println("Ingrese la cantidad en inventario del producto #4:");
        int cantidadProducto4 = lector.nextInt();

        System.out.println("Ingrese el precio unitario del producto #4:");
        double precioProducto4 = lector.nextDouble();

        System.out.println("Ingrese la categoria del producto #4 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        int categoriaProducto4 = lector.nextInt();

        resumenProducto(nombreProducto4, cantidadProducto4, precioProducto4, categoriaProducto4);
        lector.nextLine();

        System.out.println("\n\nIngrese el nombre del producto #5:");
        String nombreProducto5 = lector.nextLine();

        System.out.println("Ingrese la cantidad en inventario del producto #5:");
        int cantidadProducto5 = lector.nextInt();

        System.out.println("Ingrese el precio unitario del producto #5:");
        double precioProducto5 = lector.nextDouble();

        System.out.println("Ingrese la categoria del producto #5 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        int categoriaProducto5 = lector.nextInt();

        resumenProducto(nombreProducto5, cantidadProducto5, precioProducto5, categoriaProducto5);
        
        System.out.println("\n\nResumen del inventario:");
        System.out.printf("\n1. %s - Valor total despues de descuentos: %.2f%n", nombreProducto1, valorTotalConDescuento(cantidadProducto1, precioProducto1, calcularDescuento(cantidadProducto1)));
        System.out.printf("2. %s - Valor total despues de descuentos: %.2f%n", nombreProducto2, valorTotalConDescuento(cantidadProducto2, precioProducto2, calcularDescuento(cantidadProducto2)));
        System.out.printf("\n3. %s - Valor total despues de descuentos: %.2f%n", nombreProducto3, valorTotalConDescuento(cantidadProducto3, precioProducto3, calcularDescuento(cantidadProducto3)));
        System.out.printf("4. %s - Valor total despues de descuentos: %.2f%n", nombreProducto4, valorTotalConDescuento(cantidadProducto4, precioProducto4, calcularDescuento(cantidadProducto4)));
        System.out.printf("5. %s - Valor total despues de descuentos: %.2f%n", nombreProducto5, valorTotalConDescuento(cantidadProducto5, precioProducto5, calcularDescuento(cantidadProducto5)));

        totalMontoInventario = valorTotalConDescuento(cantidadProducto1, precioProducto1, calcularDescuento(cantidadProducto1)) + valorTotalConDescuento(cantidadProducto2, precioProducto2, calcularDescuento(cantidadProducto2)) + valorTotalConDescuento(cantidadProducto3, precioProducto3, calcularDescuento(cantidadProducto3)) + valorTotalConDescuento(cantidadProducto4, precioProducto4, calcularDescuento(cantidadProducto4)) + valorTotalConDescuento(cantidadProducto5, precioProducto5, calcularDescuento(cantidadProducto5));

        System.out.printf("\nEl valor total del inventario es: %.2f%n", totalMontoInventario);
        if (totalMontoInventario > 500) {
            System.out.println("\nAtencion: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }
    }
}
