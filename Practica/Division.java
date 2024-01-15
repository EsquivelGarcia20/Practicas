package Practica;

public class Division extends Datos {

    private float resultado;

    public Division() {
        this.resultado = 0;
    }

    public void realizarDivision(float numero1) {
        resultado = resultado / numero1;
    }

    public float getResultado() {
        return resultado;
    }

    public void mostrarResultado() {
        System.out.println("El resultado es: " + getResultado());
    }

}