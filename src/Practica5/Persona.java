package Practica5;

/**
 * Created by Joshua on 12/10/2016.
 */


public class Persona {
}

class Alumne {

}

class Docent extends Persona implements Treballador{

    @Override
    public void pagaTreballador(Treballador treballador) {

    }
}

class Estudiant extends Alumne{

}

class Becari extends Alumne implements Treballador{

    @Override
    public void pagaTreballador(Treballador treballador) {

    }
}

class Primaria extends Docent{

}

class Secundaria extends Docent{

}

interface Treballador {
    void pagaTreballador(Treballador treballador);
}