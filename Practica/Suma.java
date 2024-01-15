package Practica;

public class Suma extends Datos {

    private float resultado;

    public float sumar(float numero1) {
        return resultado += numero1;
    }

    @Override
    public void mostrarResultado() {
        System.out.println("El resultado es: " + resultado);
    }
}
