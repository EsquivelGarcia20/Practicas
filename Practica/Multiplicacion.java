package Practica;

public class Multiplicacion extends Datos {

    private float resultado;

    // Constructor para inicializar resultado con 1
    public Multiplicacion() {
        this.resultado = 1;
    }

    public void realizarMultiplicar(float numero1) {
        resultado = resultado * numero1;
    }

    @Override
    public void mostrarResultado() {
        System.out.println("El resultado es: " + resultado);
    }
}
