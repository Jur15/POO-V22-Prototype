package poo.demoprototype;

public class Zombi implements Prototipo {

    private int salud, ataque;

    public Zombi(int salud, int ataque) {
        this.salud = salud;
        this.ataque = ataque;
    }

    public Zombi(Zombi prototipo) {
        this.salud = prototipo.salud;
        this.ataque = prototipo.ataque;
    }

    @Override
    public Prototipo clonar() {
        return new Zombi(this);
    }

    public void mostrarDatos() {
        System.out.println("Zombi: Salud:" + salud + ", Ataque:" + ataque);
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
}
