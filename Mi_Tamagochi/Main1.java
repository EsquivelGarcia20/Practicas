package Mi_Tamagochi;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Elementos criatura = new Elementos();

        boolean validacion = true;
        Scanner leer = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println("Bienvenidos, aqui puedes crear tu Tamagochi");
        System.out.println("Ingresa nombre de tu Tamagochi: ");
        String nombre = leer.nextLine();
        criatura.setNombre(nombre);
        System.out.println("*********************************************");
        System.out.println("Su nombre es: " + criatura.getNombre());
        criatura.estadoTamagochi();
        System.out.println("*********************************************");

        while (validacion) {
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1.- Jugar");
            System.out.println("2.- Bañarlo");
            System.out.println("3.- Alimentarlo");

            int seleccion = leer.nextInt();

            switch (seleccion) {
                case 1:
                    criatura.juegoCriatura();
                    criatura.getVida();
                    criatura.estadoTamagochi();
                    break;
                case 2:
                    criatura.banaCriatura();
                    criatura.getVida();
                    criatura.estadoTamagochi();
                    break;

                case 3:
                    criatura.comerCriatura();
                    criatura.getVida();
                    criatura.estadoTamagochi();
                    break;

                default:
                    System.out.println("Valor invalido, vuelva a ingresar una opción del menú");
                    break;
            }
        }
        validacion = false;
    }
}