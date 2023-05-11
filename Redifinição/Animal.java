package com.mycompany.redefinicao;


public class Animal {
    public void emitirSom(){
        System.out.println("O animal emitiu um som.");
    }
}

class Cachorro extends Animal {
    public void emitirSom(){
        System.out.print("\nO cachorro latiu");
    }
}
class Gato extends Animal {
    public void emitirSom(){
        System.out.println("\nO gato miou.");
    }
}

