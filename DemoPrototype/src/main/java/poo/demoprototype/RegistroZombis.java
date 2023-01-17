package poo.demoprototype;

import java.util.HashMap;

public class RegistroZombis {

    private HashMap<String, Zombi> listaPrototipos;

    public RegistroZombis() {
        listaPrototipos = new HashMap<>();
    }

    public void agregarPrototipo(String llave, Zombi valor) {
        listaPrototipos.put(llave, valor);
    }

    public Zombi obtenerZombi(String llave) {
        return (Zombi) listaPrototipos.get(llave).clonar();
    }
}
