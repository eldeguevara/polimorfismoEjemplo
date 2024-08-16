package org.example;

import org.example.clasesHijo.Leon;
import org.example.clasesHijo.Perro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //instanciar objeto de las clases hijas
        Perro perro = new Perro();
        Leon leon = new Leon();

        //llamar metodo
        perro.emitirSonido();
        leon.emitirSonido();

    }
}