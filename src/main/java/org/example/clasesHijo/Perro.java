package org.example.clasesHijo;

import org.example.clasesPadre.Animal;

public class Perro extends Animal {

    @Override
    public void emitirSonido() {
        System.out.println("GUAGUAGUA...");
    }
}
