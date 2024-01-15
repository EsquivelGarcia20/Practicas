package Mi_Tamagochi;

public class Elementos {

    private String nombre;
    private int vida = 100;
    private int comer = 30;
    private int limiteJuego = 3;
    private int limiteBano = 2;
    private int limiteComida = 2;
    private int auxiliar = 0;

    public Elementos() {
    }

    public void nombreCriatura() {
        System.out.println("El nombre de tu Tamagochi es: " + getNombre());
        return;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int live) {
        this.vida = live;
    }

    public void estadoTamagochi() {

        System.out.println("El valor actual de la vida es: " + vida);

        if (getVida() == 100) {
            System.out.println("Tu Tamagochi esta vivo");
        } else if (getVida() >= 50) {
            setVida(vida);
            System.out.println("Tu tamagochi tiene ansiedad, por exceso de energía");
        } else if (getVida() < 0) {
            setVida(vida);
            System.out.println("Tu Tamagochi esta muerto");
        }
    }

    public void juegoCriatura() {
        if (auxiliar <= limiteJuego) {
            System.out.println("Quiero seguir jugando");
            vida -= 30;
        } else if (getVida() < 100) {
            setVida(vida);
            System.out.println("Estoy agotado");
        } else if (getVida() == 10) {
            setVida(vida);
            System.out.println("Ya no quiero jugar");
        }
    }

    public void banaCriatura() {
        if (auxiliar < limiteBano) {
            System.out.println("Estoy limpio");
            setVida(vida);
            vida += 10;
        } else if (getVida() < 50) {
            setVida(vida);
            System.out.println("Tengo frio");
            vida -= 40;
        }
    }

    public void comerCriatura() {
        vida += 30;
        if(auxiliar > limiteComida){
            setVida(vida);
            System.out.println("Que rico");
        }else if (getVida() > 100 ){
            setVida(vida);
            System.out.println("Voy a explotar");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getComer() {
        return comer;
    }

    public int getLimiteJuego (){
        return limiteJuego;
    }
}
