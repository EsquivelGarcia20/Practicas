package Practica;

public class Resta extends Datos {

    private float resultado;

    public Resta() {
        this.resultado = 0;
    }

    public float restar(float numero1) {
        return resultado = numero1 -= resultado;
    }

    public void mostrarResultado() {
        System.out.println("El resultado es: " + resultado);
    }
}
