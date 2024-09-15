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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto #1:");
        String nombreProducto1 = lector.nextLine();

        System.out.println("Ingrese la cantidad en inventario del producto #1:");
        int cantidadProducto1 = lector.nextInt();

        System.out.println("Ingrese el precio unitario del producto #1:");
        double precioProducto1 = lector.nextDouble();

        System.out.println("Ingrese la categoria del producto #1 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        int categoriaProducto1 = lector.nextInt();

        lector.nextLine();

        System.out.println("\n\nIngrese el nombre del producto #2:");
        String nombreProducto2 = lector.nextLine();

        System.out.println("Ingrese la cantidad en inventario del producto #2:");
        int cantidadProducto2 = lector.nextInt();

        System.out.println("Ingrese el precio unitario del producto #2:");
        double precioProducto2 = lector.nextDouble();

        System.out.println("Ingrese la categoria del producto #2 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        int categoriaProducto2 = lector.nextInt();

        lector.nextLine();

        System.out.println("\n\nIngrese el nombre del producto #3:");
        String nombreProducto3 = lector.nextLine();

        System.out.println("Ingrese la cantidad en inventario del producto #3:");
        int cantidadProducto3 = lector.nextInt();

        System.out.println("Ingrese el precio unitario del producto #3:");
        double precioProducto3 = lector.nextDouble();

        System.out.println("Ingrese la categoria del producto #3 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        int categoriaProducto3 = lector.nextInt();

        lector.nextLine();

        System.out.println("\n\nIngrese el nombre del producto #4:");
        String nombreProducto4 = lector.nextLine();

        System.out.println("Ingrese la cantidad en inventario del producto #4:");
        int cantidadProducto4 = lector.nextInt();

        System.out.println("Ingrese el precio unitario del producto #4:");
        double precioProducto4 = lector.nextDouble();

        System.out.println("Ingrese la categoria del producto #4 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        int categoriaProducto4 = lector.nextInt();

        lector.nextLine();

        System.out.println("\n\nIngrese el nombre del producto #5:");
        String nombreProducto5 = lector.nextLine();

        System.out.println("Ingrese la cantidad en inventario del producto #5:");
        int cantidadProducto5 = lector.nextInt();

        System.out.println("Ingrese el precio unitario del producto #5:");
        double precioProducto5 = lector.nextDouble();

        System.out.println("Ingrese la categoria del producto #5 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        int categoriaProducto5 = lector.nextInt();
    }
    
}
