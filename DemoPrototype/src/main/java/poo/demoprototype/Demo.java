package poo.demoprototype;

public class Demo {

    public static void main(String[] args) {
        // Crea un registro de prototipos de zombi
        RegistroZombis registro = new RegistroZombis();

        // Crea un par de zombis con valores especificos
        Zombi pequeno = new Zombi(25, 5);
        Zombi normal = new Zombi(50, 10);

        // Guarda los zombis creados en el registro de prototipos.
        // Los guarda con una llave representativa de sus valores.
        registro.agregarPrototipo("pequeño", pequeno);
        registro.agregarPrototipo("normal", normal);

        // Crea unos clones a partir de los prototipos y muestra sus datos
        Zombi clon1 = registro.obtenerZombi("normal");
        Zombi clon2 = registro.obtenerZombi("pequeño");
        clon2.setSalud(15); // Reduce la salud de un zombi
        Zombi clon3 = registro.obtenerZombi("pequeño");

        clon1.mostrarDatos();
        clon2.mostrarDatos();
        clon3.mostrarDatos();

    }
}
