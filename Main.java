package Practica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Suma operacion1 = new Suma();
        Resta operacion2 = new Resta();
        Division operacion3 = new Division();
        Multiplicacion operacion4 = new Multiplicacion();

        boolean bandera = true;

        while (bandera) {

            System.out.println("=======================");
            System.out.println("Calculadora");
            System.out.println("Ingrese la operación que desea: ");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- División");
            System.out.println("4.- Multiplicación");
            System.out.println("5.- Salir");

            int opcion = leer.nextInt();

            float numero1;

            switch (opcion) {
                case 1:
                    System.out.println("=======================");
                    System.out.println("Ingrese un número para sumar: ");
                    System.out.println("=======================");
                    numero1 = leer.nextFloat();
                    operacion1.sumar(numero1);
                    operacion1.mostrarResultado();
                    break;
                case 2:
                    System.out.println("=======================");
                    System.out.println("Ingrese el número en la primer posición para restar: ");
                    System.out.println("=======================");
                    numero1 = leer.nextFloat();
                    operacion2.restar(numero1);
                    operacion2.mostrarResultado();
                    break;
                case 3:
                    System.out.println("=======================");
                    System.out.println("Ingrese el número en la primer posición para dividir: ");
                    System.out.println("=======================");
                    numero1 = leer.nextFloat();
                    operacion3.realizarDivision(numero1);
                    operacion3.mostrarResultado();
                    break;
                case 4:
                    System.out.println("=======================");
                    System.out.println("Ingrese un número para multiplicar: ");
                    System.out.println("=======================");
                    numero1 = leer.nextFloat();
                    operacion4.realizarMultiplicar(numero1);
                    operacion4.mostrarResultado();
                    break;
                case 5:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija nuevamente.");
                    break;
            }
        }
    }
}
