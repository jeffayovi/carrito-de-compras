import java.util.Scanner;

/***
 * Autor: Jefferson Ayovi
 * Fecha: 25/09/2025
 *
 * */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String articulo;
        double precio;
        int cantidad;
        double precioTotal;
        char moneda = '$';

        System.out.println("=======================");
        System.out.println("=   Carro de Compra   =");
        System.out.println("=======================");

        System.out.println("¿Qué artículo te gustaría comprar? ");
        articulo = scanner.nextLine();
        System.out.println(" ¿Cuál es el precio de cada uno? ");
        precio = scanner.nextDouble();
        System.out.println("¿Cuántos te gustaría?");
        cantidad = scanner.nextInt();

        precioTotal = precio * cantidad;

        System.out.println("Has comprado "+ cantidad + " " + articulo +"/s");
        System.out.println("Tu total es  "+ moneda +" "+ precioTotal);


        scanner.close();

    }
}